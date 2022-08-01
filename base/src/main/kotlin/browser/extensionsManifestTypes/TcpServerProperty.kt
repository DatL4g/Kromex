@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

public external interface TcpServerProperty {
  /**
   * <p>The host:port pattern for <code>listen</code> operations.</p>
   */
  public var listen: SocketHostPatterns?
}
