@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

import browser.contextMenus.ItemType
import browser.contextMenus.OnClickData

public external interface ContextMenuCreateProperties {
  /**
   * The type of menu item. Defaults to 'normal' if not specified.
   */
  public var type: ItemType?

  /**
   * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another
   * ID for this extension.
   */
  public var id: String?

  /**
   * The text to be displayed in the item; this is <em>required</em> unless <code>type</code> is
   * 'separator'. When the context is 'selection', you can use <code>
   */
  public var title: String?

  /**
   * The initial state of a checkbox or radio item: true for selected and false for unselected. Only
   * one radio item can be selected at a time in a given group of radio items.
   */
  public var checked: Boolean?

  /**
   * List of contexts this menu item will appear in. Defaults to ['page'] if not specified.
   */
  public var contexts: Array<ContextType>?

  /**
   * The ID of a parent menu item; this makes the item a child of a previously added item.
   */
  public var parentId: Any

  /**
   * Lets you restrict the item to apply only to documents whose URL matches one of the given
   * patterns. (This applies to frames as well.) For details on the format of a pattern, see <a
   * href='match_patterns'>Match Patterns</a>.
   */
  public var documentUrlPatterns: Array<String>?

  /**
   * Similar to documentUrlPatterns, but lets you filter based on the <code>src</code> attribute of
   * img/audio/video tags and the <code>href</code> of anchor tags.
   */
  public var targetUrlPatterns: Array<String>?

  /**
   * Whether this context menu item is enabled or disabled. Defaults to <code>true</code>.
   */
  public var enabled: Boolean?

  /**
   * A function that will be called back when the menu item is clicked.
   *
   * @param info Information about the item clicked and the context where the click happened.
   */
  public fun onclick(info: OnClickData): Nothing
}
