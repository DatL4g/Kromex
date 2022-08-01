@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface TestServerProperty {
  /**
   * The port on which the test server is listening.
   */
  public var port: Int
}
