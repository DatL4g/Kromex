@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Interface attached to <code>newwindow</code> DOM events.
 */
public external interface NewWindow {
  /**
   * Attach the requested target page to an existing <code>webview</code> element.
   *
   * @param webview The <code>webview</code> element to which the target page should be attached.
   */
  public fun attach(webview: Any): Nothing

  /**
   * Cancel the new window request.
   */
  public fun discard(): Nothing
}
