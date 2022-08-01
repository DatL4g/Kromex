@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface SetSelectionRangeParameters {
  /**
   * ID of the context where we want to set the selection.
   */
  public var contextID: Int

  /**
   * Selection start position. Must be a valid uint32 value (Positive and less than 0xFFFFFFFF).
   */
  public var selectionStart: Int?

  /**
   * Selection end position. Must be a valid uint32 value (Positive and less than 0xFFFFFFFF).
   */
  public var selectionEnd: Int?
}
