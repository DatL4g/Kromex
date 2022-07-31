package generator

import com.squareup.kotlinpoet.FileSpec

object ConstructorFileGenerator {

    fun create(namespace: String): FileSpec.Builder {
        return FileSpec.builder("browser.${namespace}", "Constructor")
            .addKotlinDefaultImports(
                includeJvm = false,
                includeJs = false
            )
    }
}