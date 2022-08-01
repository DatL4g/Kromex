@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.extensionTypes

public inline fun ImageDetails(block: ImageDetails.() -> Unit): ImageDetails = (js("{}") as
    ImageDetails).apply(block)

public inline fun InjectDetails(block: InjectDetails.() -> Unit): InjectDetails = (js("{}") as
    InjectDetails).apply(block)

public inline fun DeleteInjectionDetails(block: DeleteInjectionDetails.() -> Unit):
    DeleteInjectionDetails = (js("{}") as DeleteInjectionDetails).apply(block)
