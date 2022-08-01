@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface OnAutocorrectParameters {
  /**
   * ID of the context where the autocorrect occurred.
   */
  public var contextID: Int

  /**
   * Corrected word will be replaced by this when clicking undo
   */
  public var typedWord: String

  /**
   * Needed primarily to know the length of the autocorrected text to show the correct length of
   * underline. String content technically redundant; required however, as what IMF knows may be stale
   * due to async.
   */
  public var correctedWord: String

  /**
   * Offset index (in code units) in surroundingInfo (see onSurroundingTextChanged) for the start of
   * the autocorrected text
   */
  public var startIndex: Int
}
