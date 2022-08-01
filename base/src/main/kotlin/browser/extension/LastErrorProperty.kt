@file:JsModule("webextension-polyfill")
@file:JsQualifier("extension")

package browser.extension

public external interface LastErrorProperty {
  /**
   * Description of the error that has taken place.
   */
  public var message: String
}
