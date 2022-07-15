@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.infos.AttachInfos

external interface AttachedListener {
    val tabId: Int
    val attachInfo: AttachInfos
}