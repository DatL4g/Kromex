@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

/**
 * Fired when it was not possible to send a message to the FCM server.
 */
public external interface OnSendErrorListener {
  /**
   * An error that occured while trying to send the message either in Chrome or on the FCM server.
   * Application can retry sending the message with a reasonable backoff and possibly longer
   * time-to-live.
   */
  public var error: ErrorProperty
}
