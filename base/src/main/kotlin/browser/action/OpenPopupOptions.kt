@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

public external interface OpenPopupOptions {
  /**
   * The id of the window to open the action popup in. Defaults to the currently-active window if
   * unspecified.
   */
  public var windowId: Int?
}
