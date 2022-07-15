@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.details

/**
 * If an update is available, this contains more information about the available update.
 */
external interface RequestUpdateCheckDetails {
    /**
     * The version of the available update.
     */
    val version: String?
}