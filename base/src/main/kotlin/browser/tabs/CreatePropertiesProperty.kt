@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface CreatePropertiesProperty {
  /**
   * The window of the new group. Defaults to the current window.
   */
  public var windowId: Int?
}
