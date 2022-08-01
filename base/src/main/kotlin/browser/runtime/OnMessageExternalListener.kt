@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when a message is sent from another extension/app (by $(ref:runtime.sendMessage)). Cannot
 * be used in a content script.
 */
public external interface OnMessageExternalListener {
  /**
   * The message sent by the calling script.
   */
  public var message: Any?

  public var sender: MessageSender

  /**
   * Function to call (at most once) when you have a response. The argument should be any
   * JSON-ifiable object. If you have more than one <code>onMessage</code> listener in the same
   * document, then only one may send a response. This function becomes invalid when the event listener
   * returns, <strong>unless you return true</strong> from the event listener to indicate you wish to
   * send a response asynchronously (this will keep the message channel open to the other end until
   * <code>sendResponse</code> is called).
   */
  public fun sendResponse(): Nothing
}
