@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when a connection is made from another extension (by $(ref:runtime.connect)).
 */
public external interface OnConnectExternalListener {
  public var port: Port
}
