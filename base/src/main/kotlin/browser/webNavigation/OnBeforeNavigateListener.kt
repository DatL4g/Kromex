@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when a navigation is about to occur.
 */
public external interface OnBeforeNavigateListener {
  public var details: DetailsProperty
}
