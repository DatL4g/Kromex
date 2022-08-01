@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

public external interface MessageProperty {
  /**
   * The message data.
   */
  public var `data`: String

  /**
   * The sender who issued the message.
   */
  public var from: String?

  /**
   * The collapse key of a message. See the <a
   * href='https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages'>Non-collapsible
   * and collapsible messages</a> for details.
   */
  public var collapseKey: String?
}
