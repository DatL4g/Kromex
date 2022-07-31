import com.squareup.kotlinpoet.*
import common.decodeBase64
import common.emoji
import generator.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import model.*
import org.cuongnv.consoleformatter.ConsoleColors
import org.cuongnv.consoleformatter.ConsoleFormat.color
import utils.ConsoleEmojis
import utils.Constants

fun main(vararg args: String) {

    println(Constants.KROMEX)
    println(Constants.DESCRIPTION)

    println()
    println()
    println("Generating browser JS-Kotlin code".color(ConsoleColors.BLUE_BOLD_BRIGHT))
    println()

    val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Constants.json)
        }
    }

    val sourceList = listOf<String>(
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/events.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/master/chrome/common/extensions/api/browser_action.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/runtime.json?format=TEXT"
    )

    runBlocking {
        sourceList.forEach { source ->
            println()
            println("Retrieving ${source.substringAfterLast('/')}".color(ConsoleColors.CYAN).emoji(ConsoleEmojis.WARNING_SIGN))

            retrieveSource(source, client)
        }
    }
}

private suspend fun retrieveSource(source: String, client: HttpClient) {
    val response = client.get(source)

    if (response.status.isSuccess()) {
        println("Received JSON".color(ConsoleColors.GREEN).emoji(ConsoleEmojis.CHECK_MARK))
    } else {
        println("Could not get JSON: ${response.status.description}".color(ConsoleColors.RED_BOLD).emoji(ConsoleEmojis.CROSS_MARK))
        return
    }

    println("Decoding received JSON".color(ConsoleColors.YELLOW).emoji(ConsoleEmojis.WARNING_SIGN))

    var jsonData = response.bodyAsText().decodeBase64().trim()

    val lines = jsonData.lines().toMutableList()
    val removeLines = lines.mapIndexedNotNull { index, line ->
        if (line.startsWith("//") || line.trim().startsWith("//")) {
            index
        } else {
            null
        }
    }.toMutableList()

    var counter = 0
    while (removeLines.size > 0) {
        lines.removeAt(removeLines[0] - counter)
        counter++
        removeLines.removeAt(0)
    }

    var firstLine = lines.indexOfFirst {
        it.startsWith("[") || it.startsWith("{")
    }

    if (firstLine < 0) {
        firstLine = lines.indexOfFirst {
            it.trim().startsWith("[") || it.trim().startsWith("{")
        }
    }

    if (firstLine < 0) {
        while (!jsonData.startsWith("{") && !jsonData.startsWith("[")) {
            jsonData = jsonData.substringAfter(System.getProperty("line.separator")).trim()
        }
    } else {
        jsonData = lines.toMutableList().apply {
            while (firstLine > 0) {
                removeAt(0)
                firstLine--
            }
        }.joinToString(" ")
    }

    var errorMessage: String = String()
    val jsonDecoded: List<ExtensionJson> = try {
        Constants.json.decodeFromString(jsonData)
    } catch (ignored: Throwable) {
        errorMessage = ignored.message.toString()
        val single: ExtensionJson? = try {
            Constants.json.decodeFromString<ExtensionJson>(jsonData)
        } catch (ignored: Throwable) {
            null
        }
        if (single != null) {
            listOf(single)
        } else {
            emptyList()
        }
    }

    if (jsonDecoded.isNotEmpty()) {
        println("Decoding JSON succeeded".color(ConsoleColors.GREEN).emoji(ConsoleEmojis.CHECK_MARK))
    } else {
        println("Decoding JSON failed: $errorMessage".color(ConsoleColors.RED_BOLD).emoji(ConsoleEmojis.CROSS_MARK))
        return
    }

    jsonDecoded.forEach(::generateFile)
}

private fun generateFile(
    extension: ExtensionJson
) {
    println("Generating files for ${extension.namespace}".color(ConsoleColors.YELLOW).emoji(ConsoleEmojis.WARNING_SIGN))

    val importFileSpec = ImportFileGenerator.create(extension.namespace)
    val constructorFileSpec = ConstructorFileGenerator.create(extension.namespace)

    extension.types.forEachIndexed { index, extensionType ->
        println("Generating files for types: ${index+1}/${extension.types.size}".color(ConsoleColors.YELLOW).emoji(ConsoleEmojis.WARNING_SIGN))

        ExtensionTypeGenerator.create(
            importFileSpec,
            constructorFileSpec,
            extension.namespace,
            extensionType
        )
    }

    if (extension.types.isNotEmpty()) {
        println("Generated files for all types".color(ConsoleColors.GREEN).emoji(ConsoleEmojis.CHECK_MARK))
    }

    extension.properties.entries.forEachIndexed { index, entry ->
        println("Generating properties: ${index+1}/${extension.properties.size}".color(ConsoleColors.YELLOW).emoji(ConsoleEmojis.WARNING_SIGN))

        ObjectGenerator.addProperty(
            importFileSpec,
            constructorFileSpec,
            entry.key,
            extension.namespace,
            entry.value
        )
    }

    if (extension.properties.isNotEmpty()) {
        println("Generated all properties".color(ConsoleColors.GREEN).emoji(ConsoleEmojis.CHECK_MARK))
    }

    extension.functions.forEachIndexed { index, function ->
        println("Generating functions: ${index+1}/${extension.functions.size}".color(ConsoleColors.YELLOW).emoji(ConsoleEmojis.WARNING_SIGN))

        FunctionGenerator.create(
            importFileSpec,
            constructorFileSpec,
            extension.namespace,
            function
        )
    }

    if (extension.functions.isNotEmpty()) {
        println("Generated all functions".color(ConsoleColors.GREEN).emoji(ConsoleEmojis.CHECK_MARK))
    }

    extension.events.forEachIndexed { index, extensionEvent ->
        EventGenerator.create(
            importFileSpec,
            null,
            constructorFileSpec,
            extension.namespace,
            extensionEvent
        )
    }

    importFileSpec.build().writeTo(Constants.outputDir)
    constructorFileSpec.build().writeTo(Constants.outputDir)
}


fun getAssociatedInstance(isInstanceOf: String): TypeName {
    return if (isInstanceOf.equals("ImageData", true)) {
        ClassName("org.w3c.dom", isInstanceOf)
    } else if (isInstanceOf.equals("Window", true)) {
        ClassName("org.w3c.dom", isInstanceOf)
    } else if (isInstanceOf.equals("DirectoryEntry", true)) {
        Any::class.asTypeName()
    } else {
        ClassName("", isInstanceOf)
    }
}

annotation class JsModule(val import: String)
annotation class JsQualifier(val value: String)
