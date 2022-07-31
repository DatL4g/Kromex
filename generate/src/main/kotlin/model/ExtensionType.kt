package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement

@Serializable
data class ExtensionType(
    @SerialName("id") val id: String,
    @SerialName("type") val type: String,
    @SerialName("items") val items: JsonElement? = null,
    @SerialName("isInstanceOf") val isInstanceOf: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("events") val events: List<ExtensionEvent> = listOf(),
    @SerialName("enum") val enum: List<String> = listOf(),
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null,
): PropertiesHolder() {

    val isEnum: Boolean
        get() = enum.isNotEmpty()

    val isArray: Boolean
        get() = type.equals("array", true)

}
