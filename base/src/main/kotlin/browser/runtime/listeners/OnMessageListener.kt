@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.listeners

import browser.runtime.MessageSender

external interface OnMessageListener {
    /**
     * The message sent by the calling script.
     */
    val message: Any?

    val sender: MessageSender?

    /**
     * Function to call (at most once) when you have a response.
     * The argument should be any JSON-ifiable object.
     * If you have more than one onMessage listener in the same document, then only one may send a response.
     * This function becomes invalid when the event listener returns, unless you return true from the event listener to indicate you wish to send a response asynchronously (this will keep the message channel open to the other end until sendResponse is called).
     */
    val sendResponse: (Any) -> Unit
}