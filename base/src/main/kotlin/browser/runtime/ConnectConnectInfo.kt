@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

public external interface ConnectConnectInfo {
  /**
   * Will be passed into onConnect for processes that are listening for the connection event.
   */
  public var name: String?

  /**
   * Whether the TLS channel ID will be passed into onConnectExternal for processes that are
   * listening for the connection event.
   */
  public var includeTlsChannelId: Boolean?
}
