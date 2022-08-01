@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

/**
 * An object encapsulating a complete proxy configuration.
 */
public external interface ProxyConfig {
  /**
   * The proxy rules describing this configuration. Use this for 'fixed_servers' mode.
   */
  public var rules: ProxyRules?

  /**
   * The proxy auto-config (PAC) script for this configuration. Use this for 'pac_script' mode.
   */
  public var pacScript: PacScript?

  /**
   * 'direct' = Never use a proxy<br>'auto_detect' = Auto detect proxy settings<br>'pac_script' =
   * Use specified PAC script<br>'fixed_servers' = Manually specify proxy servers<br>'system' = Use
   * system proxy settings
   */
  public var mode: Mode
}
