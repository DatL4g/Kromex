@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

public external interface LastErrorProperty {
  /**
   * Details about the error which occurred.
   */
  public var message: String?
}
