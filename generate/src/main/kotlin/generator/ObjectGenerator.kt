package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.getAsClassName
import common.getFromReference
import common.normalizeNullable
import getAssociatedInstance
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.*
import utils.Constants

object ObjectGenerator {

    fun create(
        name: String,
        namespace: String,
        isInstanceOf: String?,
        description: String?,
        properties: Map<String, ExtensionProperty>,
        additionalProperties: JsonElement?,
        events: List<ExtensionEvent>
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
                includeJs = false
            )

        val typeSpec = if (!isInstanceOf.isNullOrEmpty()) {
            TypeSpec.classBuilder(name)
                .addModifiers(KModifier.ABSTRACT, KModifier.EXTERNAL)
                .addSuperinterface(getAssociatedInstance(isInstanceOf))
        } else {
            TypeSpec.interfaceBuilder(name)
                .addModifiers(KModifier.EXTERNAL)
        }

        typeSpec.apply {
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

        events.forEach {
            EventGenerator.create(null, typeSpec, namespace, it)
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
        extensionType.additionalProperties,
        extensionType.events
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
        extensionFunctionParameter.additionalProperties,
        emptyList()
    )

    fun create(
        name: String,
        namespace: String,
        params: List<ExtensionFunctionParameter>
    ) = create(
        name,
        namespace,
        null,
        null,
        params.associate { it.name to ExtensionProperty(it.type, it.ref, it.description, it.optional, it._properties, it.parameters) },
        null,
        emptyList()
    )

    fun create(
        name: String,
        namespace: String,
        extensionFunctionReturn: ExtensionFunctionReturn
    ) = create(
        name,
        namespace,
        null,
        extensionFunctionReturn.description,
        extensionFunctionReturn.properties,
        extensionFunctionReturn.additionalProperties,
        emptyList()
    )

    fun create(
        name: String,
        namespace: String,
        extensionEvent: ExtensionEvent
    ) = create(
        name,
        namespace,
        null,
        extensionEvent.description,
        extensionEvent.parameters.associate { it.name to ExtensionProperty(it.type, it.ref, it.description, it.optional, it._properties, it.parameters) },
        null,
        emptyList()
    )

    private fun createProperty(
        importFileSpec: FileSpec.Builder?,
        typeSpecBuilder: TypeSpec.Builder?,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) {
        require(importFileSpec != null || typeSpecBuilder != null) {
            "Either file or typeSpec must be provided"
        }

        val typeName = extensionProperty.type.getAsClassName(extensionProperty.choices, extensionProperty.optional) {
            createNestedInterface(
                name,
                namespace,
                extensionProperty
            )
        } ?: extensionProperty.ref.getFromReference(namespace, extensionProperty.optional) ?: run {
            if (extensionProperty.type.equals("function", true)) {
                FunctionGenerator.create(
                    importFileSpec,
                    typeSpecBuilder,
                    namespace,
                    ExtensionFunction(
                        name,
                        extensionProperty.type ?: "function",
                        extensionProperty.description,
                        extensionProperty.parameters,
                        null,
                        null,
                        extensionProperty.deprecated
                    )
                )
                null
            } else if (extensionProperty.type.equals("array", true)) {
                val arrayType = extensionProperty.items?.type.getAsClassName(extensionProperty.items?.choices ?: emptyList(), false) {
                    createNestedInterface(
                        name,
                        namespace,
                        extensionProperty
                    )
                } ?: Any::class.asTypeName()
                Array::class.asTypeName().parameterizedBy(arrayType)
            } else {
                Any::class.asTypeName()
            }
        }?.normalizeNullable(extensionProperty.optional)

        if (typeName != null) {
            val property = PropertySpec.builder(name, typeName, KModifier.EXTERNAL)
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

            importFileSpec?.addProperty(property)
            typeSpecBuilder?.addProperty(property)
        }
    }

    private fun addProperty(
        objectSpecBuilder: TypeSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = createProperty(null, objectSpecBuilder, name, namespace, extensionProperty)

    fun addProperty(
        importFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = createProperty(importFileSpec, null, name, namespace, extensionProperty)

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
                includeJs = false
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