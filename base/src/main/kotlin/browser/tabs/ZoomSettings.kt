@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Defines how zoom changes in a tab are handled and at what scope.
 */
public external interface ZoomSettings {
  /**
   * Defines how zoom changes are handled, i.e., which entity is responsible for the actual scaling
   * of the page; defaults to <code>automatic</code>.
   */
  public var mode: ZoomSettingsMode?

  /**
   * Defines whether zoom changes persist for the page's origin, or only take effect in this tab;
   * defaults to <code>per-origin</code> when in <code>automatic</code> mode, and <code>per-tab</code>
   * otherwise.
   */
  public var scope: ZoomSettingsScope?

  /**
   * Used to return the default zoom level for the current tab in calls to tabs.getZoomSettings.
   */
  public var defaultZoomFactor: Number?
}
