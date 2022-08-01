@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * Called when the user selects a menu item
 */
public external interface OnMenuItemActivatedListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String

  /**
   * Name of the MenuItem which was activated
   */
  public var name: String
}
