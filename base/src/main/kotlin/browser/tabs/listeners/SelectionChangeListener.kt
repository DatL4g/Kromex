@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.infos.SelectInfos

external interface SelectionChangeListener {
    /**
     * The ID of the tab that has become active.
     */
    val tabId: Int
    val selectInfo: SelectInfos
}