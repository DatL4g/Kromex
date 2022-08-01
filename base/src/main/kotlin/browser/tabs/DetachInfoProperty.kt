@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface DetachInfoProperty {
  public var oldWindowId: Int

  public var oldPosition: Int
}
