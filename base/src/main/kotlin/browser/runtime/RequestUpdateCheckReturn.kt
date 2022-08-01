@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

public external interface RequestUpdateCheckReturn {
  /**
   * Result of the update check.
   */
  public var status: RequestUpdateCheckStatus

  /**
   * If an update is available, this contains more information about the available update.
   */
  public var details: DetailsProperty?
}
