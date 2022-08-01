@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

/**
 * Represents a cookie store in the browser. An incognito mode window, for instance, uses a separate
 * cookie store from a non-incognito window.
 */
public external interface CookieStore {
  /**
   * The unique identifier for the cookie store.
   */
  public var id: String

  /**
   * Identifiers of all the browser tabs that share this cookie store.
   */
  public var tabIds: Array<Int>
}
