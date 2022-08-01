@file:JsModule("webextension-polyfill")
@file:JsQualifier("debugger")

package browser.debugger

/**
 * Fired whenever debugging target issues instrumentation event.
 */
public external interface OnEventListener {
  /**
   * The debuggee that generated this event.
   */
  public var source: Debuggee

  /**
   * Method name. Should be one of the notifications defined by the <a
   * href='https://developer.chrome.com/devtools/docs/debugger-protocol'>remote debugging protocol</a>.
   */
  public var method: String

  /**
   * JSON object with the parameters. Structure of the parameters varies depending on the method
   * name and is defined by the 'parameters' attribute of the event description in the remote debugging
   * protocol.
   */
  public var params: Any?
}
