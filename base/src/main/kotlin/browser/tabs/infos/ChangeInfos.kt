@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

import browser.tabs.TabStatus

/**
 * Lists the changes to the state of the tab that was updated.
 */
external interface ChangeInfos {
    /**
     * The tab's loading status.
     */
    var status: TabStatus?

    /**
     * The tab's URL if it has changed.
     */
    var url: String?

    /**
     * The tab's new group.
     */
    var groupId: Int?

    /**
     * The tab's new pinned state.
     */
    var pinned: Boolean?

    /**
     * The tab's new audible state.
     */
    var audible: Boolean?

    /**
     * The tab's new discarded state.
     */
    var discarded: Boolean?

    /**
     * The tab's new auto-discardable state.
     */
    var autoDiscardable: Boolean?

    /**
     * The tab's new muted state and the reason for the change.
     */
    var mutedInfo: MutedInfos?

    /**
     * The tab's new favicon URL.
     */
    var favIconUrl: String?

    /**
     * The tab's new title.
     */
    var title: String?
}