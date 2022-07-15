@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.Tab
import browser.tabs.infos.ChangeInfos

external interface UpdatedListener {
    val tabId: Int
    val changeInfo: ChangeInfos
    val tab: Tab
}