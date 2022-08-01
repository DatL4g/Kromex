@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Details to identify the cookie.
 */
public external interface CookieDetails {
  /**
   * The URL with which the cookie to access is associated. This argument may be a full URL, in
   * which case any data following the URL path (e.g. the query string) is simply ignored. If host
   * permissions for this URL are not specified in the manifest file, the API call will fail.
   */
  public var url: String

  /**
   * The name of the cookie to access.
   */
  public var name: String

  /**
   * The ID of the cookie store in which to look for the cookie. By default, the current execution
   * context's cookie store will be used.
   */
  public var storeId: String?
}
