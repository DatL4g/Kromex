@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

/**
 * A set of data types. Missing data types are interpreted as <code>false</code>.
 */
public external interface DataTypeSet {
  /**
   * Websites' appcaches.
   */
  public var appcache: Boolean?

  /**
   * The Websites' cookies. This will remove both session and persistent cookies
   */
  public var cookies: Boolean?

  /**
   * The Websites' session cookies.
   */
  public var sessionCookies: Boolean?

  /**
   * The Websites' persistent cookies.
   */
  public var persistentCookies: Boolean?

  /**
   * Websites' file systems.
   */
  public var fileSystems: Boolean?

  /**
   * Websites' IndexedDB data.
   */
  public var indexedDB: Boolean?

  /**
   * Websites' local storage data.
   */
  public var localStorage: Boolean?

  /**
   * Websites' WebSQL data.
   */
  public var webSQL: Boolean?

  /**
   * The Websites' cache data. Note: when removing data, this clears the <em>entire</em> cache: it
   * is not limited to the range you specify.
   */
  public var cache: Boolean?
}
