@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface MoveInfos {
    var windowId: Int?
    var fromIndex: Int?
    var toIndex: Int?
}