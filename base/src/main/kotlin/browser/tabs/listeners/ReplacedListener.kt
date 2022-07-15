@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.listeners

external interface ReplacedListener {
    val addedTabId: Int
    val removedTabId: Int
}