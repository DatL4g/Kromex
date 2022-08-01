@file:JsModule("webextension-polyfill")
@file:JsQualifier("wallpaper")

package browser.wallpaper

import org.w3c.dom.BinaryType

public external interface SetWallpaperDetails {
  /**
   * The jpeg or png encoded wallpaper image as an ArrayBuffer.
   */
  public var `data`: BinaryType?

  /**
   * The URL of the wallpaper to be set (can be relative).
   */
  public var url: String?

  /**
   * The supported wallpaper layouts.
   */
  public var layout: WallpaperLayout

  /**
   * The file name of the saved wallpaper.
   */
  public var filename: String

  /**
   * True if a 128x60 thumbnail should be generated. Layout and ratio are not supported yet.
   */
  public var thumbnail: Boolean?
}
