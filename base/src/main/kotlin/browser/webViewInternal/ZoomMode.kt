package browser.webViewInternal

import kotlin.String

/**
 * Defines the how zooming is handled in the webview.
 */
public enum class ZoomMode(
  private val `value`: String,
) {
  /**
   * Zoom changes will persist in the zoomed page's origin, i.e. all other webviews in the same
   * partition that are navigated to that same origin will be zoomed as well. Moreover,
   * <code>per-origin</code> zoom changes are saved with the origin, meaning that when navigating to
   * other pages in the same origin, they will all be zoomed to the same zoom factor.
   */
  per_origin("per-origin"),
  /**
   * Zoom changes only take effect in this webview, and zoom changes in other webviews will not
   * affect the zooming of this webview. Also, <code>per-view</code> zoom changes are reset on
   * navigation; navigating a webview will always load pages with their per-origin zoom factors (within
   * the scope of the partition).
   */
  per_view("per-view"),
  /**
   * Disables all zooming in the webview. The content will revert to the default zoom level, and all
   * attempted zoom changes will be ignored.
   */
  disabled("disabled"),
  ;

  public override fun toString(): String = value
}
