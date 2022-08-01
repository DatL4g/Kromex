@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetCompositionParameters {
  /**
   * ID of the context where the composition text will be set
   */
  public var contextID: Int

  /**
   * Text to set
   */
  public var text: String

  /**
   * Position in the text that the selection starts at.
   */
  public var selectionStart: Int?

  /**
   * Position in the text that the selection ends at.
   */
  public var selectionEnd: Int?

  /**
   * Position in the text of the cursor.
   */
  public var cursor: Int

  /**
   * List of segments and their associated types.
   */
  public var segments: Array<SegmentsProperty>?
}
