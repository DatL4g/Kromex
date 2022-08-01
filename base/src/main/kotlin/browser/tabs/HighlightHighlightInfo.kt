@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface HighlightHighlightInfo {
  /**
   * The window that contains the tabs.
   */
  public var windowId: Int?

  /**
   * One or more tab indices to highlight.
   */
  public var tabs: Any
}
