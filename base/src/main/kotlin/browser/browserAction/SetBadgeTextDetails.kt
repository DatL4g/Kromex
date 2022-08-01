@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

public external interface SetBadgeTextDetails {
  /**
   * Any number of characters can be passed, but only about four can fit into the space. If an empty
   * string (<code>''</code>) is passed, the badge text is cleared.  If <code>tabId</code> is specified
   * and <code>text</code> is null, the text for the specified tab is cleared and defaults to the
   * global badge text.
   */
  public var text: String?

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
