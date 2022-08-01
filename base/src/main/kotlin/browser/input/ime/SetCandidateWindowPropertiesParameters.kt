@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface SetCandidateWindowPropertiesParameters {
  /**
   * ID of the engine to set properties on.
   */
  public var engineID: String

  public var properties: PropertiesProperty
}
