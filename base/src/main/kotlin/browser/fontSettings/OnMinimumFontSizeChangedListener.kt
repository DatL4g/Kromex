@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

/**
 * Fired when the minimum font size setting changes.
 */
public external interface OnMinimumFontSizeChangedListener {
  public var details: DetailsProperty
}
