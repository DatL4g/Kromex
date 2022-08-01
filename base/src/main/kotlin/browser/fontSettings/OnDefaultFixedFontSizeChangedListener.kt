@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

/**
 * Fired when the default fixed font size setting changes.
 */
public external interface OnDefaultFixedFontSizeChangedListener {
  public var details: DetailsProperty
}
