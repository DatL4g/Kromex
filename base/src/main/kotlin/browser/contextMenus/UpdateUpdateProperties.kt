@file:JsModule("webextension-polyfill")
@file:JsQualifier("contextMenus")

package browser.contextMenus

import browser.tabs.Tab

/**
 * The properties to update. Accepts the same values as the $(ref:contextMenus.create) function.
 */
public external interface UpdateUpdateProperties {
  public var type: ItemType?

  public var title: String?

  public var checked: Boolean?

  public var contexts: Array<ContextType>?

  /**
   * Whether the item is visible in the menu.
   */
  public var visible: Boolean?

  /**
   * The ID of the item to be made this item's parent. Note: You cannot set an item to become a
   * child of its own descendant.
   */
  public var parentId: Any

  public var documentUrlPatterns: Array<String>?

  public var targetUrlPatterns: Array<String>?

  public var enabled: Boolean?

  /**
   * @param tab The details of the tab where the click took place. This parameter is not present for
   * platform apps.
   */
  public fun onclick(info: OnClickData, tab: Tab): Nothing
}
