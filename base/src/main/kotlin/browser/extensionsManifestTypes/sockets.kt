@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

/**
 * The <code>sockets</code> manifest property declares which sockets operations an app can issue.
 */
public external interface sockets {
  /**
   * The <code>udp</code> manifest property declares which sockets.udp operations an app can issue.
   */
  public var udp: UdpProperty?

  /**
   * The <code>tcp</code> manifest property declares which sockets.tcp operations an app can issue.
   */
  public var tcp: TcpProperty?

  /**
   * The <code>tcpServer</code> manifest property declares which sockets.tcpServer operations an app
   * can issue.
   */
  public var tcpServer: TcpServerProperty?
}
