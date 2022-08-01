@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface UsageProperty {
  /**
   * The title string of details description.
   */
  public var title: String

  /**
   * The body string of detail description.
   */
  public var body: String
}
