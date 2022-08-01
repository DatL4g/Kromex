@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeWebViewInternal")

package browser.chromeWebViewInternal

import browser.contextMenus.ContextType
import browser.contextMenus.ItemType

/**
 * The properties to update. Accepts the same values as the create function.
 */
public external interface ContextMenusUpdateUpdateProperties {
  public var type: ItemType?

  public var title: String?

  public var checked: Boolean?

  /**
   * List of contexts this menu item will appear in. Defaults to ['page'] if not specified.
   */
  public var contexts: Array<ContextType>?

  /**
   * Whether the item is visible in the menu.
   */
  public var visible: Boolean?

  /**
   * Note: You cannot change an item to be a child of one of its own descendants.
   */
  public var parentId: Any

  public var documentUrlPatterns: Array<String>?

  public var targetUrlPatterns: Array<String>?

  public var enabled: Boolean?

  public fun onclick(): Nothing
}
