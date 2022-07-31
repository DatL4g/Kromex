import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
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
        // Events first, although order doesn't matter, it's best to create it first
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/events.json?format=TEXT",

        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/accessibility_features.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/accessibility_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/action.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/activity_log_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/app.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/app_view_guest_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/bookmark_manager_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/master/chrome/common/extensions/api/bookmarks.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/master/chrome/common/extensions/api/browser_action.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/browsing_data.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/chrome_web_view_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/chromeos_info_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/command_line_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/commands.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/content_settings.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/context_menus.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/cookies.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/dashboard_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/debugger.json?format=TEXT",
        // "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/declarative_content.json?format=TEXT", invalid enums
        // "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/declarative_web_request.json", invalid enums
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/desktop_capture.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/dom.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/echo_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/enterprise_platform_keys_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/extension.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/extensions_manifest_types.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/master/extensions/common/api/extension_types.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/file_browser_handler.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/file_browser_handler_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/font_settings.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/gcm.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/guest_view_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/history.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/i18n.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/idle.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/incognito.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/input_ime.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/input_method_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/instance_id.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/management.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/manifest_types.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/media_player_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/metrics_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/mime_handler_view_guest_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/omnibox.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/page_action.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/page_capture.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/permissions.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/privacy.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/proxy.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/requirements.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/runtime.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/sessions.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/storage.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/system_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/tab_groups.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/tabs.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/terminal_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/test.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/top_sites.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/tts.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/tts_engine.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/types.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/virtual_keyboard_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/wallpaper.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/web_navigation.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/web_request_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/web_view_internal.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/extensions/common/api/web_view_request.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/webstore_private.json?format=TEXT",
        "https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/webview_tag.json?format=TEXT",

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
    val importFileSpec = ImportFileGenerator.create(extension.namespace)
    val constructorFileSpec = ConstructorFileGenerator.create(extension.namespace)

    extension.types.forEach { extensionType ->
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

    extension.properties.entries.forEach { entry ->

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

    extension.functions.forEach { function ->

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

    extension.events.forEach { extensionEvent ->
        EventGenerator.create(
            importFileSpec,
            null,
            constructorFileSpec,
            extension.namespace,
            extensionEvent
        )
    }

    if (importFileSpec.members.isNotEmpty()) {
        importFileSpec.build().writeTo(Constants.outputDir)
    }

    if (constructorFileSpec.members.isNotEmpty()) {
        constructorFileSpec.build().writeTo(Constants.outputDir)
    }
}


fun getAssociatedInstance(isInstanceOf: String): TypeName {
    return if (isInstanceOf.equals("ImageData", true)) {
        ClassName("org.w3c.dom", isInstanceOf)
    } else if (isInstanceOf.equals("Window", true)) {
        ClassName("org.w3c.dom", isInstanceOf)
    } else if (isInstanceOf.equals("HTMLElement", true)) {
        ClassName("org.w3c.dom", "HTMLElement")
    } else if (isInstanceOf.equals("DirectoryEntry", true)) {
        Any::class.asTypeName()
    } else if (isInstanceOf.equals("Promise", true)) {
        ClassName("kotlin.js", "Promise").parameterizedBy(Any::class.asTypeName())
    } else {
        ClassName("", isInstanceOf)
    }
}

annotation class JsModule(val import: String)
annotation class JsQualifier(val value: String)
