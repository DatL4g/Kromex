package generator

import com.squareup.kotlinpoet.*
import common.getAsClassName
import common.getFromReference
import getAssociatedInstance
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.ExtensionFunctionParameter
import model.ExtensionProperty
import model.ExtensionType
import utils.Constants

object ObjectGenerator {

    fun create(
        name: String,
        namespace: String,
        isInstanceOf: String?,
        description: String?,
        properties: Map<String, ExtensionProperty>,
        additionalProperties: JsonElement?
    ) {
        val objectFileBuilder = FileSpec.builder("browser.${namespace}", name)
            .addAnnotation(
                AnnotationGenerator.POLYFILL_ANNOTATION
            )
            .addAnnotation(
                AnnotationGenerator.QUALIFIER_ANNOTATION(namespace)
            )
            .addKotlinDefaultImports(
                includeJvm = false,
                includeJs = true
            )

        val typeSpec = TypeSpec.interfaceBuilder(name)
            .addModifiers(KModifier.EXTERNAL)
            .apply {
                if (!isInstanceOf.isNullOrEmpty()) {
                    addSuperinterface(getAssociatedInstance(isInstanceOf))
                }
                if (!description.isNullOrEmpty()) {
                    addKdoc(description)
                }
                if (properties.isEmpty() && isInstanceOf.isNullOrEmpty()) {
                    val typeData = additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                    val typeName = typeData.getAsClassName(emptyList(), false) {
                        Any::class.asTypeName()
                    } ?: Any::class.asTypeName()
                    addSuperinterface(typeName)
                } else {
                    properties.forEach { (t, u) ->
                        addProperty(
                            this,
                            t,
                            namespace,
                            u
                        )
                    }
                }
            }

        objectFileBuilder.addType(typeSpec.build())
        objectFileBuilder.build().writeTo(Constants.outputDir)
    }

    fun create(
        namespace: String,
        extensionType: ExtensionType
    ) = create(
        extensionType.id,
        namespace,
        extensionType.isInstanceOf,
        extensionType.description,
        extensionType.properties,
        extensionType.additionalProperties
    )

    fun create(
        name: String,
        namespace: String,
        extensionFunctionParameter: ExtensionFunctionParameter
    ) = create(
        name,
        namespace,
        extensionFunctionParameter.isInstanceOf,
        extensionFunctionParameter.description,
        extensionFunctionParameter.properties,
        extensionFunctionParameter.additionalProperties
    )

    private fun createProperty(
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ): PropertySpec {
        val typeName = extensionProperty.type.getAsClassName(extensionProperty.choices, extensionProperty.optional) {
            createNestedInterface(
                name,
                namespace,
                extensionProperty
            )
        } ?: extensionProperty.ref.getFromReference(namespace, extensionProperty.optional) ?: Any::class.asTypeName()

        return PropertySpec.builder(name, typeName, KModifier.EXTERNAL)
            .apply {
                if (!extensionProperty.description.isNullOrEmpty()) {
                    addKdoc(extensionProperty.description)
                }
                if (!extensionProperty.deprecated.isNullOrEmpty()) {
                    addAnnotation(
                        AnnotationSpec.builder(Deprecated::class)
                            .addMember("message = %S", extensionProperty.deprecated)
                            .addMember("level = %M", DeprecationLevel.WARNING)
                            .build()
                    )
                }
            }.build()
    }

    private fun addProperty(
        objectSpecBuilder: TypeSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = objectSpecBuilder.addProperty(createProperty(name, namespace, extensionProperty))

    fun addProperty(
        importFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = importFileSpec.addProperty(createProperty(name, namespace, extensionProperty))

    private fun createNestedInterface(
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ): TypeName {
        val packageName = "browser.${namespace}"
        val className = "${name.replaceFirstChar { name.first().uppercaseChar() }}Property"

        val propertyClass = ClassName(packageName, className)
        val propertyFileSpec = FileSpec.builder(packageName, className)
            .addAnnotation(AnnotationGenerator.POLYFILL_ANNOTATION)
            .addAnnotation(AnnotationGenerator.QUALIFIER_ANNOTATION(namespace))
            .addKotlinDefaultImports(
                includeJvm = false,
                includeJs = true
            )

        val propertyTypeSpec = TypeSpec.interfaceBuilder(propertyClass)
            .addModifiers(KModifier.EXTERNAL)
            .apply {
                extensionProperty.properties.forEach { (t, u) ->
                    addProperty(
                        this,
                        t,
                        namespace,
                        u
                    )
                }
            }.build()

        propertyFileSpec.addType(propertyTypeSpec)
        propertyFileSpec.build().writeTo(Constants.outputDir)

        return propertyClass
    }
}