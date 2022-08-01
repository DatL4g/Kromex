@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

public external interface DetailsProperty {
  /**
   * The value of the setting after the change.
   */
  public var `value`: Any

  /**
   * The level of control of the setting.
   */
  public var levelOfControl: LevelOfControl

  /**
   * Whether the value that has changed is specific to the incognito session.<br/>This property will
   * <em>only</em> be present if the user has enabled the extension in incognito mode.
   */
  public var incognitoSpecific: Boolean?
}
