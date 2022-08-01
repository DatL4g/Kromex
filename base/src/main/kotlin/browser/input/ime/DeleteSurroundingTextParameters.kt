@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface DeleteSurroundingTextParameters {
  /**
   * ID of the engine receiving the event.
   */
  public var engineID: String

  /**
   * ID of the context where the surrounding text will be deleted.
   */
  public var contextID: Int

  /**
   * The offset from the caret position where deletion will start. This value can be negative.
   */
  public var offset: Int

  /**
   * The number of characters to be deleted
   */
  public var length: Int
}
