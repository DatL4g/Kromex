@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * A menu item used by an input method to interact with the user from the language menu.
 */
public external interface MenuItem {
  /**
   * String that will be passed to callbacks referencing this MenuItem.
   */
  public var id: String

  /**
   * Text displayed in the menu for this item.
   */
  public var label: String?

  /**
   * The type of menu item.
   */
  public var style: MenuItemStyle?

  /**
   * Indicates this item is visible.
   */
  public var visible: Boolean?

  /**
   * Indicates this item should be drawn with a check.
   */
  public var checked: Boolean?

  /**
   * Indicates this item is enabled.
   */
  public var enabled: Boolean?
}
