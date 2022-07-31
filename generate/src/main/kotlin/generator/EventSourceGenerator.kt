package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.normalizeNullable
import utils.Constants

object EventSourceGenerator {

    private const val namespace = "events"

    fun createRule(constructorFileSpec: FileSpec.Builder) {
        val ruleFile = FileSpec.builder("browser.${namespace}", "Rule")
            .addAnnotation(AnnotationGenerator.POLYFILL_ANNOTATION)
            .addAnnotation(AnnotationGenerator.QUALIFIER_ANNOTATION(namespace))

        val conditionType = TypeVariableName.invoke("C")
        val actionType = TypeVariableName.invoke("A")

        val ruleInterface = TypeSpec.interfaceBuilder("Rule")
            .addModifiers(KModifier.EXTERNAL)
            .addTypeVariable(conditionType)
            .addTypeVariable(actionType)
            .addKdoc("Description of a declarative rule for handling events.")
            .addProperty(
                PropertySpec.builder("id", String::class.asTypeName().normalizeNullable(true))
                    .mutable()
                    .addKdoc("Optional identifier that allows referencing this rule.")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("tags", Array::class.parameterizedBy(String::class).normalizeNullable(true))
                    .mutable()
                    .addKdoc("Tags can be used to annotate rules and perform operations on sets of rules.")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("conditions", Array::class.asTypeName().parameterizedBy(conditionType))
                    .mutable()
                    .addKdoc("List of conditions that can trigger the actions.")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("actions", Array::class.asTypeName().parameterizedBy(actionType))
                    .mutable()
                    .addKdoc("List of actions that are triggered if one of the conditions is fulfilled.")
                    .build()
            )
            .addProperty(
                PropertySpec.builder("priority", Int::class.asTypeName().normalizeNullable(true))
                    .mutable()
                    .addKdoc("Optional identifier that allows referencing this rule.")
                    .build()
            ).build()

        ruleFile.addType(ruleInterface)
        ruleFile.build().writeTo(Constants.outputDir)

        val ruleLambda = LambdaTypeName.get(
            ClassName("browser.${namespace}", "Rule").parameterizedBy(conditionType, actionType),
            emptyList(),
            Unit::class.asTypeName()
        )

        val ruleConstructor = FunSpec.builder("Rule")
            .addModifiers(KModifier.INLINE)
            .addTypeVariable(conditionType)
            .addTypeVariable(actionType)
            .addParameter(
                ParameterSpec.builder("block", ruleLambda).build()
            )
            .returns(ClassName("browser.${namespace}", "Rule").parameterizedBy(conditionType, actionType))
            .addStatement("return (js(\"{}\") as Rule<C, A>).apply(block)")
            .build()

        constructorFileSpec.addFunction(ruleConstructor)
    }
    
    fun createEvent() {
        val eventFile = FileSpec.builder("browser.${namespace}", "Event")
            .addAnnotation(AnnotationGenerator.POLYFILL_ANNOTATION)
            .addAnnotation(AnnotationGenerator.QUALIFIER_ANNOTATION(namespace))

        val typeType = TypeVariableName.invoke("T")
        val returnType = TypeVariableName.invoke("R")

        val conditionType = TypeVariableName.invoke("C")
        val actionType = TypeVariableName.invoke("A")

        val ruleArrayTypeName = Array::class.asTypeName().parameterizedBy(
            ClassName("browser.${namespace}", "Rule").parameterizedBy(conditionType, actionType)
        )

        val callback = LambdaTypeName.get(
            null,
            listOf(ParameterSpec.unnamed(typeType)),
            returnType
        )

        val rulesCallback = LambdaTypeName.get(
            null,
            listOf(ParameterSpec.Companion.unnamed(ruleArrayTypeName)),
            Unit::class.asTypeName()
        )

        val eventInterface = TypeSpec.interfaceBuilder("Event")
            .addModifiers(KModifier.EXTERNAL)
            .addTypeVariable(typeType)
            .addTypeVariable(returnType)
            .addKdoc("An object which allows the addition and removal of listeners for a Chrome event.")
            .addFunction(
                FunSpec.builder("addListener")
                    .addParameter(
                        ParameterSpec.builder("callback", callback)
                            .addKdoc("Called when an event occurs. The parameters of this function depend on the type of event.")
                            .build()
                    ).addKdoc("Registers an event listener <em>callback</em> to an event.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("addListener")
                    .addParameter(
                        ParameterSpec.builder("callback", callback)
                            .addKdoc("Called when an event occurs. The parameters of this function depend on the type of event.")
                            .build()
                    )
                    .addParameter(
                        "params", Any::class.asTypeName().copy(nullable = true), KModifier.VARARG
                    ).addKdoc("Registers an event listener <em>callback</em> to an event.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("removeListener")
                    .addParameter(
                        ParameterSpec.builder("callback", callback)
                            .addKdoc("Listener that shall be unregistered.")
                            .build()
                    ).addKdoc("Deregisters an event listener <em>callback</em> from an event.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("hasListener")
                    .addParameter(
                        ParameterSpec.builder("callback", callback)
                            .addKdoc("Listener whose registration status shall be tested.")
                            .build()
                    ).returns(Boolean::class, "True if <em>callback</em> is registered to the event.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("hasListeners")
                    .returns(Boolean::class, "True if any event listeners are registered to the event.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("addRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("eventName", String::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Name of the event this function affects.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("webViewInstanceId", Int::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If provided, this is an integer that uniquely identfies the <webview> associated with this function call.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("rules", ruleArrayTypeName)
                            .addKdoc("Rules to be registered. These do not replace previously registered rules.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback.copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Registers rules to handle events.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("addRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("rules", ruleArrayTypeName)
                            .addKdoc("Rules to be registered. These do not replace previously registered rules.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback.copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Registers rules to handle events.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("getRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("eventName", String::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Name of the event this function affects.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("webViewInstanceId", Int::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If provided, this is an integer that uniquely identfies the <webview> associated with this function call.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("ruleIdentifiers", Array::class.parameterizedBy(String::class).copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If an array is passed, only rules with identifiers contained in this array are returned.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback)
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Returns currently registered rules.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("getRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("ruleIdentifiers", Array::class.parameterizedBy(String::class).copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If an array is passed, only rules with identifiers contained in this array are returned.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback)
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Returns currently registered rules.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("removeRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("eventName", String::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Name of the event this function affects.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("webViewInstanceId", Int::class.asTypeName().copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If provided, this is an integer that uniquely identfies the <webview> associated with this function call.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("ruleIdentifiers", Array::class.parameterizedBy(String::class).copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If an array is passed, only rules with identifiers contained in this array are returned.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback.copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Unregisters currently registered rules.")
                    .build()
            )
            .addFunction(
                FunSpec.builder("removeRules")
                    .addTypeVariable(conditionType)
                    .addTypeVariable(actionType)
                    .addParameter(
                        ParameterSpec.builder("ruleIdentifiers", Array::class.parameterizedBy(String::class).copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("If an array is passed, only rules with identifiers contained in this array are returned.")
                            .build()
                    )
                    .addParameter(
                        ParameterSpec.builder("callback", rulesCallback.copy(nullable = true))
                            .defaultValue("definedExternally")
                            .addKdoc("Rules that were registered, the optional parameters are filled with values.")
                            .build()
                    )
                    .addKdoc("Unregisters currently registered rules.")
                    .build()
            )


        eventFile.addType(eventInterface.build())
        eventFile.build().writeTo(Constants.outputDir)
    }
}