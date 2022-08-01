@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when the page's DOM is fully constructed, but the referenced resources may not finish
 * loading.
 */
public external interface OnDOMContentLoadedListener {
  public var details: DetailsProperty
}
