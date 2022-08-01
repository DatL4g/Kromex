@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the guest page attempts to open a new browser window.<p>The following example code
 * will create and navigate a new <code>webview</code> in the embedder for each requested new
 * window:</p><pre>webview.addEventListener('newwindow', function(e) {  var newWebview =
 * document.createElement('webview');  document.body.appendChild(newWebview); 
 * e.window.attach(newWebview);});</pre>
 */
public external interface NewwindowListener {
  /**
   * An interface that can be used to either attach the requested target page to an existing
   * <code>webview</code> element or explicitly discard the request.
   */
  public var window: NewWindow

  /**
   * The target URL requested for the new window.
   */
  public var targetUrl: String

  /**
   * The initial width requested for the new window.
   */
  public var initialWidth: Number

  /**
   * The initial height requested for the new window.
   */
  public var initialHeight: Number

  /**
   * The requested name of the new window.
   */
  public var name: String

  /**
   * The requested disposition of the new window.
   */
  public var windowOpenDisposition: String
}
