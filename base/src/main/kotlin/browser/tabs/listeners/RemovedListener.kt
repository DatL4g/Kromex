@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.infos.RemoveInfos

external interface RemovedListener {
    val tabId: Int
    val removeInfo: RemoveInfos
}