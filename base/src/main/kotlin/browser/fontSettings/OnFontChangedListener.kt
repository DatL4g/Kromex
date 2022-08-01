@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

/**
 * Fired when a font setting changes.
 */
public external interface OnFontChangedListener {
  public var details: DetailsProperty
}
