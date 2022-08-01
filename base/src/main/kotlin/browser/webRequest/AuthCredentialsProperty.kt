@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

public external interface AuthCredentialsProperty {
  public var username: String

  public var password: String
}
