@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface MoveMoveProperties {
  /**
   * Defaults to the window the tab is currently in.
   */
  public var windowId: Int?

  /**
   * The position to move the window to. Use <code>-1</code> to place the tab at the end of the
   * window.
   */
  public var index: Int
}
