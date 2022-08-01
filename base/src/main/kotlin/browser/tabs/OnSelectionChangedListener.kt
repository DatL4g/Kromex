@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fires when the selected tab in a window changes.
 */
public external interface OnSelectionChangedListener {
  /**
   * The ID of the tab that has become active.
   */
  public var tabId: Int

  public var selectInfo: SelectInfoProperty
}
