@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.infos.MoveInfos

external interface MovedListener {
    val tabId: Int
    val moveInfo: MoveInfos
}