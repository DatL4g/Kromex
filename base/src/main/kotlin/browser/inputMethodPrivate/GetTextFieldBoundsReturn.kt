@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface GetTextFieldBoundsReturn {
  /**
   * The x-coordinate of the text field's bounds.
   */
  public var x: Int

  /**
   * The y-coordinate of the text field's bounds.
   */
  public var y: Int

  /**
   * The width of the text field's bounds.
   */
  public var width: Int

  /**
   * The height of the  bounds.
   */
  public var height: Int
}
