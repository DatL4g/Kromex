package model

import com.squareup.kotlinpoet.TypeName

data class ReturnInfo(
    val isPromise: Boolean,
    val returnType: TypeName,
    val returnIsOptional: Boolean,
    val description: String?
)
