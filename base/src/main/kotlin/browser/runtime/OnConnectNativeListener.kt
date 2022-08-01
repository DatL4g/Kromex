@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when a connection is made from a native application. Currently only supported on Chrome OS.
 */
public external interface OnConnectNativeListener {
  public var port: Port
}
