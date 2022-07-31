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
import model.ExtensionFunctionReturn
import model.ReturnInfo

object FunctionGenerator {

    fun create(
        importFileSpec: FileSpec.Builder?,
        typeSpecBuilder: TypeSpec.Builder?,
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) {
        require(importFileSpec != null || typeSpecBuilder != null) {
            "Either file or typeSpec must be provided"
        }

        val returnInfo = getReturnInfo(constructorFileSpec, namespace, extensionFunction)
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
                                constructorFileSpec,
                                propertyName,
                                namespace,
                                null,
                                it.description,
                                it.properties,
                                null,
                                emptyList()
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
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) = create(null, typeSpecBuilder, constructorFileSpec, namespace, extensionFunction)

    fun create(
        importFileSpec: FileSpec.Builder?,
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction,
    ) = create(importFileSpec, null, constructorFileSpec, namespace, extensionFunction)

    private fun getReturnInfo(
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionFunction: ExtensionFunction
    ) = getReturnInfo(
        constructorFileSpec,
        extensionFunction.name,
        namespace,
        extensionFunction.returnsAsync,
        extensionFunction.returns,
        extensionFunction.parameters
    )

    fun getReturnInfo(
        constructorFileSpec: FileSpec.Builder,
        name: String,
        namespace: String,
        returnsAsync: ExtensionFunctionReturn?,
        returns: ExtensionFunctionReturn?,
        parameters: List<ExtensionFunctionParameter>
    ): ReturnInfo {
        val nothing = ClassName("kotlin", "Nothing")
        val hasReturnData = returnsAsync != null || returns != null || parameters.any { it.isCallback }

        if (!hasReturnData) {
            return ReturnInfo(false, nothing, false, null)
        }

        val isPromise = returnsAsync != null
                || (returns != null && returns.isCallback)
                || parameters.any { it.isCallback }

        val returnData = returnsAsync ?: returns

        val returnParam = returnData?.type.getAsClassName(emptyList(), returnData?.optional ?: false) {
            if (returnData!!.properties.isEmpty()) {
                val additionalType = returnData.additionalProperties?.jsonObject?.get("type")?.jsonPrimitive?.content
                additionalType.getAsClassName(emptyList(), returnData.optional) {
                    Any::class.asTypeName()
                } ?: Any::class.asTypeName()
            } else {
                val returnName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                ObjectGenerator.create(
                    constructorFileSpec,
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
                    returnData?.parameters.nullOrEmpty(parameters.findLast { it.isCallback }?.parameters).toList(),
                    onListEmpty = {
                        val callbackParam = parameters.findLast { it.isCallback }

                        if (callbackParam != null) {
                            callbackParam.type.getAsClassName(emptyList(), callbackParam.optional) {
                                val returnName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                                ObjectGenerator.create(
                                    constructorFileSpec,
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
                            val returnName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                            ObjectGenerator.create(
                                constructorFileSpec,
                                returnName,
                                namespace,
                                it
                            )
                            ClassName("browser.${namespace}", returnName)
                        } ?: Any::class.asTypeName()
                    },
                    onMultipleParams = {
                        val returnName = "${name.replaceFirstChar { char -> char.uppercaseChar() }}Return"
                        ObjectGenerator.create(
                            constructorFileSpec,
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
            returnData?.description ?: parameters.findLast { it.isCallback }?.description
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