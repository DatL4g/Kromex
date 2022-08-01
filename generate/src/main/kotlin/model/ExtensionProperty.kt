package model

import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.*

@Serializable
data class ExtensionProperty(
    @SerialName("type") val type: String? = null,
    @SerialName("\$ref") val ref: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("optional") val optional: Boolean = false,
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("parameters") val parameters: List<ExtensionFunctionParameter> = listOf(),
    @SerialName("deprecated") val deprecated: String? = null,
    @SerialName("choices") val choices: List<ExtensionPropertyChoice> = listOf(),
    @SerialName("items") val items: ExtensionPropertyItem? = null,
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null,
    @SerialName("value") val value: JsonElement? = null
): PropertiesHolder() {

    fun guessTypeByValue(): TypeName? {
        val isNumber = value?.jsonPrimitive?.longOrNull != null || value?.jsonPrimitive?.doubleOrNull != null || value?.jsonPrimitive?.floatOrNull != null || value?.jsonPrimitive?.intOrNull != null
        val isString = value?.jsonPrimitive?.isString == true
        val isBoolean = value?.jsonPrimitive?.booleanOrNull != null

        return when {
            isNumber -> Number::class.asTypeName()
            isString -> String::class.asTypeName()
            isBoolean -> Boolean::class.asTypeName()
            else -> null
        }
    }
}
