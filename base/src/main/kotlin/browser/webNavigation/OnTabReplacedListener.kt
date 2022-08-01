@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

/**
 * Fired when the contents of the tab is replaced by a different (usually previously pre-rendered)
 * tab.
 */
public external interface OnTabReplacedListener {
  public var details: DetailsProperty
}
