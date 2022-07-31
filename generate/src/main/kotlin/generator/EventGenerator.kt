package generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import common.normalizeNothingToUnit
import common.normalizeNullable
import model.ExtensionEvent

object EventGenerator {

    fun create(
        importFileSpec: FileSpec.Builder? = null,
        typeSpecBuilder: TypeSpec.Builder? = null,
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        event: ExtensionEvent
    ) {
        require(importFileSpec != null || typeSpecBuilder != null) {
            "File or typeSpec must be non-null"
        }

        val eventClass = ClassName("browser.events", "Event")
        val eventListenerName = "${event.name.replaceFirstChar { char -> char.uppercaseChar() }}Listener"

        ObjectGenerator.create(
            constructorFileSpec,
            eventListenerName,
            namespace,
            event
        )
        val eventListener = ClassName("browser.${namespace}", eventListenerName)

        val returnType = if (event.name.equals("onMessage", true) || event.name.equals("onMessageExternal", true)) {
            Any::class.asTypeName().copy(nullable = true)
        } else {
            val returnInfo = FunctionGenerator.getReturnInfo(
                constructorFileSpec,
                event.name,
                namespace,
                null,
                event.returns,
                event.parameters
            )

            val returnInfoNormalized = returnInfo.returnType.normalizeNothingToUnit()

            if (returnInfo.isPromise) {
                ClassName("kotlin.js", "Promise").parameterizedBy(returnInfoNormalized).normalizeNullable(returnInfo.returnIsOptional)
            } else {
                returnInfoNormalized.normalizeNullable(returnInfo.returnIsOptional)
            }
        }

        val eventSpec = PropertySpec.builder(event.name, eventClass.parameterizedBy(eventListener, returnType))
            .addModifiers(KModifier.EXTERNAL)
            .initializer("definedExternally")
            .apply {
                if (!event.description.isNullOrEmpty()) {
                    addKdoc(event.description)
                }
            }.build()

        typeSpecBuilder?.addProperty(PropertySpec.builder(
            event.name,
            eventClass.parameterizedBy(eventListener, returnType)
        )
            .addModifiers(KModifier.EXTERNAL)
            .apply {
                if (!event.description.isNullOrEmpty()) {
                    addKdoc(event.description)
                }
            }.build()
        )

        importFileSpec?.addProperty(eventSpec)
    }
}