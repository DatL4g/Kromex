@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when a new window, or a new tab in an existing window, is created to host a navigation.
 */
public external interface OnCreatedNavigationTargetListener {
  public var details: DetailsProperty
}
