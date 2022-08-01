@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

import browser.tabs.Tab

public external interface Window {
  /**
   * The ID of the window. Window IDs are unique within a browser session. In some circumstances a
   * window may not be assigned an <code>ID</code> property; for example, when querying windows using
   * the $(ref:sessions) API, in which case a session ID may be present.
   */
  public var id: Int?

  /**
   * Whether the window is currently the focused window.
   */
  public var focused: Boolean

  /**
   * The offset of the window from the top edge of the screen in pixels. In some circumstances a
   * window may not be assigned a <code>top</code> property; for example, when querying closed windows
   * from the $(ref:sessions) API.
   */
  public var top: Int?

  /**
   * The offset of the window from the left edge of the screen in pixels. In some circumstances a
   * window may not be assigned a <code>left</code> property; for example, when querying closed windows
   * from the $(ref:sessions) API.
   */
  public var left: Int?

  /**
   * The width of the window, including the frame, in pixels. In some circumstances a window may not
   * be assigned a <code>width</code> property; for example, when querying closed windows from the
   * $(ref:sessions) API.
   */
  public var width: Int?

  /**
   * The height of the window, including the frame, in pixels. In some circumstances a window may
   * not be assigned a <code>height</code> property; for example, when querying closed windows from the
   * $(ref:sessions) API.
   */
  public var height: Int?

  /**
   * Array of $(ref:tabs.Tab) objects representing the current tabs in the window.
   */
  public var tabs: Array<Tab>?

  /**
   * Whether the window is incognito.
   */
  public var incognito: Boolean

  /**
   * The type of browser window this is.
   */
  public var type: WindowType?

  /**
   * The state of this browser window.
   */
  public var state: WindowState?

  /**
   * Whether the window is set to be always on top.
   */
  public var alwaysOnTop: Boolean

  /**
   * The session ID used to uniquely identify a window, obtained from the $(ref:sessions) API.
   */
  public var sessionId: String?
}
