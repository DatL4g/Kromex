@file:JsModule("webextension-polyfill")
@file:JsQualifier("extension")

package browser.extension

import browser.runtime.MessageSender

/**
 * Fired when a request is sent from another extension.
 */
public external interface OnRequestExternalListener {
  /**
   * The request sent by the calling script.
   */
  public var request: Any?

  public var sender: MessageSender

  /**
   * Function to call when you have a response. The argument should be any JSON-ifiable object, or
   * undefined if there is no response.
   */
  public fun sendResponse(): Nothing
}
