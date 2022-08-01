@file:JsModule("webextension-polyfill")
@file:JsQualifier("contextMenus")

package browser.contextMenus

import browser.tabs.Tab

public external interface CreateCreateProperties {
  /**
   * The type of menu item. Defaults to <code>normal</code>.
   */
  public var type: ItemType?

  /**
   * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another
   * ID for this extension.
   */
  public var id: String?

  /**
   * The text to display in the item; this is <em>required</em> unless <code>type</code> is
   * <code>separator</code>. When the context is <code>selection</code>, use <code>
   */
  public var title: String?

  /**
   * The initial state of a checkbox or radio button: <code>true</code> for selected,
   * <code>false</code> for unselected. Only one radio button can be selected at a time in a given
   * group.
   */
  public var checked: Boolean?

  /**
   * List of contexts this menu item will appear in. Defaults to <code>['page']</code>.
   */
  public var contexts: Array<ContextType>?

  /**
   * Whether the item is visible in the menu.
   */
  public var visible: Boolean?

  /**
   * The ID of a parent menu item; this makes the item a child of a previously added item.
   */
  public var parentId: Any

  /**
   * Restricts the item to apply only to documents or frames whose URL matches one of the given
   * patterns. For details on pattern formats, see <a href='match_patterns'>Match Patterns</a>.
   */
  public var documentUrlPatterns: Array<String>?

  /**
   * Similar to <code>documentUrlPatterns</code>, filters based on the <code>src</code> attribute of
   * <code>img</code>, <code>audio</code>, and <code>video</code> tags and the <code>href</code>
   * attribute of <code>a</code> tags.
   */
  public var targetUrlPatterns: Array<String>?

  /**
   * Whether this context menu item is enabled or disabled. Defaults to <code>true</code>.
   */
  public var enabled: Boolean?

  /**
   * A function that is called back when the menu item is clicked. Event pages cannot use this;
   * instead, they should register a listener for $(ref:contextMenus.onClicked).
   *
   * @param info Information about the item clicked and the context where the click happened.
   * @param tab The details of the tab where the click took place. This parameter is not present for
   * platform apps.
   */
  public fun onclick(info: OnClickData, tab: Tab): Nothing
}
