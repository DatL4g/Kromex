@file:JsModule("webextension-polyfill")
@file:JsQualifier("proxy")

package browser.proxy

/**
 * An object holding proxy auto-config information. Exactly one of the fields should be non-empty.
 */
public external interface PacScript {
  /**
   * URL of the PAC file to be used.
   */
  public var url: String?

  /**
   * A PAC script.
   */
  public var `data`: String?

  /**
   * If true, an invalid PAC script will prevent the network stack from falling back to direct
   * connections. Defaults to false.
   */
  public var mandatory: Boolean?
}
