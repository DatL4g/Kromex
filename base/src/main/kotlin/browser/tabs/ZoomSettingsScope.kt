package browser.tabs

/**
 * Defines whether zoom changes persist for the page's origin, or only take effect in this tab; defaults to per-origin when in automatic mode, and per-tab otherwise.
 *
 * @property per_origin Zoom changes persist in the zoomed page's origin, i.e., all other tabs navigated to that same origin are zoomed as well.
 *                      Moreover, per-origin zoom changes are saved with the origin, meaning that when navigating to other pages in the same origin, they are all zoomed to the same zoom factor.
 *                      The per-origin scope is only available in the automatic mode.
 * @property per_tab Zoom changes only take effect in this tab, and zoom changes in other tabs do not affect the zooming of this tab.
 *                   Also, per-tab zoom changes are reset on navigation; navigating a tab always loads pages with their per-origin zoom factors.
 */
enum class ZoomSettingsScope(private val value: String) {
    per_origin("per-origin"),
    per_tab("per-tab");

    override fun toString(): String = value
}