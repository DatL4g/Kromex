package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.getAsClassName
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.ExtensionProperty
import model.ExtensionType

object ArrayAliasGenerator {

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        description: String?,
        type: String?,
        properties: Map<String, ExtensionProperty>,
        additionalProperties: JsonElement?
    ) {
        val typeName = type.getAsClassName(emptyList(), false) {
            val propertyName = "${name}AliasProperty"
            ObjectGenerator.create(
                propertyName,
                namespace,
                null,
                description,
                properties,
                additionalProperties
            )
            ClassName("browser.${namespace}", propertyName)
        } ?: Any::class.asTypeName()

        constructorFileSpec.addTypeAlias(
            TypeAliasSpec.builder(name, Array::class.asClassName().parameterizedBy(typeName))
                .apply {
                    if (!description.isNullOrEmpty()) {
                        addKdoc(description)
                    }
                }
                .build()
        )
    }

    fun create(
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionType: ExtensionType
    ) = create(
        constructorFileSpec,
        extensionType.id,
        namespace,
        extensionType.description,
        extensionType.items?.jsonObject?.get("type")?.jsonPrimitive?.content,
        extensionType.properties,
        extensionType.additionalProperties
    )
}