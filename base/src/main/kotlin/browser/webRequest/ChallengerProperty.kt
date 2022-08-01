@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

public external interface ChallengerProperty {
  public var host: String

  public var port: Int
}
