@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.properties

external interface UpdateProperties {
    /**
     * A URL to navigate the tab to.
     * JavaScript URLs are not supported; use scripting.executeScript instead.
     */
    var url: String?

    /**
     * Whether the tab should be active.
     * Does not affect whether the window is focused (see windows.update).
     */
    var active: Boolean?

    /**
     * Adds or removes the tab from the current selection.
     */
    var highlighted: Boolean?

    /**
     * Whether the tab should be selected.
     */
    @Deprecated("Please use highlighted.", level = DeprecationLevel.WARNING)
    var selected: Boolean?

    /**
     * Whether the tab should be pinned.
     */
    var pinned: Boolean?

    /**
     * Whether the tab should be muted.
     */
    var muted: Boolean?

    /**
     * The ID of the tab that opened this tab.
     * If specified, the opener tab must be in the same window as this tab.
     */
    var openerTabId: Int?

    /**
     * Whether the tab should be discarded automatically by the browser when resources are low.
     */
    var autoDiscardable: Boolean?
}