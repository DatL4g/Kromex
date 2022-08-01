@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

public external interface DeleteRangeRange {
  /**
   * Items added to history after this date, represented in milliseconds since the epoch.
   */
  public var startTime: Number

  /**
   * Items added to history before this date, represented in milliseconds since the epoch.
   */
  public var endTime: Number
}
