@file:JsModule("webextension-polyfill")
@file:JsQualifier("systemPrivate")

package browser.systemPrivate

/**
 * Information about the system update.
 */
public external interface UpdateStatus {
  /**
   * State of system update.
   */
  public var state: UpdateStatusState

  /**
   * Value between 0 and 1 describing the progress of system update download.  This value will be
   * set to 0 when |state| is NotAvailable, 1 when NeedRestart.
   */
  public var downloadProgress: Number
}
