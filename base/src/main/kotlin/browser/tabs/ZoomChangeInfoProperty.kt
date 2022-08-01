@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface ZoomChangeInfoProperty {
  public var tabId: Int

  public var oldZoomFactor: Number

  public var newZoomFactor: Number

  public var zoomSettings: ZoomSettings
}
