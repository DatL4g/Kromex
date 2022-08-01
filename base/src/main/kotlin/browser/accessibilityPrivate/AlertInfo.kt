@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Information about an alert
 */
public external interface AlertInfo {
  /**
   * The message the alert is showing.
   */
  public var message: String
}
