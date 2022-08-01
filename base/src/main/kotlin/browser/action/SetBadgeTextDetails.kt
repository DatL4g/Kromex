@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

public external interface SetBadgeTextDetails {
  /**
   * Any number of characters can be passed, but only about four can fit in the space.
   */
  public var text: String

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
