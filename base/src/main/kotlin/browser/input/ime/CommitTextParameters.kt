@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface CommitTextParameters {
  /**
   * ID of the context where the text will be committed
   */
  public var contextID: Int

  /**
   * The text to commit
   */
  public var text: String
}
