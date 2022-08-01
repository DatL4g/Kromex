@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetCandidatesParameters {
  /**
   * ID of the context that owns the candidate window.
   */
  public var contextID: Int

  /**
   * List of candidates to show in the candidate window
   */
  public var candidates: Array<CandidatesProperty>
}
