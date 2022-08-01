@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetCursorPositionParameters {
  /**
   * ID of the context that owns the candidate window.
   */
  public var contextID: Int

  /**
   * ID of the candidate to select.
   */
  public var candidateID: Int
}
