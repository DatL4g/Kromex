@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.details

/**
 * The manifest details of the available update.
 */
external interface UpdateAvailableDetails {

    /**
     * The version number of the available update.
     */
    var version: String?
}