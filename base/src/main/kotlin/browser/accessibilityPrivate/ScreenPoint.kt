@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Point in global screen coordinates.
 */
public external interface ScreenPoint {
  /**
   * X coordinate in global screen coordinates.
   */
  public var x: Int

  /**
   * Y coordinate in global screen coordinates.
   */
  public var y: Int
}
