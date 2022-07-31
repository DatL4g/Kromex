package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtensionEvent(
    @SerialName("name") val name: String,
    @SerialName("type") val type: String? = "function",
    @SerialName("description") val description: String? = null,
    @SerialName("parameters") val parameters: List<ExtensionFunctionParameter> = listOf(),
    @SerialName("returns") val returns: ExtensionFunctionReturn? = null
)
