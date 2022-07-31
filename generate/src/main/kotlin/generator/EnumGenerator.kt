package generator

import com.squareup.kotlinpoet.*
import common.primaryConstructor
import model.ExtensionType
import utils.Constants

object EnumGenerator {
    fun create(
        name: String,
        namespace: String,
        description: String?,
        values: List<String>
    ) {
        val enumFileBuilder = FileSpec.builder("browser.${namespace}", name)

        val typeSpec = TypeSpec.enumBuilder(name)
            .primaryConstructor(
                PropertySpec.builder("value", String::class, KModifier.PRIVATE).build()
            )
            .apply {
                if (!description.isNullOrEmpty()) {
                    addKdoc(description)
                }
                values.forEach {
                    addEnumConstant(
                        it.replace('-', '_'),
                        TypeSpec.anonymousClassBuilder()
                            .addSuperclassConstructorParameter("%S", it)
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