@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface DetailsProperty {
  /**
   * The ID of the button clicked.
   */
  public var buttonID: AssistiveWindowButton

  /**
   * The type of the assistive window.
   */
  public var windowType: AssistiveWindowType
}
