package common

import com.squareup.kotlinpoet.*

fun TypeSpec.Builder.primaryConstructor(vararg properties: PropertySpec): TypeSpec.Builder {
    val propertySpecs = properties.map { p -> p.toBuilder().initializer(p.name).build() }
    val parameters = propertySpecs.map { ParameterSpec.builder(it.name, it.type).build() }
    val constructor = FunSpec.constructorBuilder()
        .addParameters(parameters)
        .build()

    return this
        .primaryConstructor(constructor)
        .addProperties(propertySpecs)
}

fun TypeName.normalizeNullable(optional: Boolean): TypeName {
    val nothing = ClassName("kotlin", "Nothing")
    return if (this == Void::class.asTypeName() || this == Void::class.asTypeName().copy(nullable = true) || this == nothing.copy(nullable = true)) {
        nothing
    } else {
        this.copy(nullable = optional)
    }
}

fun TypeName.normalizeNothingToUnit(): TypeName {
    val nothing = ClassName("kotlin", "Nothing")
    return if (this == Void::class.asTypeName() || this == Void::class.asTypeName().copy(nullable = true) || this == nothing || this == nothing.copy(nullable = true)) {
        Unit::class.asTypeName()
    } else {
        this
    }.copy(nullable = this.isNullable)
}