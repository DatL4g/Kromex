@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface HighlightInfos {
    /**
     * The window that contains the tabs.
     */
    var windowId: Int?

    /**
     * One or more tab indices to highlight.
     *
     * Either set it to int or array of int
     */
    var tabs: Any
}