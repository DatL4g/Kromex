@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when the frame's history was updated to a new URL. All future events for that frame will
 * use the updated URL.
 */
public external interface OnHistoryStateUpdatedListener {
  public var details: DetailsProperty
}
