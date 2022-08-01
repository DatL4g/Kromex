@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

/**
 * Fired when a message is received through FCM.
 */
public external interface OnMessageListener {
  /**
   * A message received from another party via FCM.
   */
  public var message: MessageProperty
}
