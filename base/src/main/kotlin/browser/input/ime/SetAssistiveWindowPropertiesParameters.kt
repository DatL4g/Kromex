@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetAssistiveWindowPropertiesParameters {
  /**
   * ID of the context owning the assistive window.
   */
  public var contextID: Int

  /**
   * Properties of the assistive window.
   */
  public var properties: AssistiveWindowProperties
}
