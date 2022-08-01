@file:JsModule("webextension-polyfill")
@file:JsQualifier("wallpaper")

package browser.wallpaper

import kotlin.js.Promise
import org.w3c.dom.BinaryType

/**
 * Sets wallpaper to the image at <em>url</em> or <em>wallpaperData</em> with the specified
 * <em>layout</em>
 */
public external fun setWallpaper(details: SetWallpaperDetails): Promise<BinaryType?>
