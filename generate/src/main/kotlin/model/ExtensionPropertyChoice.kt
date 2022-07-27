package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExtensionPropertyChoice(
    @SerialName("type") val type: String? = null,
    @SerialName("\$ref") val ref: String? = null
)
