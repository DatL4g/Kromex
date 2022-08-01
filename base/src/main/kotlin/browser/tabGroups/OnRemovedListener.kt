@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

/**
 * Fired when a group is closed, either directly by the user or automatically because it contained
 * zero tabs.
 */
public external interface OnRemovedListener {
  /**
   * Details of the group that was removed.
   */
  public var group: TabGroup
}
