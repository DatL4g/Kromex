@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

/**
 * Fired when a group is created.
 */
public external interface OnCreatedListener {
  /**
   * Details of the group that was created.
   */
  public var group: TabGroup
}
