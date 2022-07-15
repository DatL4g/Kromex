@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface AttachInfos {
    var newWindowId: Int?
    var newPosition: Int?
}