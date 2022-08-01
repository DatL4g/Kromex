@file:JsModule("webextension-polyfill")
@file:JsQualifier("virtualKeyboardPrivate")

package browser.virtualKeyboardPrivate

public external interface Bounds {
  /**
   * The position of the virtual keyboard window's left edge.
   */
  public var left: Int

  /**
   * The position of the virtual keyboard window's top edge.
   */
  public var top: Int

  /**
   * The width of the virtual keyboard window.
   */
  public var width: Int

  /**
   * The height of the virtual keyboard window.
   */
  public var height: Int
}
