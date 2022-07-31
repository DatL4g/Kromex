package generator

import com.squareup.kotlinpoet.*
import common.escapeForKdoc
import common.primaryConstructor
import model.EnumType
import model.ExtensionType
import utils.Constants

object EnumGenerator {
    fun create(
        name: String,
        namespace: String,
        description: String?,
        values: List<EnumType>
    ) {
        val enumFileBuilder = FileSpec.builder("browser.${namespace}", name)

        val typeSpec = TypeSpec.enumBuilder(if (name.first().isDigit()) "_$name" else name)
            .primaryConstructor(
                PropertySpec.builder("value", String::class, KModifier.PRIVATE).build()
            )
            .apply {
                if (!description.isNullOrEmpty()) {
                    addKdoc(description.escapeForKdoc())
                }
                values.forEach {
                    var constantName = it.name.replace('-', '_').replace("\\s".toRegex(), "_")
                    if (constantName.isEmpty() || constantName.matches("_+".toRegex())) {
                        constantName = "empty"
                    }

                    addEnumConstant(
                        constantName,
                        TypeSpec.anonymousClassBuilder()
                            .addSuperclassConstructorParameter("%S", it.name)
                            .apply {
                                if (!it.description.isNullOrEmpty()) {
                                    addKdoc(it.description.escapeForKdoc())
                                }
                            }
                            .build()
                    )
                }
            }
            .addFunction(
                FunSpec.builder("toString")
                    .addModifiers(KModifier.OVERRIDE)
                    .addStatement("return value")
                    .returns(String::class)
                    .build()
            )

        enumFileBuilder.addType(typeSpec.build())
        enumFileBuilder.build().writeTo(Constants.outputDir)
    }

    fun create(
        namespace: String,
        extensionType: ExtensionType
    ) = create(
        extensionType.id,
        namespace,
        extensionType.description,
        extensionType.enum
    )
}