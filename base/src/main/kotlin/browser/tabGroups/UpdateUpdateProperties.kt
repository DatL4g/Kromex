@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

public external interface UpdateUpdateProperties {
  /**
   * Whether the group should be collapsed.
   */
  public var collapsed: Boolean?

  /**
   * The color of the group.
   */
  public var color: Color?

  /**
   * The title of the group.
   */
  public var title: String?
}
