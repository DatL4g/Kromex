@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface GetTextFieldBoundsParameters {
  /**
   * ID of the context.
   */
  public var contextID: Int
}
