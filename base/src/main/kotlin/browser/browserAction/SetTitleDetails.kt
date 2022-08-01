@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

public external interface SetTitleDetails {
  /**
   * The string the browser action should display when moused over.
   */
  public var title: String

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
