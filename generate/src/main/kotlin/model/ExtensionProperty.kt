package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

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
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null
): PropertiesHolder()
