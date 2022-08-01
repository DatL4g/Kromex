@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

/**
 * Represents a font name.
 */
public external interface FontName {
  /**
   * The font ID.
   */
  public var fontId: String

  /**
   * The display name of the font.
   */
  public var displayName: String
}
