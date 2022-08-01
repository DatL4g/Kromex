@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

public external interface QueryQueryInfo {
  /**
   * Whether the groups are collapsed.
   */
  public var collapsed: Boolean?

  /**
   * The color of the groups.
   */
  public var color: Color?

  /**
   * Match group titles against a pattern.
   */
  public var title: String?

  /**
   * The ID of the parent window, or $(ref:windows.WINDOW_ID_CURRENT) for the <a
   * href='windows#current-window'>current window</a>.
   */
  public var windowId: Int?
}
