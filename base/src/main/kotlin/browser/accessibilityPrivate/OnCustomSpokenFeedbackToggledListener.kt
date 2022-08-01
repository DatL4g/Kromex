@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when a custom spoken feedback on the active window gets enabled or disabled. Called from
 * ARC++ accessibility.
 */
public external interface OnCustomSpokenFeedbackToggledListener {
  /**
   * True if the active window implements custom spoken feedback features.
   */
  public var enabled: Boolean
}
