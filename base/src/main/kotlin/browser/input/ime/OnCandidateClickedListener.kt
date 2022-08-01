@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

/**
 * This event is sent if this extension owns the active IME.
 */
public external interface OnCandidateClickedListener {
  /**
   * ID of the engine receiving the event
   */
  public var engineID: String

  /**
   * ID of the candidate that was clicked.
   */
  public var candidateID: Int

  /**
   * Which mouse buttons was clicked.
   */
  public var button: MouseButton
}
