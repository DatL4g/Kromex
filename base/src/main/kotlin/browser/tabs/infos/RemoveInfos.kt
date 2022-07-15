@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface RemoveInfos {
    /**
     * The window whose tab is closed.
     */
    var windowId: Int?

    /**
     * True when the tab was closed because its parent window was closed.
     */
    var isWindowClosing: Boolean?
}