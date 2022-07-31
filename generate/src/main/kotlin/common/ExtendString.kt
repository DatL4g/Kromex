package common

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import model.ExtensionFunctionParameter
import model.ExtensionPropertyChoice
import org.cuongnv.consoleformatter.ConsoleColors
import org.cuongnv.consoleformatter.ConsoleFormat.color
import java.util.Base64

fun String.decodeBase64(): String {
    return try {
        String(Base64.getDecoder().decode(this))
    } catch (ignored: Throwable) {
        this
    }
}

fun String.emoji(emoji: String) = "$emoji $this"

fun String?.getAsClassName(
    choices: List<ExtensionPropertyChoice>,
    optional: Boolean,
    onIsObject: () -> TypeName
): TypeName? {

    val isInt = this.equals("int", true) || this.equals("integer", true)
    val isNumber = this.equals("number", true)
    val isString = this.equals("string", true)
    val isObject = this.equals("object", true)
    val isChoices = this.isNullOrEmpty() && choices.isNotEmpty()
    val isAny = this.equals("any", true)
    val isBoolean = this.equals("boolean", true) || this.equals("bool", true)
    val isBinary = this.equals("binary", true)

    val typeName = when {
        isAny -> Any::class.asTypeName()
        isInt -> Int::class.asTypeName()
        isNumber -> Number::class.asTypeName()
        isString -> String::class.asTypeName()
        isBoolean -> Boolean::class.asTypeName()
        isBinary -> ClassName("org.w3c.dom", "BinaryType")
        isObject -> onIsObject()
        else -> null
    }?.normalizeNullable(optional)

    return if (isChoices) {
        Any::class.asTypeName()
    } else {
        typeName
    }
}

fun String?.getFromReference(
    namespace: String,
    optional: Boolean
): TypeName? {
    return if (this.isNullOrEmpty()) {
        null
    } else {
        val refSplit = this.split('.')
        val packageName = "browser.${if (refSplit.size == 1) {
            namespace
        } else {
            this.substringBeforeLast('.')
        }}"
        ClassName(packageName, this.substringAfterLast('.')).normalizeNullable(optional)
    }
}

fun String.escapeForKdoc(): String {
    return this.replace("/*", "//").replace("*/", "")
}