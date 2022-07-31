package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class ExtensionFunctionParameter(
    @SerialName("name") val name: String,
    @SerialName("type") val type: String? = null,
    @SerialName("\$ref") val ref: String? = null,
    @SerialName("isInstanceOf") val isInstanceOf: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("optional") val optional: Boolean = false,
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null,
    @SerialName("parameters") val parameters: List<ExtensionFunctionParameter> = listOf(),
    @SerialName("items") val items: ExtensionPropertyItem? = null
): PropertiesHolder() {
    val isCallback: Boolean
        get() = name.equals("callback", true) || type.equals("function", true)
}
