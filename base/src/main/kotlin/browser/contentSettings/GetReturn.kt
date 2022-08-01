@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

public external interface GetReturn {
  /**
   * The content setting. See the description of the individual ContentSetting objects for the
   * possible values.
   */
  public var setting: Any
}
