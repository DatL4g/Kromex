@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.wallpaper

public inline fun SetWallpaperDetails(block: SetWallpaperDetails.() -> Unit): SetWallpaperDetails =
    (js("{}") as SetWallpaperDetails).apply(block)
