@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when an internal component within accessibility wants to force speech output for an
 * accessibility extension. Do not use without approval from accessibility owners.
 */
public external interface OnAnnounceForAccessibilityListener {
  /**
   * Text to be announced.
   */
  public var announceText: Array<String>
}
