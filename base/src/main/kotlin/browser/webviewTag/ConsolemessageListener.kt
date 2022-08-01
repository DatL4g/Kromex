@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the guest window logs a console message.<p>The following example code forwards all log
 * messages to the embedder's console without regard for log level or other
 * properties.</p><pre>webview.addEventListener('consolemessage', function(e) {  console.log('Guest
 * page logged a message: ', e.message);});</pre>
 */
public external interface ConsolemessageListener {
  /**
   * The severity level of the log message. Ranges from -1 to 2. LOG_VERBOSE (console.debug) = -1,
   * LOG_INFO (console.log, console.info) = 0, LOG_WARNING (console.warn) = 1, LOG_ERROR
   * (console.error) = 2.
   */
  public var level: Int

  /**
   * The logged message contents.
   */
  public var message: String

  /**
   * The line number of the message source.
   */
  public var line: Int

  /**
   * A string identifying the resource which logged the message.
   */
  public var sourceId: String
}
