@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface GetAutocorrectRangeParameters {
  /**
   * ID of the autocorrected context.
   */
  public var contextID: Int
}
