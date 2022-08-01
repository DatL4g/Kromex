@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabGroups")

package browser.tabGroups

public external interface MoveMoveProperties {
  /**
   * The window to move the group to. Defaults to the window the group is currently in. Note that
   * groups can only be moved to and from windows with $(ref:windows.WindowType) type
   * <code>"normal"</code>.
   */
  public var windowId: Int?

  /**
   * The position to move the group to. Use <code>-1</code> to place the group at the end of the
   * window.
   */
  public var index: Int
}
