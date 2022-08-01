@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

public external interface UpdateUpdateInfo {
  /**
   * The offset from the left edge of the screen to move the window to in pixels. This value is
   * ignored for panels.
   */
  public var left: Int?

  /**
   * The offset from the top edge of the screen to move the window to in pixels. This value is
   * ignored for panels.
   */
  public var top: Int?

  /**
   * The width to resize the window to in pixels. This value is ignored for panels.
   */
  public var width: Int?

  /**
   * The height to resize the window to in pixels. This value is ignored for panels.
   */
  public var height: Int?

  /**
   * If <code>true</code>, brings the window to the front; cannot be combined with the state
   * 'minimized'. If <code>false</code>, brings the next window in the z-order to the front; cannot be
   * combined with the state 'fullscreen' or 'maximized'.
   */
  public var focused: Boolean?

  /**
   * If <code>true</code>, causes the window to be displayed in a manner that draws the user's
   * attention to the window, without changing the focused window. The effect lasts until the user
   * changes focus to the window. This option has no effect if the window already has focus. Set to
   * <code>false</code> to cancel a previous <code>drawAttention</code> request.
   */
  public var drawAttention: Boolean?

  /**
   * The new state of the window. The 'minimized', 'maximized', and 'fullscreen' states cannot be
   * combined with 'left', 'top', 'width', or 'height'.
   */
  public var state: WindowState?
}
