package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import utils.Constants

@Serializable
data class ExtensionType(
    @SerialName("id") val id: String,
    @SerialName("type") val type: String? = null,
    @SerialName("items") val items: JsonElement? = null,
    @SerialName("isInstanceOf") val isInstanceOf: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("properties") override val _properties: JsonElement? = null,
    @SerialName("events") val events: List<ExtensionEvent> = listOf(),
    @SerialName("enum") protected val _enum: JsonElement? = null, // ToDo("either string or object") https://chromium.googlesource.com/chromium/src/+/refs/heads/main/chrome/common/extensions/api/dashboard_private.json
    @SerialName("additionalProperties") val additionalProperties: JsonElement? = null,
    @SerialName("functions") val functions: List<ExtensionFunction> = listOf(),
    @SerialName("choices") val choices: List<ExtensionPropertyChoice> = listOf()
): PropertiesHolder() {

    val isEnum: Boolean
        get() = _enum != null

    val enum: List<EnumType>
        get() {
            if (_enum == null) {
                return emptyList()
            }
            return try {
                Constants.json.decodeFromJsonElement<List<EnumType>>(_enum)
            } catch (ignored: Throwable) {
                Constants.json.decodeFromJsonElement<List<String>>(_enum).map { EnumType(it) }
            }
        }

    val isArray: Boolean
        get() = type.equals("array", true)

}
