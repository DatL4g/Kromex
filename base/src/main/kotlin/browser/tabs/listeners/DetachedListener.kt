@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

import browser.tabs.infos.DetachInfos

external interface DetachedListener {
    val tabId: Int
    val detachInfo: DetachInfos
}