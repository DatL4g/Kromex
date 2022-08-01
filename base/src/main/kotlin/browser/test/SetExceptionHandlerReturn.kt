@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface SetExceptionHandlerReturn {
  public var message: String

  public var exception: Any
}
