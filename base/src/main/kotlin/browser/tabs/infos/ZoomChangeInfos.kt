@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

import browser.tabs.ZoomSettings

external interface ZoomChangeInfos {
    var tabId: Int?
    var oldZoomFactor: Number?
    var newZoomFactor: Number?
    var zoomSettings: ZoomSettings?
}