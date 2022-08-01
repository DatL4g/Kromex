@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface SetFontDetails {
  /**
   * The script code which the font should be set. If omitted, the font setting for the global
   * script (script code "Zyyy") is set.
   */
  public var script: ScriptCode?

  /**
   * The generic font family for which the font should be set.
   */
  public var genericFamily: GenericFamily

  /**
   * The font ID. The empty string means to fallback to the global script font setting.
   */
  public var fontId: String
}
