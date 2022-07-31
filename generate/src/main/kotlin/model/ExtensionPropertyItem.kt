package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtensionPropertyItem(
    @SerialName("type") val type: String? = null,
    @SerialName("choices") val choices: List<ExtensionPropertyChoice> = listOf()
)
