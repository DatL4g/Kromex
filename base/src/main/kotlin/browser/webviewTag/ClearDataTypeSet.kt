@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * A set of data types. Missing properties are interpreted as <code>false</code>.
 */
public external interface ClearDataTypeSet {
  /**
   * Websites' appcaches.
   */
  public var appcache: Boolean?

  /**
   * Since Chrome 43.<br>The browser's cache. Note: when removing data, this clears the entire
   * cache; it is not limited to the range you specify.
   */
  public var cache: Boolean?

  /**
   * The partition's cookies.
   */
  public var cookies: Boolean?

  /**
   * The partition's session cookies.
   */
  public var sessionCookies: Boolean?

  /**
   * The partition's persistent cookies.
   */
  public var persistentCookies: Boolean?

  /**
   * Websites' filesystems.
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
}
