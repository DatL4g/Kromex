@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

public external interface FinishComposingTextParameters {
  /**
   * ID of the context where we want to finish composing.
   */
  public var contextID: Int
}
