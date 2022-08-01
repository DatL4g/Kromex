@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

public external interface SetTitleDetails {
  /**
   * The string the action should display when moused over.
   */
  public var title: String

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
