@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

public external interface SyntheticMouseEvent {
  public var type: SyntheticMouseEventType

  /**
   * X coordinate for mouse event in global screen coordinates
   */
  public var x: Int

  /**
   * Y coordinate for mouse event in global screen coordinates
   */
  public var y: Int

  /**
   * True if the touch accessibility flag should be set.
   */
  public var touchAccessibility: Boolean?

  /**
   * The default mouse button is set to left if mouseButton is not specified.
   */
  public var mouseButton: SyntheticMouseEventButton?
}
