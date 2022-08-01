package browser.extensionTypes

import kotlin.String

/**
 * The format of an image.
 */
public enum class ImageFormat(
  private val `value`: String,
) {
  jpeg("jpeg"),
  png("png"),
  ;

  public override fun toString(): String = value
}
