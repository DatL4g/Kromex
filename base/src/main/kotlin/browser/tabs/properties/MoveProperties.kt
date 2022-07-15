@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.properties

external interface MoveProperties {
    /**
     * Defaults to the window the tab is currently in.
     */
    var windowId: Int?

    /**
     * The position to move the window to.
     * Use -1 to place the tab at the end of the window.
     */
    var index: Int?
}