@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

/**
 * An object encapsulating the set of proxy rules for all protocols. Use either 'singleProxy' or (a
 * subset of) 'proxyForHttp', 'proxyForHttps', 'proxyForFtp' and 'fallbackProxy'.
 */
public external interface ProxyRules {
  /**
   * The proxy server to be used for all per-URL requests (that is http, https, and ftp).
   */
  public var singleProxy: ProxyServer?

  /**
   * The proxy server to be used for HTTP requests.
   */
  public var proxyForHttp: ProxyServer?

  /**
   * The proxy server to be used for HTTPS requests.
   */
  public var proxyForHttps: ProxyServer?

  /**
   * The proxy server to be used for FTP requests.
   */
  public var proxyForFtp: ProxyServer?

  /**
   * The proxy server to be used for everthing else or if any of the specific proxyFor... is not
   * specified.
   */
  public var fallbackProxy: ProxyServer?

  /**
   * List of servers to connect to without a proxy server.
   */
  public var bypassList: Array<String>?
}
