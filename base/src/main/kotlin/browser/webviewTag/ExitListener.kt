@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the process rendering the guest web content has exited.<p>The following example code
 * will show a farewell message whenever the guest page
 * crashes:</p><pre>webview.addEventListener('exit', function(e) {  if (e.reason === 'crash') {   
 * webview.src = 'data:text/plain,Goodbye, world!';  }});</pre>
 */
public external interface ExitListener {
  /**
   * Chrome's internal ID of the process that exited.
   */
  public var processID: Int

  /**
   * String indicating the reason for the exit.
   */
  public var reason: String
}
