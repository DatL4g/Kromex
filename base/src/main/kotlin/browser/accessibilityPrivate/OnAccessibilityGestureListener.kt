@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Fired when an accessibility gesture is detected by the touch exploration controller.
 */
public external interface OnAccessibilityGestureListener {
  public var gesture: Gesture

  public var x: Int

  public var y: Int
}
