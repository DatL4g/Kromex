@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

/**
 * Used to test sending messages to extensions.
 */
public external interface OnMessageListener {
  public var info: InfoProperty
}
