package generator

import JsModule
import JsQualifier
import com.squareup.kotlinpoet.AnnotationSpec

object AnnotationGenerator {
    val POLYFILL_ANNOTATION = AnnotationSpec.builder(JsModule::class).addMember("%S", "webextension-polyfill").build()
    fun QUALIFIER_ANNOTATION(namespace: String) = AnnotationSpec.builder(JsQualifier::class).addMember("%S", namespace).build()
}