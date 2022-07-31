package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.getAsClassName
import common.getFromReference
import common.normalizeNullable
import common.nullOrEmpty
import getAssociatedInstance
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import model.ExtensionFunction
import model.ExtensionFunctionParameter
import model.ReturnInfo

object FunctionGenerator {

    fun create(
        importFileSpec: FileSpec.Builder?,
        typeSpecBuilder: TypeSpec.Builder?,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) {
        require(importFileSpec != null || typeSpecBuilder != null) {
            "Either file or typeSpec must be provided"
        }

        val returnInfo = get(namespace, extensionFunction)
        val name = extensionFunction.name

        val funSpec = FunSpec.builder(name)
            .addModifiers(KModifier.EXTERNAL)
            .apply {
                if (!extensionFunction.description.isNullOrEmpty()) {
                    addKdoc(extensionFunction.description)
                }
                extensionFunction.parameters.forEach {
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

                if (returnInfo.isPromise) {
                    returns(
                        ClassName("kotlin.js", "Promise").parameterizedBy(returnInfo.returnType).normalizeNullable(returnInfo.returnIsOptional),
                        returnInfo.description?.let { CodeBlock.of(it) } ?: CodeBlock.of(String())
                    )
                } else {
                    returns(
                        returnInfo.returnType.normalizeNullable(returnInfo.returnIsOptional),
                        returnInfo.description?.let { CodeBlock.of(it) } ?: CodeBlock.of(String())
                    )
                }
            }.build()

        importFileSpec?.addFunction(funSpec)
        typeSpecBuilder?.addFunction(funSpec)
    }

    fun create(
        typeSpecBuilder: TypeSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) = create(null, typeSpecBuilder, namespace, extensionFunction)

    fun create(
        importFileSpec: FileSpec.Builder?,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) = create(importFileSpec, null, namespace, extensionFunction)

    fun get(
        namespace: String,
        extensionFunction: ExtensionFunction
    ): ReturnInfo {
        val nothing = ClassName("kotlin", "Nothing")
        val hasReturnData = extensionFunction.returnsAsync != null || extensionFunction.returns != null || extensionFunction.parameters.any { it.isCallback }

        if (!hasReturnData) {
            return ReturnInfo(false, nothing, false, null)
        }

        val isPromise = extensionFunction.returnsAsync != null
                || (extensionFunction.returns != null && extensionFunction.returns.isCallback)
                || extensionFunction.parameters.any { it.isCallback }

        val returnData = extensionFunction.returnsAsync ?: extensionFunction.returns

        val returnParam = returnData?.type.getAsClassName(emptyList(), returnData?.optional ?: false) {
            if (returnData!!.properties.isEmpty()) {
                val additionalType = returnData.additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                additionalType.getAsClassName(emptyList(), returnData.optional) {
                    Any::class.asTypeName()
                } ?: Any::class.asTypeName()
            } else {
                val returnName = "${extensionFunction.name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                ObjectGenerator.create(
                    returnName,
                    namespace,
                    returnData
                )
                ClassName("browser.${namespace}", returnName)
            }
        } ?: run {
            val returnRef = returnData?.ref.getFromReference(namespace, returnData?.optional ?: false)

            returnRef ?: run {
                getFromParameters(
                    returnData?.parameters.nullOrEmpty(extensionFunction.parameters.findLast { it.isCallback }?.parameters).toList(),
                    onListEmpty = {
                        val callbackParam = extensionFunction.parameters.findLast { it.isCallback }

                        if (callbackParam != null) {
                            callbackParam.type.getAsClassName(emptyList(), callbackParam.optional) {
                                val returnName = "${extensionFunction.name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                                ObjectGenerator.create(
                                    returnName,
                                    namespace,
                                    callbackParam
                                )
                                ClassName("browser.${namespace}", returnName)
                            } ?: run {
                                callbackParam.ref.getFromReference(namespace, callbackParam.optional) ?: nothing
                            }
                        } else {
                            nothing
                        }
                    },
                    onNoProperties = {
                        it.type.getAsClassName(emptyList(), it.optional) {
                            val additionalType = it.additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                            additionalType.getAsClassName(emptyList(), it.optional) {
                                Any::class.asTypeName()
                            } ?: Any::class.asTypeName()
                        } ?: run {
                            it.ref.getFromReference(namespace, it.optional) ?: Any::class.asTypeName()
                        }
                    },
                    onMultipleProperties = {
                        it.type.getAsClassName(emptyList(), it.optional) {
                            val returnName = "${extensionFunction.name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                            ObjectGenerator.create(returnName, namespace, it)
                            ClassName("browser.${namespace}", returnName)
                        } ?: Any::class.asTypeName()
                    },
                    onMultipleParams = {
                        val returnName = "${extensionFunction.name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                        ObjectGenerator.create(
                            returnName,
                            namespace,
                            it
                        )
                        ClassName("browser.${namespace}", returnName)
                    }
                )
            }
        }

        return ReturnInfo(
            isPromise,
            returnParam,
            returnData?.optional ?: false,
            returnData?.description ?: extensionFunction.parameters.findLast { it.isCallback }?.description
        )
    }

    private fun getFromParameters(
        list: List<ExtensionFunctionParameter>,
        onListEmpty: () -> TypeName,
        onNoProperties: (ExtensionFunctionParameter) -> TypeName,
        onMultipleProperties: (ExtensionFunctionParameter) -> TypeName,
        onMultipleParams: (List<ExtensionFunctionParameter>) -> TypeName
    ): TypeName {
        return if (list.isNotEmpty()) {
            if (list.size == 1) {
                val param = list[0]

                if (param.properties.isEmpty()) {
                    if (!param.isInstanceOf.isNullOrEmpty()) {
                        getAssociatedInstance(param.isInstanceOf).normalizeNullable(param.optional)
                    } else {
                        onNoProperties.invoke(param)
                    }
                } else {
                    onMultipleProperties.invoke(param)
                }
            } else {
                onMultipleParams.invoke(list)
            }
        } else {
            onListEmpty.invoke()
        }
    }
}