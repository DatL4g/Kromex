@file:JsModule("webextension-polyfill")
@file:JsQualifier("extensionsManifestTypes")

package browser.extensionsManifestTypes

public external interface ExternallyConnectable {
  /**
   * <p>The IDs of extensions or apps that are allowed to connect. If left empty or unspecified, no
   * extensions or apps can connect.</p><p>The wildcard <code>"*"</code> will allow all extensions and
   * apps to connect.</p>
   */
  public var ids: Array<String>?

  /**
   * <p>The URL patterns for <em>web pages</em> that are allowed to connect. <em>This does not
   * affect content scripts.</em> If left empty or unspecified, no web pages can
   * connect.</p><p>Patterns cannot include wildcard domains nor subdomains of <a
   * href="http://publicsuffix.org/list/">(effective) top level domains</a>;
   * <code>*://google.com//</code> and <code>http:///.chromium.org//</code> are valid, while
   * <code>&lt;all_urls&gt;</code>, <code>http://///</code>, <code>*:///.com//</code>, and even
   * <code>http:///.appspot.com//</code> are not.</p>
   */
  public var matches: Array<String>?

  /**
   * If <code>true</code>, messages sent via $(ref:runtime.connect) or $(ref:runtime.sendMessage)
   * will set $(ref:runtime.MessageSender.tlsChannelId) if those methods request it to be. If
   * <code>false</code>, $(ref:runtime.MessageSender.tlsChannelId) will never be set under any
   * circumstance.
   */
  public var accepts_tls_channel_id: Boolean?
}
