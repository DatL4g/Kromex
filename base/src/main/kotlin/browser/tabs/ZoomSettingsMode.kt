package browser.tabs

import kotlin.String

/**
 * Defines how zoom changes are handled, i.e., which entity is responsible for the actual scaling of
 * the page; defaults to <code>automatic</code>.
 */
public enum class ZoomSettingsMode(
  private val `value`: String,
) {
  /**
   * Zoom changes are handled automatically by the browser.
   */
  automatic("automatic"),
  /**
   * Overrides the automatic handling of zoom changes. The <code>onZoomChange</code> event will
   * still be dispatched, and it is the extension's responsibility to listen for this event and
   * manually scale the page. This mode does not support <code>per-origin</code> zooming, and thus
   * ignores the <code>scope</code> zoom setting and assumes <code>per-tab</code>.
   */
  manual("manual"),
  /**
   * Disables all zooming in the tab. The tab reverts to the default zoom level, and all attempted
   * zoom changes are ignored.
   */
  disabled("disabled"),
  ;

  public override fun toString(): String = value
}
