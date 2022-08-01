@file:JsModule("webextension-polyfill")
@file:JsQualifier("extension")

package browser.extension

import browser.runtime.MessageSender

/**
 * Fired when a request is sent from either an extension process or a content script.
 */
public external interface OnRequestListener {
  /**
   * The request sent by the calling script.
   */
  public var request: Any?

  public var sender: MessageSender

  /**
   * Function to call (at most once) when you have a response. The argument should be any
   * JSON-ifiable object, or undefined if there is no response. If you have more than one
   * <code>onRequest</code> listener in the same document, then only one may send a response.
   */
  public fun sendResponse(): Nothing
}
