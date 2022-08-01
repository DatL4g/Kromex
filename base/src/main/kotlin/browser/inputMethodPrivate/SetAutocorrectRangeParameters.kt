@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface SetAutocorrectRangeParameters {
  /**
   * ID of the context to autocorrect.
   */
  public var contextID: Int

  /**
   * Autocorrect suggestion to display.
   */
  public var autocorrectString: String

  /**
   * Start of the selection range.
   */
  public var selectionStart: Int

  /**
   * End of the selection range.
   */
  public var selectionEnd: Int
}
