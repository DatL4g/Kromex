@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

/**
 * This event is sent when virtual keyboard bounds changed and overscroll/resize is enabled.
 */
public external interface OnBoundsChangedListener {
  /**
   * The virtual keyboard bounds
   */
  public var bounds: Bounds
}
