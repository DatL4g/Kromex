@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionTypes")

package browser.extensionTypes

/**
 * Details about the format and quality of an image.
 */
public external interface ImageDetails {
  /**
   * The format of the resulting image.  Default is <code>"jpeg"</code>.
   */
  public var format: ImageFormat?

  /**
   * When format is <code>"jpeg"</code>, controls the quality of the resulting image.  This value is
   * ignored for PNG images.  As quality is decreased, the resulting image will have more visual
   * artifacts, and the number of bytes needed to store it will decrease.
   */
  public var quality: Int?
}
