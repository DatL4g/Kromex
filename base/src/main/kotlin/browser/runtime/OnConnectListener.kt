@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when a connection is made from either an extension process or a content script (by
 * $(ref:runtime.connect)).
 */
public external interface OnConnectListener {
  public var port: Port
}
