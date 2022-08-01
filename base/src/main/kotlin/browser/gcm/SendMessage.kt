@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

/**
 * A message to send to the other party via FCM.
 */
public external interface SendMessage {
  /**
   * The ID of the server to send the message to as assigned by <a
   * href='https://console.cloud.google.com/apis/dashboard'>Google API Console</a>.
   */
  public var destinationId: String

  /**
   * The ID of the message. It must be unique for each message in scope of the applications. See the
   * <a href='cloudMessaging#send_messages'>Cloud Messaging documentation</a> for advice for picking
   * and handling an ID.
   */
  public var messageId: String

  /**
   * Time-to-live of the message in seconds. If it is not possible to send the message within that
   * time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should
   * be sent immediately or fail if it's not possible. The default value of time-to-live is 86,400
   * seconds (1 day) and the maximum value is 2,419,200 seconds (28 days).
   */
  public var timeToLive: Int?

  /**
   * Message data to send to the server. Case-insensitive <code>goog.</code> and
   * <code>google</code>, as well as case-sensitive <code>collapse_key</code> are disallowed as key
   * prefixes. Sum of all key/value pairs should not exceed $(ref:gcm.MAX_MESSAGE_SIZE).
   */
  public var `data`: String
}
