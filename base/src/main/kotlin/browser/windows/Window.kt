@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

import browser.tabs.Tab

external interface Window {
    /**
     * The ID of the window.
     * Window IDs are unique within a browser session.
     * In some circumstances a window may not be assigned an ID property; for example, when querying windows using the sessions API, in which case a session ID may be present.
     */
    var id: Int?

    /**
     * Whether the window is currently the focused window.
     */
    var focused: Boolean

    /**
     * The offset of the window from the top edge of the screen in pixels.
     * In some circumstances a window may not be assigned a top property; for example, when querying closed windows from the sessions API.
     */
    var top: Int?

    /**
     * The offset of the window from the left edge of the screen in pixels.
     * In some circumstances a window may not be assigned a left property; for example, when querying closed windows from the sessions API.
     */
    var left: Int?

    /**
     * The width of the window, including the frame, in pixels.
     * In some circumstances a window may not be assigned a width property; for example, when querying closed windows from the sessions API.
     */
    var width: Int?

    /**
     * The height of the window, including the frame, in pixels.
     * In some circumstances a window may not be assigned a height property; for example, when querying closed windows from the sessions API.
     */
    var height: Int?

    /**
     * Array of tabs.Tab objects representing the current tabs in the window.
     */
    var tabs: Array<Tab>?

    /**
     * Whether the window is incognito.
     */
    var incognito: Boolean

    /**
     * The type of browser window this is.
     */
    var type: WindowType?

    /**
     * The state of this browser window.
     */
    var state: WindowState?

    /**
     * Whether the window is set to be always on top.
     */
    var alwaysOnTop: Boolean

    /**
     * The session ID used to uniquely identify a window, obtained from the sessions API.
     */
    var sessionId: String?
}