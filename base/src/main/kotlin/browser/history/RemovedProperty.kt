@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

public external interface RemovedProperty {
  /**
   * True if all history was removed.  If true, then urls will be empty.
   */
  public var allHistory: Boolean

  public var urls: Array<String>?
}
