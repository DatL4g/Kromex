package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class ExtensionPropertyItem(
    @SerialName("type") val type: String? = null,
    @SerialName("choices") val choices: List<ExtensionPropertyChoice> = listOf(),
    @SerialName("\$ref") val ref: String? = null,
    @SerialName("properties") override val _properties: JsonElement? = null,
): PropertiesHolder()
