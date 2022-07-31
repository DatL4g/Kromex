package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EnumType(
    @SerialName("name") val name: String,
    @SerialName("description") val description: String? = null
)
