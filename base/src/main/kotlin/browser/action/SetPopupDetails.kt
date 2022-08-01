@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

public external interface SetPopupDetails {
  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?

  /**
   * The relative path to the HTML file to show in a popup. If set to the empty string
   * (<code>''</code>), no popup is shown.
   */
  public var popup: String
}
