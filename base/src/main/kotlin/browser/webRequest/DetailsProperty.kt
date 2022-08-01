@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

public external interface DetailsProperty {
  /**
   * The ID of the request. Request IDs are unique within a browser session. As a result, they could
   * be used to relate different events of the same request.
   */
  public var requestId: String

  /**
   * The proposed action which was ignored.
   */
  public var action: IgnoredActionType
}
