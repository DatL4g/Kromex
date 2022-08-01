@file:JsModule("webextension-polyfill")
@file:JsQualifier("pageAction")

package browser.pageAction

public external interface TabDetails {
  /**
   * The ID of the tab to query state for. If no tab is specified, the non-tab-specific state is
   * returned.
   */
  public var tabId: Int?
}
