@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface UpdateUpdateProperties {
  /**
   * A URL to navigate the tab to. JavaScript URLs are not supported; use
   * $(ref:scripting.executeScript) instead.
   */
  public var url: String?

  /**
   * Whether the tab should be active. Does not affect whether the window is focused (see
   * $(ref:windows.update)).
   */
  public var active: Boolean?

  /**
   * Adds or removes the tab from the current selection.
   */
  public var highlighted: Boolean?

  /**
   * Whether the tab should be selected.
   */
  @Deprecated(
    message = "Please use <em>highlighted</em>.",
    level = DeprecationLevel.WARNING,
  )
  public var selected: Boolean?

  /**
   * Whether the tab should be pinned.
   */
  public var pinned: Boolean?

  /**
   * Whether the tab should be muted.
   */
  public var muted: Boolean?

  /**
   * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window
   * as this tab.
   */
  public var openerTabId: Int?

  /**
   * Whether the tab should be discarded automatically by the browser when resources are low.
   */
  public var autoDiscardable: Boolean?
}
