@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

import browser.tabs.infos.MutedInfos

external interface Tab {
    /**
     * The ID of the tab. Tab IDs are unique within a browser session.
     * Under some circumstances a tab may not be assigned an ID; for example, when querying foreign tabs using the sessions API, in which case a session ID may be present.
     * Tab ID can also be set to [TAB_ID_NONE] for apps and devtools windows.
     */
    var id: Int?

    /**
     * The zero-based index of the tab within its window.
     */
    var index: Int

    /**
     * The ID of the group that the tab belongs to.
     */
    var groupId: Int

    /**
     * The ID of the window that contains the tab.
     */
    var windowId: Int

    /**
     * The ID of the tab that opened this tab, if any.
     * This property is only present if the opener tab still exists.
     */
    var openerTabId: Int?

    /**
     * Whether the tab is selected.
     */
    @Deprecated("Please use highlighted", level = DeprecationLevel.WARNING)
    var selected: Boolean

    /**
     * Whether the tab is highlighted.
     */
    var highlighted: Boolean

    /**
     * Whether the tab is active in its window.
     * Does not necessarily mean the window is focused.
     */
    var active: Boolean

    /**
     * Whether the tab is pinned.
     */
    var pinned: Boolean

    /**
     * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted).
     * Equivalent to whether the 'speaker audio' indicator is showing.
     */
    var audible: Boolean?

    /**
     * Whether the tab is discarded.
     * A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip.
     * Its content is reloaded the next time it is activated.
     */
    var discarded: Boolean

    /**
     * Whether the tab can be discarded automatically by the browser when resources are low.
     */
    var autoDiscardable: Boolean

    /**
     * The tab's muted state and the reason for the last state change.
     */
    var mutedInfo: MutedInfos?

    /**
     * The last committed URL of the main frame of the tab.
     * This property is only present if the extension's manifest includes the tabs permission and may be an empty string if the tab has not yet committed.
     *
     * @see pendingUrl
     */
    var url: String?

    /**
     * The URL the tab is navigating to, before it has committed.
     * This property is only present if the extension's manifest includes the tabs permission and there is a pending navigation.
     */
    var pendingUrl: String?

    /**
     * The title of the tab.
     * This property is only present if the extension's manifest includes the tabs permission.
     */
    var title: String?

    /**
     * The URL of the tab's favicon.
     * This property is only present if the extension's manifest includes the tabs permission.
     * It may also be an empty string if the tab is loading.
     */
    var favIconUrl: String?

    /**
     * The tab's loading status.
     */
    var status: TabStatus?

    /**
     * Whether the tab is in an incognito window.
     */
    var incognito: Boolean

    /**
     * The width of the tab in pixels.
     */
    var width: Int?

    /**
     * The height of the tab in pixels.
     */
    var height: Int?

    /**
     * The session ID used to uniquely identify a tab obtained from the sessions API.
     */
    var sessionId: String?
}