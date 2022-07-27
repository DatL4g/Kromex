package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.getAsClassName
import common.getFromReference
import getAssociatedInstance
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.ExtensionFunction
import model.ExtensionFunctionParameter
import model.ExtensionProperty

object FunctionGenerator {

    fun create(
        importFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        description: String?,
        parameters: List<ExtensionFunctionParameter>,
        returnType: String?,
        returnDescription: String?,
        returnOptional: Boolean,
        returnProperties: Map<String, ExtensionProperty>,
        returnParameters: List<ExtensionFunctionParameter>,
        returnAdditionalProperties: JsonElement?,
        isPromise: Boolean
    ) {
        val funSpec = FunSpec.builder(name)
            .addModifiers(KModifier.EXTERNAL)
            .apply {
                if (!description.isNullOrEmpty()) {
                    addKdoc(description)
                }
                parameters.forEach {
                    if (!it.isCallback) {
                        val typeName = it.type.getAsClassName(emptyList(), it.optional) {
                            val propertyName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}${it.name.replaceFirstChar { char -> char.uppercaseChar() }}"

                            ObjectGenerator.create(
                                propertyName,
                                namespace,
                                null,
                                it.description,
                                it.properties,
                                null
                            )

                            ClassName("browser.${namespace}", propertyName)
                        } ?: it.ref.getFromReference(namespace, it.optional) ?: Any::class.asTypeName()

                        addParameter(
                            ParameterSpec.builder(it.name, typeName)
                                .apply {
                                    if (it.optional) {
                                        defaultValue("definedExternally")
                                    }
                                    if (!it.description.isNullOrEmpty()) {
                                        addKdoc(it.description)
                                    }
                                }
                                .build()
                        )
                    }
                }

                val returnTypeName = createReturnType(
                    name,
                    namespace,
                    returnType,
                    returnDescription,
                    returnOptional,
                    returnProperties,
                    returnParameters,
                    returnAdditionalProperties
                )

                if (isPromise) {
                    returns(ClassName("kotlin.js", "Promise").parameterizedBy(returnTypeName))
                } else {
                    returns(returnTypeName)
                }
            }

        importFileSpec.addFunction(funSpec.build())
    }

    fun create(
        importFileSpec: FileSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) = create(
        importFileSpec,
        extensionFunction.name,
        namespace,
        extensionFunction.description,
        extensionFunction.parameters,
        extensionFunction.returnData?.type,
        extensionFunction.returnData?.description,
        extensionFunction.returnData?.optional ?: false,
        extensionFunction.returnData?.properties ?: emptyMap(),
        extensionFunction.returnData?.parameters ?: emptyList(),
        extensionFunction.returnData?.additionalProperties,
        extensionFunction.returnPromise
    )

    private fun createReturnType(
        name: String,
        namespace: String,
        type: String?,
        description: String?,
        optional: Boolean,
        properties: Map<String, ExtensionProperty>,
        parameters: List<ExtensionFunctionParameter>,
        additionalProperties: JsonElement?
    ): TypeName {
        return type.getAsClassName(
            emptyList(),
            optional
        ) {
            /**
            if (`object` is ExtensionFunctionParameter) {
                if (!`object`.isInstanceOf.isNullOrEmpty()) {
                    getAssociatedInstance(`object`.isInstanceOf).copy(nullable = optional)
                } else {
                    null
                }
            } else {
                null
            } ?: if (properties.isEmpty()) {
                val typeData = additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                typeData.getAsClassName(null, emptyList(), emptyList(), optional, namespace) {
                    ClassName("kotlin", "Any").copy(nullable = optional)
                }
            } else {
                val propertyName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"

                ObjectGenerator.create(
                    propertyName,
                    namespace,
                    null,
                    description,
                    properties,
                    additionalProperties
                )

                ClassName("browser.${namespace}", propertyName)
            }
            */
            createReturnTypeFromParameter(
                name, namespace, parameters
            )
        } ?: createReturnTypeFromParameter(
            name, namespace, parameters
        )
    }

    private fun createReturnTypeFromParameter(
        name: String,
        namespace: String,
        parameters: List<ExtensionFunctionParameter>
    ): TypeName {
        return if (parameters.isEmpty()) {
            ClassName("kotlin", "Nothing")
        } else if (parameters.size == 1) {
            parameters[0].type?.getAsClassName(emptyList(), parameters[0].optional) {
                val propertyName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                ObjectGenerator.create(
                    propertyName,
                    namespace,
                    parameters[0]
                )
                ClassName("browser.${namespace}", propertyName)
            } ?: parameters[0].ref.getFromReference(namespace, parameters[0].optional) ?: Any::class.asTypeName()
        } else {
            ClassName("", "ToDoReturnType")
        }
    }
}