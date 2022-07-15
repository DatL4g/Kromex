@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action.details

external interface TitleDetails {
    /**
     * The string the browser action should display when moused over.
     */
    var title: String

    /**
     * Limits the change to when a particular tab is selected.
     * Automatically resets when the tab is closed.
     */
    var tabId: Int?
}