@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

/**
 * Fired when the default font size setting changes.
 */
public external interface OnDefaultFontSizeChangedListener {
  public var details: DetailsProperty
}
