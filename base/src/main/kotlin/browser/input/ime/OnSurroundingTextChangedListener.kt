@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * Called when the editable string around caret is changed or when the caret position is moved. The
 * text length is limited to 100 characters for each back and forth direction.
 */
public external interface OnSurroundingTextChangedListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String

  /**
   * The surrounding information.
   */
  public var surroundingInfo: SurroundingInfoProperty
}
