@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

public external interface SetDefaultFixedFontSizeDetails {
  /**
   * The font size in pixels.
   */
  public var pixelSize: Int
}
