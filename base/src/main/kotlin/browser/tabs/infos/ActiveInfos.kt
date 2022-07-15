@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface ActiveInfos {
    /**
     * The ID of the tab that has become active.
     */
    var tabId: Int?

    /**
     * The ID of the window the active tab changed inside of.
     */
    var windowId: Int?
}