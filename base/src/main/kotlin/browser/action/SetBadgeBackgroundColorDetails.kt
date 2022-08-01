@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

public external interface SetBadgeBackgroundColorDetails {
  /**
   * An array of four integers in the range [0,255] that make up the RGBA color of the badge. For
   * example, opaque red is <code>[255, 0, 0, 255]</code>. Can also be a string with a CSS value, with
   * opaque red being <code>#FF0000</code> or <code>#F00</code>.
   */
  public var color: Any

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
