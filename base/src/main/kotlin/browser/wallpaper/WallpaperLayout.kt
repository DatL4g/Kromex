package browser.wallpaper

import kotlin.String

/**
 * The supported wallpaper layouts.
 */
public enum class WallpaperLayout(
  private val `value`: String,
) {
  STRETCH("STRETCH"),
  CENTER("CENTER"),
  CENTER_CROPPED("CENTER_CROPPED"),
  ;

  public override fun toString(): String = value
}
