@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

import browser.events.Event

/**
 * An object which allows two way communication with other pages. See <a
 * href="messaging#connect">Long-lived connections</a> for more information.
 */
public external interface Port {
  /**
   * The name of the port, as specified in the call to $(ref:runtime.connect).
   */
  public var name: String

  /**
   * This property will <b>only</b> be present on ports passed to $(ref:runtime.onConnect onConnect)
   * / $(ref:runtime.onConnectExternal onConnectExternal) / $(ref:runtime.onConnectExternal
   * onConnectNative) listeners.
   */
  public var sender: MessageSender?

  /**
   * Fired when the port is disconnected from the other end(s). $(ref:runtime.lastError) may be set
   * if the port was disconnected by an error. If the port is closed via $(ref:Port.disconnect
   * disconnect), then this event is <em>only</em> fired on the other end. This event is fired at most
   * once (see also <a href="messaging#port-lifetime">Port lifetime</a>).
   */
  public val onDisconnect: Event<OnDisconnectListener, Unit>

  /**
   * This event is fired when $(ref:Port.postMessage postMessage) is called by the other end of the
   * port.
   */
  public val onMessage: Event<OnMessageListener, Any?>

  /**
   * Immediately disconnect the port. Calling <code>disconnect()</code> on an already-disconnected
   * port has no effect. When a port is disconnected, no new events will be dispatched to this port.
   */
  public fun disconnect(): Nothing

  /**
   * Send a message to the other end of the port. If the port is disconnected, an error is thrown.
   *
   * @param message The message to send. This object should be JSON-ifiable.
   */
  public fun postMessage(message: Any): Nothing
}
