@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when an error occurs and the navigation is aborted. This can happen if either a network
 * error occurred, or the user aborted the navigation.
 */
public external interface OnErrorOccurredListener {
  public var details: DetailsProperty
}
