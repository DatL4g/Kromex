@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when the reference fragment of a frame was updated. All future events for that frame will
 * use the updated URL.
 */
public external interface OnReferenceFragmentUpdatedListener {
  public var details: DetailsProperty
}
