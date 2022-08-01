@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface ClearCompositionParameters {
  /**
   * ID of the context where the composition will be cleared
   */
  public var contextID: Int
}
