@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

import browser.tabs.TabStatus
import browser.windows.WindowType

external interface QueryInfos {
    /**
     * Whether the tabs are active in their windows.
     */
    var active: Boolean?

    /**
     * Whether the tabs are pinned.
     */
    var pinned: Boolean?

    /**
     * Whether the tabs are audible.
     */
    var audible: Boolean?

    /**
     * Whether the tabs are muted.
     */
    var muted: Boolean?

    /**
     * Whether the tabs are highlighted.
     */
    var highlighted: Boolean?

    /**
     * Whether the tabs are discarded.
     * A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip.
     * Its content is reloaded the next time it is activated.
     */
    var discarded: Boolean?

    /**
     * Whether the tabs can be discarded automatically by the browser when resources are low.
     */
    var autoDiscardable: Boolean?

    /**
     * Whether the tabs are in the current window.
     *
     * @see <a href='windows#current-window'>current window</a>
     */
    var currentWindow: Boolean?

    /**
     * Whether the tabs are in the last focused window.
     */
    var lastFocusedWindow: Boolean?

    /**
     * The tab loading status.
     */
    var status: TabStatus?

    /**
     * Match page titles against a pattern.
     * This property is ignored if the extension does not have the tabs permission.
     */
    var title: String?

    /**
     * Match tabs against one or more URL patterns.
     * Fragment identifiers are not matched.
     * This property is ignored if the extension does not have the tabs permission.
     *
     * Either set to string or to array of string
     *
     * @see <a href='match_patterns'>URL patterns</a>
     */
    var url: Any?

    /**
     * The ID of the group that the tabs are in, or tabGroups.TAB_GROUP_ID_NONE for ungrouped tabs.
     */
    var groupId: Int?

    /**
     * The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window.
     *
     * @see <a href='windows#current-window'>current window</a>
     */
    var windowId: Int?

    /**
     * The type of window the tabs are in.
     */
    var windowType: WindowType?

    /**
     * The position of the tabs within their windows.
     */
    var index: Int?
}