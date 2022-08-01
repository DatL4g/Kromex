@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface GetFontDetails {
  /**
   * The script for which the font should be retrieved. If omitted, the font setting for the global
   * script (script code "Zyyy") is retrieved.
   */
  public var script: ScriptCode?

  /**
   * The generic font family for which the font should be retrieved.
   */
  public var genericFamily: GenericFamily
}
