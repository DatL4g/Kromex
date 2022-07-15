@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action.details

external interface PopupDetails {
    /**
     * Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.
     */
    var tabId: Int?

    /**
     * The relative path to the HTML file to show in a popup. If set to the empty string (''), no popup is shown.
     */
    var popup: String
}