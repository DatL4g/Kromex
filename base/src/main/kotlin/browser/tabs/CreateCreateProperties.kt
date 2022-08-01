@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

public external interface CreateCreateProperties {
  /**
   * The window in which to create the new tab. Defaults to the <a
   * href='windows#current-window'>current window</a>.
   */
  public var windowId: Int?

  /**
   * The position the tab should take in the window. The provided value is clamped to between zero
   * and the number of tabs in the window.
   */
  public var index: Int?

  /**
   * The URL to initially navigate the tab to. Fully-qualified URLs must include a scheme (i.e.,
   * 'http://www.google.com', not 'www.google.com'). Relative URLs are relative to the current page
   * within the extension. Defaults to the New Tab Page.
   */
  public var url: String?

  /**
   * Whether the tab should become the active tab in the window. Does not affect whether the window
   * is focused (see $(ref:windows.update)). Defaults to <var>true</var>.
   */
  public var active: Boolean?

  /**
   * Whether the tab should become the selected tab in the window. Defaults to <var>true</var>
   */
  @Deprecated(
    message = "Please use <em>active</em>.",
    level = DeprecationLevel.WARNING,
  )
  public var selected: Boolean?

  /**
   * Whether the tab should be pinned. Defaults to <var>false</var>
   */
  public var pinned: Boolean?

  /**
   * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window
   * as the newly created tab.
   */
  public var openerTabId: Int?
}
