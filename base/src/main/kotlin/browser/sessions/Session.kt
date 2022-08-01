@file:JsModule("webextension-polyfill")
@file:JsQualifier("sessions")

package browser.sessions

import browser.tabs.Tab
import browser.windows.Window

public external interface Session {
  /**
   * The time when the window or tab was closed or modified, represented in milliseconds since the
   * epoch.
   */
  public var lastModified: Int

  /**
   * The $(ref:tabs.Tab), if this entry describes a tab. Either this or
   * $(ref:sessions.Session.window) will be set.
   */
  public var tab: Tab?

  /**
   * The $(ref:windows.Window), if this entry describes a window. Either this or
   * $(ref:sessions.Session.tab) will be set.
   */
  public var window: Window?
}
