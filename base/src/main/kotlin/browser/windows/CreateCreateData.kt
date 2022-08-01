@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

public external interface CreateCreateData {
  /**
   * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a
   * scheme, e.g., 'http://www.google.com', not 'www.google.com'. Non-fully-qualified URLs are
   * considered relative within the extension. Defaults to the New Tab Page.
   */
  public var url: Any

  /**
   * The ID of the tab to add to the new window.
   */
  public var tabId: Int?

  /**
   * The number of pixels to position the new window from the left edge of the screen. If not
   * specified, the new window is offset naturally from the last focused window. This value is ignored
   * for panels.
   */
  public var left: Int?

  /**
   * The number of pixels to position the new window from the top edge of the screen. If not
   * specified, the new window is offset naturally from the last focused window. This value is ignored
   * for panels.
   */
  public var top: Int?

  /**
   * The width in pixels of the new window, including the frame. If not specified, defaults to a
   * natural width.
   */
  public var width: Int?

  /**
   * The height in pixels of the new window, including the frame. If not specified, defaults to a
   * natural height.
   */
  public var height: Int?

  /**
   * If <code>true</code>, opens an active window. If <code>false</code>, opens an inactive window.
   */
  public var focused: Boolean?

  /**
   * Whether the new window should be an incognito window.
   */
  public var incognito: Boolean?

  /**
   * Specifies what type of browser window to create.
   */
  public var type: CreateType?

  /**
   * The initial state of the window. The <code>minimized</code>, <code>maximized</code>, and
   * <code>fullscreen</code> states cannot be combined with <code>left</code>, <code>top</code>,
   * <code>width</code>, or <code>height</code>.
   */
  public var state: WindowState?

  /**
   * If <code>true</code>, the newly-created window's 'window.opener' is set to the caller and is in
   * the same <a
   * href="https://www.w3.org/TR/html51/browsers.html#unit-of-related-browsing-contexts">unit of
   * related browsing contexts</a> as the caller.
   */
  public var setSelfAsOpener: Boolean?
}
