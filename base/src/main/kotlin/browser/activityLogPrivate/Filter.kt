@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

/**
 * Used to specify values for a lookup.
 */
public external interface Filter {
  /**
   * Exact match
   */
  public var extensionId: String?

  public var activityType: ExtensionActivityFilter

  /**
   * Exact match
   */
  public var apiCall: String?

  /**
   * Treated as a prefix
   */
  public var pageUrl: String?

  /**
   * Treated as a prefix
   */
  public var argUrl: String?

  /**
   * Used to lookup a precise day; today is 0
   */
  public var daysAgo: Int?
}
