@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface DetachInfos {
    var oldWindowId: Int?
    var oldPosition: Int?
}