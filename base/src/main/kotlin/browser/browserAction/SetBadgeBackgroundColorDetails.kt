@file:JsModule("webextension-polyfill")
@file:JsQualifier("browserAction")

package browser.browserAction

public external interface SetBadgeBackgroundColorDetails {
  /**
   * An array of four integers in the range 0-255 that make up the RGBA color of the badge. Can also
   * be a string with a CSS hex color value; for example, <code>#FF0000</code> or <code>#F00</code>
   * (red). Renders colors at full opacity.
   */
  public var color: Any

  /**
   * Limits the change to when a particular tab is selected. Automatically resets when the tab is
   * closed.
   */
  public var tabId: Int?
}
