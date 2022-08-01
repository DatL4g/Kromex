@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

public external interface UdpProperty {
  /**
   * <p>The host:port pattern for <code>bind</code> operations.</p>
   */
  public var bind: SocketHostPatterns?

  /**
   * <p>The host:port pattern for <code>send</code> operations.</p>
   */
  public var send: SocketHostPatterns?

  /**
   * <p>The host:port pattern for <code>joinGroup</code> operations.</p>
   */
  public var multicastMembership: SocketHostPatterns?
}
