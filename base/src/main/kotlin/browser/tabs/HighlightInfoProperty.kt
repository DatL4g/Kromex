@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface HighlightInfoProperty {
  /**
   * The window whose tabs changed.
   */
  public var windowId: Int

  /**
   * All highlighted tabs in the window.
   */
  public var tabIds: Array<Int>
}
