@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

import browser.events.Event
import browser.runtime.listeners.MessageListener

/**
 * An object which allows two way communication with other pages.
 * See Long-lived connections for more information.
 *
 * @see <a href=\"messaging#connect\">Long-lived connections</a>
 */
external interface Port {
    /**
     * The name of the port, as specified in the call to runtime.connect.
     */
    var name: String

    /**
     * Immediately disconnect the port.
     * Calling disconnect() on an already-disconnected port has no effect.
     * When a port is disconnected, no new events will be dispatched to this port.
     */
    fun disconnect()

    /**
     * Send a message to the other end of the port.
     * If the port is disconnected, an error is thrown.
     *
     * @param message The message to send. This object should be JSON-ifiable.
     */
    fun postMessage(message: Any)

    /**
     * This property will only be present on ports passed to runtime.onConnect / runtime.onConnectExternal / runtime.onConnectExternal listeners.
     */
    var sender: MessageSender?

    /**
     * Fired when the port is disconnected from the other end(s).
     * runtime.lastError may be set if the port was disconnected by an error.
     * If the port is closed via Port.disconnect [disconnect], then this event is only fired on the other end.
     * This event is fired at most once (see also Port lifetime).
     *
     * @see <a href=\"messaging#port-lifetime\">Port lifetime</a>
     */
    var onDisconnect: Event<Port?, Unit>

    /**
     * This event is fired when Port.postMessage [postMessage] is called by the other end of the port.
     */
    var onMessage: Event<MessageListener?, Unit>
}