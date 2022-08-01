@file:JsModule("webextension-polyfill")
@file:JsQualifier("extension")

package browser.extension

public external interface GetViewsFetchProperties {
  /**
   * The type of view to get. If omitted, returns all views (including background pages and tabs).
   * Valid values: 'tab', 'notification', 'popup'.
   */
  public var type: ViewType?

  /**
   * The window to restrict the search to. If omitted, returns all views.
   */
  public var windowId: Int?

  /**
   * Find a view according to a tab id. If this field is omitted, returns all views.
   */
  public var tabId: Int?
}
