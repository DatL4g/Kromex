package browser.tabs

import kotlin.String

/**
 * Defines whether zoom changes persist for the page's origin, or only take effect in this tab;
 * defaults to <code>per-origin</code> when in <code>automatic</code> mode, and <code>per-tab</code>
 * otherwise.
 */
public enum class ZoomSettingsScope(
  private val `value`: String,
) {
  /**
   * Zoom changes persist in the zoomed page's origin, i.e., all other tabs navigated to that same
   * origin are zoomed as well. Moreover, <code>per-origin</code> zoom changes are saved with the
   * origin, meaning that when navigating to other pages in the same origin, they are all zoomed to the
   * same zoom factor. The <code>per-origin</code> scope is only available in the
   * <code>automatic</code> mode.
   */
  per_origin("per-origin"),
  /**
   * Zoom changes only take effect in this tab, and zoom changes in other tabs do not affect the
   * zooming of this tab. Also, <code>per-tab</code> zoom changes are reset on navigation; navigating a
   * tab always loads pages with their <code>per-origin</code> zoom factors.
   */
  per_tab("per-tab"),
  ;

  public override fun toString(): String = value
}
