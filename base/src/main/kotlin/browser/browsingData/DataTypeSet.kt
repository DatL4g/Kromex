@file:JsModule("webextension-polyfill")
@file:JsQualifier("browsingData")

package browser.browsingData

/**
 * A set of data types. Missing data types are interpreted as <code>false</code>.
 */
public external interface DataTypeSet {
  /**
   * Websites' appcaches.
   */
  public var appcache: Boolean?

  /**
   * The browser's cache.
   */
  public var cache: Boolean?

  /**
   * Cache storage
   */
  public var cacheStorage: Boolean?

  /**
   * The browser's cookies.
   */
  public var cookies: Boolean?

  /**
   * The browser's download list.
   */
  public var downloads: Boolean?

  /**
   * Websites' file systems.
   */
  public var fileSystems: Boolean?

  /**
   * The browser's stored form data.
   */
  public var formData: Boolean?

  /**
   * The browser's history.
   */
  public var history: Boolean?

  /**
   * Websites' IndexedDB data.
   */
  public var indexedDB: Boolean?

  /**
   * Websites' local storage data.
   */
  public var localStorage: Boolean?

  /**
   * Server-bound certificates.
   */
  @Deprecated(
    message =
        "Support for server-bound certificates has been removed. This data type will be ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var serverBoundCertificates: Boolean?

  /**
   * Stored passwords.
   */
  public var passwords: Boolean?

  /**
   * Plugins' data.
   */
  @Deprecated(
    message = "Support for Flash has been removed. This data type will be ignored.",
    level = DeprecationLevel.WARNING,
  )
  public var pluginData: Boolean?

  /**
   * Service Workers.
   */
  public var serviceWorkers: Boolean?

  /**
   * Websites' WebSQL data.
   */
  public var webSQL: Boolean?
}
