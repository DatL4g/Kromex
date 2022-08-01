@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the process rendering the guest web content has become responsive again after being
 * unresponsive.<p>The following example code will fade the <code>webview</code> element in or out as
 * it becomes responsive or unresponsive:</p><pre>webview.style.webkitTransition = 'opacity
 * 250ms';webview.addEventListener('unresponsive', function() {  webview.style.opacity =
 * '0.5';});webview.addEventListener('responsive', function() {  webview.style.opacity =
 * '1';});</pre>
 */
public external interface ResponsiveListener {
  /**
   * Chrome's internal ID of the process that became responsive.
   */
  public var processID: Int
}
