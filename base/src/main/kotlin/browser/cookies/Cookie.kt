@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Represents information about an HTTP cookie.
 */
public external interface Cookie {
  /**
   * The name of the cookie.
   */
  public var name: String

  /**
   * The value of the cookie.
   */
  public var `value`: String

  /**
   * The domain of the cookie (e.g. "www.google.com", "example.com").
   */
  public var domain: String

  /**
   * True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain
   * of the cookie).
   */
  public var hostOnly: Boolean

  /**
   * The path of the cookie.
   */
  public var path: String

  /**
   * True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically
   * HTTPS).
   */
  public var secure: Boolean

  /**
   * True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side
   * scripts).
   */
  public var httpOnly: Boolean

  /**
   * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
   */
  public var sameSite: SameSiteStatus

  /**
   * True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration
   * date.
   */
  public var session: Boolean

  /**
   * The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided
   * for session cookies.
   */
  public var expirationDate: Number?

  /**
   * The ID of the cookie store containing this cookie, as provided in getAllCookieStores().
   */
  public var storeId: String
}
