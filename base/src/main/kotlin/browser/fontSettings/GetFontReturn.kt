@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface GetFontReturn {
  /**
   * The font ID. Rather than the literal font ID preference value, this may be the ID of the font
   * that the system resolves the preference value to. So, <var>fontId</var> can differ from the font
   * passed to <code>setFont</code>, if, for example, the font is not available on the system. The
   * empty string signifies fallback to the global script font setting.
   */
  public var fontId: String

  /**
   * The level of control this extension has over the setting.
   */
  public var levelOfControl: LevelOfControl
}
