package browser.tabs

/**
 * Defines how zoom changes are handled, i.e., which entity is responsible for the actual scaling of the page; defaults to automatic.
 *
 * @property automatic Zoom changes are handled automatically by the browser.
 * @property manual Overrides the automatic handling of zoom changes.
 *                  The onZoomChange event will still be dispatched, and it is the extension's responsibility to listen for this event and manually scale the page.
 *                  This mode does not support per-origin zooming, and thus ignores the scope zoom setting and assumes per-tab.
 * @property disabled Disables all zooming in the tab.
 *                    The tab reverts to the default zoom level, and all attempted zoom changes are ignored.
 */
enum class ZoomSettingsMode(private val value: String) {
    automatic("automatic"),
    manual("manual"),
    disabled("disabled");

    override fun toString(): String = value
}