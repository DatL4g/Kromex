@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

/**
 * Fired when a group is moved within a window. Move events are still fired for the individual tabs
 * within the group, as well as for the group itself. This event is not fired when a group is moved
 * between windows; instead, it will be removed from one window and created in another.
 */
public external interface OnMovedListener {
  /**
   * Details of the group that was moved.
   */
  public var group: TabGroup
}
