package generator

import com.squareup.kotlinpoet.FileSpec
import model.ExtensionType

object ExtensionTypeGenerator {

    fun create(
        importFileSpec: FileSpec.Builder,
        constructorFileSpec: FileSpec.Builder,
        namespace: String,
        extensionType: ExtensionType
    ) {
        when {
            extensionType.isArray -> ArrayAliasGenerator.create(
                constructorFileSpec,
                namespace,
                extensionType
            )
            extensionType.isEnum -> EnumGenerator.create(
                namespace,
                extensionType
            )
            else -> {
                if (namespace.equals("events", true)) {
                    if (extensionType.id.equals("Rule", true)) {
                        EventSourceGenerator.createRule()
                    } else if (extensionType.id.equals("Event", true)) {
                        EventSourceGenerator.createEvent()
                    } else {
                        ObjectGenerator.create(
                            namespace,
                            extensionType
                        )
                    }
                } else {
                    ObjectGenerator.create(
                        namespace,
                        extensionType
                    )
                }
            }
        }
    }
}