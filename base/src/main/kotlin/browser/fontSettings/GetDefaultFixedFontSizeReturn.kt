@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface GetDefaultFixedFontSizeReturn {
  /**
   * The font size in pixels.
   */
  public var pixelSize: Int

  /**
   * The level of control this extension has over the setting.
   */
  public var levelOfControl: LevelOfControl
}
