@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * <p>Describes a rectangle in screen coordinates.</p><p>The containment semantics are array-like;
 * that is, the coordinate <code>(left, top)</code> is considered to be contained by the rectangle, but
 * the coordinate <code>(left + width, top)</code> is not.</p>
 */
public external interface SelectionRect {
  /**
   * Distance from the left edge of the screen to the left edge of the rectangle.
   */
  public var left: Int

  /**
   * Distance from the top edge of the screen to the top edge of the rectangle.
   */
  public var top: Int

  /**
   * Width of the rectangle.
   */
  public var width: Int

  /**
   * Height of the rectangle.
   */
  public var height: Int
}
