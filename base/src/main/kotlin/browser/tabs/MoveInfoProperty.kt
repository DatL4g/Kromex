@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface MoveInfoProperty {
  public var windowId: Int

  public var fromIndex: Int

  public var toIndex: Int
}
