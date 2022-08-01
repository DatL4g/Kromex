@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface SetCompositionRangeParameters {
  /**
   * ID of the context where the composition text will be set
   */
  public var contextID: Int

  /**
   * How much before the current selection to set as composition.
   */
  public var selectionBefore: Int

  /**
   * How much after the current selection to set as composition.
   */
  public var selectionAfter: Int

  /**
   * List of segments and their associated types.
   */
  public var segments: Array<SegmentsProperty>?
}
