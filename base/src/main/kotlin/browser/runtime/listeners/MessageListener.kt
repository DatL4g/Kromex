@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.listeners

import browser.runtime.Port

external interface MessageListener {
    /**
     * The message received on the port.
     */
    val message: Any

    /**
     * The port that received the message.
     */
    val port: Port
}