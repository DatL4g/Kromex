@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

import browser.tabs.MutedInfoReason

/**
 * The tab's muted state and the reason for the last state change.
 */
external interface MutedInfos {
    /**
     * Whether the tab is muted (prevented from playing sound).
     * The tab may be muted even if it has not played or is not currently playing sound.
     * Equivalent to whether the 'muted' audio indicator is showing.
     */
    var muted: Boolean

    /**
     * The reason the tab was muted or unmuted.
     * Not set if the tab's mute state has never been changed.
     */
    var reason: MutedInfoReason?

    /**
     * The ID of the extension that changed the muted state.
     * Not set if an extension was not the reason the muted state last changed.
     */
    var extensionId: String?
}