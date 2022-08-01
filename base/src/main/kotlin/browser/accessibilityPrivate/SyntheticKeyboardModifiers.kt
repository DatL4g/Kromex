@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface SyntheticKeyboardModifiers {
  /**
   * Control modifier.
   */
  public var ctrl: Boolean?

  /**
   * alt modifier.
   */
  public var alt: Boolean?

  /**
   * search modifier.
   */
  public var search: Boolean?

  /**
   * shift modifier.
   */
  public var shift: Boolean?
}
