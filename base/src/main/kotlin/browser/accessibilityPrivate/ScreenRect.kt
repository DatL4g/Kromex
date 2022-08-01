@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

/**
 * Bounding rectangle in global screen coordinates.
 */
public external interface ScreenRect {
  /**
   * Left coordinate in global screen coordinates.
   */
  public var left: Int

  /**
   * Top coordinate in global screen coordinates.
   */
  public var top: Int

  /**
   * Width in pixels.
   */
  public var width: Int

  /**
   * Height in pixels.
   */
  public var height: Int
}
