@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

/**
 * An object encapsulating a single proxy server's specification.
 */
public external interface ProxyServer {
  /**
   * The scheme (protocol) of the proxy server itself. Defaults to 'http'.
   */
  public var scheme: Scheme?

  /**
   * The hostname or IP address of the proxy server. Hostnames must be in ASCII (in Punycode
   * format). IDNA is not supported, yet.
   */
  public var host: String

  /**
   * The port of the proxy server. Defaults to a port that depends on the scheme.
   */
  public var port: Int?
}
