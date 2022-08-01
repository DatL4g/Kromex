@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the process rendering the guest web content has become unresponsive. This event will
 * be generated once with a matching responsive event if the guest begins to respond again.
 */
public external interface UnresponsiveListener {
  /**
   * Chrome's internal ID of the process that has become unresponsive.
   */
  public var processID: Int
}
