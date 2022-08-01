@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface AttachInfoProperty {
  public var newWindowId: Int

  public var newPosition: Int
}
