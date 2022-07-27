package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtensionFunction(
    @SerialName("name") val name: String,
    @SerialName("type") val type: String = "function",
    @SerialName("description") val description: String? = null,
    @SerialName("parameters") val parameters: List<ExtensionFunctionParameter> = listOf(),
    @SerialName("returns") val returns: ExtensionFunctionReturn? = null,
    @SerialName("returns_async") val returnsAsync: ExtensionFunctionReturn? = null,
    @SerialName("deprecated") val deprecated: String? = null
) {
    val returnPromise: Boolean
        get() = returnsAsync != null || (returns != null && returns.isCallback) || parameters.any { it.isCallback }

    val returnData: ExtensionFunctionReturn?
        get() = returns ?: returnsAsync
}
