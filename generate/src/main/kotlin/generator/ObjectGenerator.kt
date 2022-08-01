package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.*
import getAssociatedInstance
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.*
import utils.Constants

object ObjectGenerator {

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        isInstanceOf: String?,
        description: String?,
        properties: Map<String, ExtensionProperty>,
        additionalProperties: JsonElement?,
        events: List<ExtensionEvent>,
        functions: List<ExtensionFunction>,
        choices: List<ExtensionPropertyChoice>
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
        } else if (isInstanceOf.isNullOrEmpty() && choices.isNotEmpty()) {
            TypeSpec.classBuilder(name)
                .addModifiers(KModifier.ABSTRACT, KModifier.EXTERNAL)
                .addSuperinterface(Any::class)
        } else if (additionalProperties != null) {
            val typeData = additionalProperties.jsonObject["type"]?.jsonPrimitive?.content
            val typeName = typeData.getAsClassName(emptyList(), false) {
                Any::class.asTypeName()
            } ?: Any::class.asTypeName()

            TypeSpec.classBuilder(name)
                .addModifiers(KModifier.ABSTRACT, KModifier.EXTERNAL)
                .addSuperinterface(typeName)
        } else {
            TypeSpec.interfaceBuilder(name)
                .addModifiers(KModifier.EXTERNAL)
        }

        typeSpec.apply {
            if (!description.isNullOrEmpty()) {
                addKdoc(description.escapeForKdoc())
            }
            properties.forEach { (t, u) ->
                addProperty(
                    this,
                    constructorFileSpec,
                    t,
                    namespace,
                    u
                )
            }
        }

        functions.forEach {
            FunctionGenerator.create(null, typeSpec, constructorFileSpec, namespace, it)
        }

        events.forEach {
            EventGenerator.create(null, typeSpec, constructorFileSpec, namespace, it)
        }

        val objectClass = ClassName("browser.${namespace}", name)
        val objectConstructor = FunSpec.builder(name)
            .addModifiers(KModifier.INLINE)
            .addParameter(
                ParameterSpec.builder("block", LambdaTypeName.get(
                    objectClass,
                    emptyList(),
                    Unit::class.asTypeName()
                )).build()
            )
            .returns(objectClass)
            .addStatement("return (js(\"{}\") as %T).apply(block)", objectClass)
            .build()

        objectFileBuilder.addType(typeSpec.build())
        objectFileBuilder.build().writeTo(Constants.outputDir)

        if (!constructorFileSpec.members.any {
            (it as? FunSpec?)?.name?.equals(objectConstructor.name) == true
        }) {
            constructorFileSpec.addFunction(objectConstructor)
        }
    }

    fun create(
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionType: ExtensionType
    ) = create(
        constructorFileSpec,
        extensionType.id,
        namespace,
        extensionType.isInstanceOf,
        extensionType.description,
        extensionType.properties,
        extensionType.additionalProperties,
        extensionType.events,
        extensionType.functions,
        extensionType.choices
    )

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionFunctionParameter: ExtensionFunctionParameter
    ) = create(
        constructorFileSpec,
        name,
        namespace,
        extensionFunctionParameter.isInstanceOf,
        extensionFunctionParameter.description,
        extensionFunctionParameter.properties,
        extensionFunctionParameter.additionalProperties,
        emptyList(),
        emptyList(),
        emptyList()
    )

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        params: List<ExtensionFunctionParameter>
    ) = create(
        constructorFileSpec,
        name,
        namespace,
        null,
        null,
        params.associate { it.name to ExtensionProperty(it.type, it.ref, it.description, it.optional, it._properties, it.parameters) },
        null,
        emptyList(),
        emptyList(),
        emptyList()
    )

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionFunctionReturn: ExtensionFunctionReturn
    ) = create(
        constructorFileSpec,
        name,
        namespace,
        null,
        extensionFunctionReturn.description,
        extensionFunctionReturn.properties,
        extensionFunctionReturn.additionalProperties,
        emptyList(),
        emptyList(),
        emptyList()
    )

    fun create(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionEvent: ExtensionEvent
    ) = create(
        constructorFileSpec,
        name,
        namespace,
        null,
        extensionEvent.description,
        extensionEvent.parameters.associate {
            it.name to ExtensionProperty(
                it.type,
                it.ref,
                it.description,
                it.optional,
                it._properties,
                it.parameters,
                null,
                emptyList(),
                it.items,
                it.additionalProperties
            )
        },
        null,
        emptyList(),
        emptyList(),
        emptyList()
    )

    private fun createProperty(
        importFileSpec: FileSpec.Builder?,
        typeSpecBuilder: TypeSpec.Builder?,
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) {
        require(importFileSpec != null || typeSpecBuilder != null) {
            "Either file or typeSpec must be provided"
        }

        val typeName = extensionProperty.type.getAsClassName(extensionProperty.choices, extensionProperty.optional) {
            if (extensionProperty.properties.isNotEmpty()) {
                createNestedInterface(
                    constructorFileSpec,
                    name,
                    namespace,
                    extensionProperty.properties
                )
            } else {
                val typeData = extensionProperty.additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                typeData.getAsClassName(emptyList(), false) {
                    Any::class.asTypeName()
                } ?: Any::class.asTypeName()
            }
        } ?: extensionProperty.ref.getFromReference(namespace, extensionProperty.optional) ?: run {
            if (extensionProperty.type.equals("function", true)) {
                FunctionGenerator.create(
                    importFileSpec,
                    typeSpecBuilder,
                    constructorFileSpec,
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
                        constructorFileSpec,
                        name,
                        namespace,
                        extensionProperty.properties.nullOrEmpty(extensionProperty.items?.properties)
                    )
                } ?: run {
                    extensionProperty.items?.ref.getFromReference(namespace, false) ?: Any::class.asTypeName()
                }
                Array::class.asTypeName().parameterizedBy(arrayType)
            } else {
                extensionProperty.guessTypeByValue() ?: Any::class.asTypeName()
            }
        }?.normalizeNullable(extensionProperty.optional)

        if (typeName != null) {
            val typeSpecProperty = PropertySpec.builder(name, typeName, KModifier.EXTERNAL)
                .mutable()
                .apply {
                    if (!extensionProperty.description.isNullOrEmpty()) {
                        try {
                            addKdoc(extensionProperty.description.escapeForKdoc())
                        } catch (ignored: Throwable) { }
                    }
                    if (!extensionProperty.deprecated.isNullOrEmpty()) {
                        addAnnotation(
                            AnnotationSpec.builder(Deprecated::class)
                                .addMember("message = %S", extensionProperty.deprecated)
                                .addMember("level = DeprecationLevel.WARNING")
                                .build()
                        )
                    }
                }.build()

            typeSpecBuilder?.addProperty(typeSpecProperty)

            importFileSpec?.addProperty(PropertySpec.builder(name, typeName, KModifier.EXTERNAL)
                .initializer("definedExternally")
                .apply {
                    if (!extensionProperty.description.isNullOrEmpty()) {
                        try {
                            addKdoc(extensionProperty.description.escapeForKdoc())
                        } catch (ignored: Throwable) { }
                    }
                    if (!extensionProperty.deprecated.isNullOrEmpty()) {
                        addAnnotation(
                            AnnotationSpec.builder(Deprecated::class)
                                .addMember("message = %S", extensionProperty.deprecated)
                                .addMember("level = DeprecationLevel.WARNING")
                                .build()
                        )
                    }
                }.build())
        }
    }

    private fun addProperty(
        objectSpecBuilder: TypeSpec.Builder,
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = createProperty(null, objectSpecBuilder, constructorFileSpec, name, namespace, extensionProperty)

    fun addProperty(
        importFileSpec: FileSpec.Builder,
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        extensionProperty: ExtensionProperty
    ) = createProperty(importFileSpec, null, constructorFileSpec, name, namespace, extensionProperty)

    private fun createNestedInterface(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        properties: Map<String, ExtensionProperty>
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
                properties.forEach { (t, u) ->
                    addProperty(
                        this,
                        constructorFileSpec,
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