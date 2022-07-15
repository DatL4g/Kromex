@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows.data

import browser.windows.CreateType
import browser.windows.WindowState

external interface CreateData {
    /**
     * A URL or array of URLs to open as tabs in the window.
     * Fully-qualified URLs must include a scheme, e.g., 'http://www.google.com', not 'www.google.com'.
     * Non-fully-qualified URLs are considered relative within the extension.
     * Defaults to the New Tab Page.
     *
     * Either set it to string or array of string
     */
    var url: Any?

    /**
     * The ID of the tab to add to the new window.
     */
    var tabId: Int?

    /**
     * The number of pixels to position the new window from the left edge of the screen.
     * If not specified, the new window is offset naturally from the last focused window.
     * This value is ignored for panels.
     */
    var left: Int?

    /**
     * The number of pixels to position the new window from the top edge of the screen.
     * If not specified, the new window is offset naturally from the last focused window.
     * This value is ignored for panels.
     */
    var top: Int?

    /**
     * The width in pixels of the new window, including the frame.
     * If not specified, defaults to a natural width.
     */
    var width: Int?

    /**
     * The height in pixels of the new window, including the frame.
     * If not specified, defaults to a natural height.
     */
    var height: Int?

    /**
     * If true, opens an active window. If false<, opens an inactive window.
     */
    var focused: Boolean?

    /**
     * Whether the new window should be an incognito window.
     */
    var incognito: Boolean?

    /**
     * Specifies what type of browser window to create.
     */
    var type: CreateType?

    /**
     * The initial state of the window.
     * The minimized, maximized, and fullscreen states cannot be combined with left, top, width, or height.
     */
    var state: WindowState?

    /**
     * If true, the newly-created window's 'window.opener' is set to the caller and is in the same unit of related browsing contexts as the caller.
     *
     * @see <a href=\"https://www.w3.org/TR/html51/browsers.html#unit-of-related-browsing-contexts\">unit of related browsing contexts</a>
     */
    var setSelfAsOpener: Boolean?
}