@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface QueryQueryInfo {
  /**
   * Whether the tabs are active in their windows.
   */
  public var active: Boolean?

  /**
   * Whether the tabs are pinned.
   */
  public var pinned: Boolean?

  /**
   * Whether the tabs are audible.
   */
  public var audible: Boolean?

  /**
   * Whether the tabs are muted.
   */
  public var muted: Boolean?

  /**
   * Whether the tabs are highlighted.
   */
  public var highlighted: Boolean?

  /**
   * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from
   * memory, but is still visible in the tab strip. Its content is reloaded the next time it is
   * activated.
   */
  public var discarded: Boolean?

  /**
   * Whether the tabs can be discarded automatically by the browser when resources are low.
   */
  public var autoDiscardable: Boolean?

  /**
   * Whether the tabs are in the <a href='windows#current-window'>current window</a>.
   */
  public var currentWindow: Boolean?

  /**
   * Whether the tabs are in the last focused window.
   */
  public var lastFocusedWindow: Boolean?

  /**
   * The tab loading status.
   */
  public var status: TabStatus?

  /**
   * Match page titles against a pattern. This property is ignored if the extension does not have
   * the <code>"tabs"</code> permission.
   */
  public var title: String?

  /**
   * Match tabs against one or more <a href='match_patterns'>URL patterns</a>. Fragment identifiers
   * are not matched. This property is ignored if the extension does not have the <code>"tabs"</code>
   * permission.
   */
  public var url: Any

  /**
   * The ID of the group that the tabs are in, or $(ref:tabGroups.TAB_GROUP_ID_NONE) for ungrouped
   * tabs.
   */
  public var groupId: Int?

  /**
   * The ID of the parent window, or $(ref:windows.WINDOW_ID_CURRENT) for the <a
   * href='windows#current-window'>current window</a>.
   */
  public var windowId: Int?

  /**
   * The type of window the tabs are in.
   */
  public var windowType: WindowType?

  /**
   * The position of the tabs within their windows.
   */
  public var index: Int?
}
