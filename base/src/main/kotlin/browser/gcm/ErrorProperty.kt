@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

public external interface ErrorProperty {
  /**
   * The error message describing the problem.
   */
  public var errorMessage: String

  /**
   * The ID of the message with this error, if error is related to a specific message.
   */
  public var messageId: String?

  /**
   * Additional details related to the error, when available.
   */
  public var details: String
}
