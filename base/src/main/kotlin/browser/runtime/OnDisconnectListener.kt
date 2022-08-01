@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when the port is disconnected from the other end(s). $(ref:runtime.lastError) may be set if
 * the port was disconnected by an error. If the port is closed via $(ref:Port.disconnect disconnect),
 * then this event is <em>only</em> fired on the other end. This event is fired at most once (see also
 * <a href="messaging#port-lifetime">Port lifetime</a>).
 */
public external interface OnDisconnectListener {
  /**
   * The disconnected port.
   */
  public var port: Port
}
