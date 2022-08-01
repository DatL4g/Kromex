@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

/**
 * Fired when a group is updated.
 */
public external interface OnUpdatedListener {
  /**
   * Details of the group that was updated.
   */
  public var group: TabGroup
}
