@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.properties

external interface CreateGroupProperties {
    /**
     * The window of the new group. Defaults to the current window.
     */
    var windowId: Int?
}