@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

/**
 * Details of the currently effective value.
 */
public external interface GetReturn {
  /**
   * The value of the setting.
   */
  public var `value`: Any

  /**
   * The level of control of the setting.
   */
  public var levelOfControl: LevelOfControl

  /**
   * Whether the effective value is specific to the incognito session.<br/>This property will
   * <em>only</em> be present if the <var>incognito</var> property in the <var>details</var> parameter
   * of <code>get()</code> was true.
   */
  public var incognitoSpecific: Boolean?
}
