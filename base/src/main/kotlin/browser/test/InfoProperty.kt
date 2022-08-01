@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface InfoProperty {
  /**
   * Additional information.
   */
  public var `data`: String

  /**
   * True if this was the last message for this test
   */
  public var lastMessage: Boolean
}
