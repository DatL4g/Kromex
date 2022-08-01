@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

/**
 * This corresponds to a row from the ActivityLog database. Fields will be blank if they were
 * specified precisely in a lookup filter.
 */
public external interface ExtensionActivity {
  /**
   * An ID of a row in the ActivityLog database that corresponds to the activity. ID is set only on
   * activities retrieved from the database.
   */
  public var activityId: String?

  public var extensionId: String?

  public var activityType: ExtensionActivityType

  public var time: Number?

  public var apiCall: String?

  public var args: String?

  public var count: Number?

  public var pageUrl: String?

  public var pageTitle: String?

  public var argUrl: String?

  public var other: OtherProperty?
}
