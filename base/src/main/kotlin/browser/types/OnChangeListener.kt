@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

/**
 * Fired after the setting changes.
 */
public external interface OnChangeListener {
  public var details: DetailsProperty
}
