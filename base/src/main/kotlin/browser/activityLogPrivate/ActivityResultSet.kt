@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

/**
 * This holds the results of a lookup, the filter of the lookup, the time of the lookup, and whether
 * there are more results that match.
 */
public external interface ActivityResultSet {
  public var activities: Array<ExtensionActivity>
}
