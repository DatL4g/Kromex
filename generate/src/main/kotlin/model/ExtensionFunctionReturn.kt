package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class ExtensionFunctionReturn(
    @SerialName("name") val name: String? = null,
    @SerialName("parameters") val parameters: List<ExtensionFunctionParameter> = listOf(),
    @SerialName("optional") val optional: Boolean = false,
    @SerialName("description") val description: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null
): PropertiesHolder() {
    val isCallback: Boolean
        get() = name.equals("callback", true) || type.equals("function", true)
}
