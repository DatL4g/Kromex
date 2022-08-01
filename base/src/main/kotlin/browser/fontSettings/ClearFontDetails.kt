@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface ClearFontDetails {
  /**
   * The script for which the font should be cleared. If omitted, the global script font setting is
   * cleared.
   */
  public var script: ScriptCode?

  /**
   * The generic font family for which the font should be cleared.
   */
  public var genericFamily: GenericFamily
}
