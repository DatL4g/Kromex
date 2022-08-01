@file:JsModule("webextension-polyfill")
@file:JsQualifier("browsingData")

package browser.browsingData

/**
 * Options that determine exactly what data will be removed.
 */
public external interface RemovalOptions {
  /**
   * Remove data accumulated on or after this date, represented in milliseconds since the epoch
   * (accessible via the <code>getTime</code> method of the JavaScript <code>Date</code> object). If
   * absent, defaults to 0 (which would remove all browsing data).
   */
  public var since: Number?

  /**
   * An object whose properties specify which origin types ought to be cleared. If this object isn't
   * specified, it defaults to clearing only "unprotected" origins. Please ensure that you
   * <em>really</em> want to remove application data before adding 'protectedWeb' or 'extensions'.
   */
  public var originTypes: OriginTypesProperty?

  /**
   * When present, only data for origins in this list is deleted. Only supported for cookies,
   * storage and cache. Cookies are cleared for the whole registrable domain.
   */
  public var origins: Array<String>?

  /**
   * When present, data for origins in this list is excluded from deletion. Can't be used together
   * with <code>origins</code>. Only supported for cookies, storage and cache.  Cookies are excluded
   * for the whole registrable domain.
   */
  public var excludeOrigins: Array<String>?
}
