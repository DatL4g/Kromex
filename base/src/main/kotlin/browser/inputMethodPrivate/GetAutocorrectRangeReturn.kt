@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface GetAutocorrectRangeReturn {
  /**
   * The start index of the autocorrected word's bounds.
   */
  public var start: Int

  /**
   * The end index of the autocorrected word's bounds.
   */
  public var end: Int
}
