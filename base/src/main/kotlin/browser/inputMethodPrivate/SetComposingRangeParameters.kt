@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface SetComposingRangeParameters {
  /**
   * ID of the context where the composition text will be set
   */
  public var contextID: Int

  /**
   * The starting index of the composing range, in bytes.
   */
  public var start: Int

  /**
   * The ending index of the composing range, in bytes. The order of the start and end index does
   * not matter.
   */
  public var end: Int

  /**
   * List of segments and their associated types.
   */
  public var segments: Array<SegmentsProperty>?
}
