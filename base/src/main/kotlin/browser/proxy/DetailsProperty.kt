@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

public external interface DetailsProperty {
  /**
   * If true, the error was fatal and the network transaction was aborted. Otherwise, a direct
   * connection is used instead.
   */
  public var fatal: Boolean

  /**
   * The error description.
   */
  public var error: String

  /**
   * Additional details about the error such as a JavaScript runtime error.
   */
  public var details: String
}
