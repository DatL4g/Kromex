@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

public external interface TabGroup {
  /**
   * The ID of the group. Group IDs are unique within a browser session.
   */
  public var id: Int

  /**
   * Whether the group is collapsed. A collapsed group is one whose tabs are hidden.
   */
  public var collapsed: Boolean

  /**
   * The group's color.
   */
  public var color: Color

  /**
   * The title of the group.
   */
  public var title: String?

  /**
   * The ID of the window that contains the group.
   */
  public var windowId: Int
}
