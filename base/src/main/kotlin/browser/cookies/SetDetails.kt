@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Details about the cookie being set.
 */
public external interface SetDetails {
  /**
   * The request-URI to associate with the setting of the cookie. This value can affect the default
   * domain and path values of the created cookie. If host permissions for this URL are not specified
   * in the manifest file, the API call will fail.
   */
  public var url: String

  /**
   * The name of the cookie. Empty by default if omitted.
   */
  public var name: String?

  /**
   * The value of the cookie. Empty by default if omitted.
   */
  public var `value`: String?

  /**
   * The domain of the cookie. If omitted, the cookie becomes a host-only cookie.
   */
  public var domain: String?

  /**
   * The path of the cookie. Defaults to the path portion of the url parameter.
   */
  public var path: String?

  /**
   * Whether the cookie should be marked as Secure. Defaults to false.
   */
  public var secure: Boolean?

  /**
   * Whether the cookie should be marked as HttpOnly. Defaults to false.
   */
  public var httpOnly: Boolean?

  /**
   * The cookie's same-site status. Defaults to "unspecified", i.e., if omitted, the cookie is set
   * without specifying a SameSite attribute.
   */
  public var sameSite: SameSiteStatus?

  /**
   * The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted,
   * the cookie becomes a session cookie.
   */
  public var expirationDate: Number?

  /**
   * The ID of the cookie store in which to set the cookie. By default, the cookie is set in the
   * current execution context's cookie store.
   */
  public var storeId: String?
}
