@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Information to filter the cookies being retrieved.
 */
public external interface GetAllDetails {
  /**
   * Restricts the retrieved cookies to those that would match the given URL.
   */
  public var url: String?

  /**
   * Filters the cookies by name.
   */
  public var name: String?

  /**
   * Restricts the retrieved cookies to those whose domains match or are subdomains of this one.
   */
  public var domain: String?

  /**
   * Restricts the retrieved cookies to those whose path exactly matches this string.
   */
  public var path: String?

  /**
   * Filters the cookies by their Secure property.
   */
  public var secure: Boolean?

  /**
   * Filters out session vs. persistent cookies.
   */
  public var session: Boolean?

  /**
   * The cookie store to retrieve cookies from. If omitted, the current execution context's cookie
   * store will be used.
   */
  public var storeId: String?
}
