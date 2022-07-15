@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface SelectInfos {
    /**
     * The ID of the window the selected tab changed inside of.
     */
    var windowId: Int?
}