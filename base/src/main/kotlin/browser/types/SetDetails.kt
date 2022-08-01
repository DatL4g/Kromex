@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

/**
 * Which setting to change.
 */
public external interface SetDetails {
  /**
   * The value of the setting. <br/>Note that every setting has a specific value type, which is
   * described together with the setting. An extension should <em>not</em> set a value of a different
   * type.
   */
  public var `value`: Any

  /**
   * Where to set the setting (default: regular).
   */
  public var scope: ChromeSettingScope?
}
