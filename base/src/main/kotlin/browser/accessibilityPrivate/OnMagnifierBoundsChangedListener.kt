@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when Chrome OS magnifier bounds are updated.
 */
public external interface OnMagnifierBoundsChangedListener {
  /**
   * Updated bounds of magnifier viewport.
   */
  public var magnifierBounds: ScreenRect
}
