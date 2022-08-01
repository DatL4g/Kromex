@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

public external interface TcpProperty {
  /**
   * <p>The host:port pattern for <code>connect</code> operations.</p>
   */
  public var connect: SocketHostPatterns?
}
