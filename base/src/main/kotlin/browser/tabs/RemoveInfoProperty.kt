@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface RemoveInfoProperty {
  /**
   * The window whose tab is closed.
   */
  public var windowId: Int

  /**
   * True when the tab was closed because its parent window was closed.
   */
  public var isWindowClosing: Boolean
}
