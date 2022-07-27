package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class ExtensionJson(
    @SerialName("namespace") val namespace: String,
    @SerialName("description") val description: String? = null,
    @SerialName("types") val types: List<ExtensionType> = listOf(),
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("functions") val functions: List<ExtensionFunction> = listOf()
) : PropertiesHolder()
