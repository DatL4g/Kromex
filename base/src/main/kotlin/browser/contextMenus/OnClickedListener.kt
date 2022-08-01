@file:JsModule("webextension-polyfill")
@file:JsQualifier("contextMenus")

package browser.contextMenus

import browser.tabs.Tab

/**
 * Fired when a context menu item is clicked.
 */
public external interface OnClickedListener {
  /**
   * Information about the item clicked and the context where the click happened.
   */
  public var info: OnClickData

  /**
   * The details of the tab where the click took place. If the click did not take place in a tab,
   * this parameter will be missing.
   */
  public var tab: Tab?
}
