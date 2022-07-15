@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.extensionTypes

import browser.extensionTypes.details.DeleteInjectDetails
import browser.extensionTypes.details.ImageDetails
import browser.extensionTypes.details.InjectDetails

inline fun ImageDetails(block: ImageDetails.() -> Unit) = (js("{}") as ImageDetails).apply(block)
inline fun InjectDetails(block: InjectDetails.() -> Unit) = (js("{}") as InjectDetails).apply(block)
inline fun DeleteInjectDetails(block: DeleteInjectDetails.() -> Unit) = (js("{}") as DeleteInjectDetails).apply(block)