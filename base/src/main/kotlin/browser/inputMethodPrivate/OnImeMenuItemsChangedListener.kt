@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Fired when the input.ime.setMenuItems or input.ime.updateMenuItems API is called.
 */
public external interface OnImeMenuItemsChangedListener {
  /**
   * ID of the engine to use
   */
  public var engineID: String

  /**
   * MenuItems to add or update.
   */
  public var items: Array<MenuItem>
}
