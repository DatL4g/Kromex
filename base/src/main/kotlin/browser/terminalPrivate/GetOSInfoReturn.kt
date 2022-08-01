@file:JsModule("webextension-polyfill")
@file:JsQualifier("terminalPrivate")

package browser.terminalPrivate

/**
 * Information about which features are enabled.
 */
public external interface GetOSInfoReturn {
  /**
   * True if alternative emulator flag is enabled.
   */
  public var alternative_emulator: Boolean

  /**
   * True if multi profile settings is enabled.
   */
  public var multi_profile: Boolean

  /**
   * True if tmux control mode integration is enabled.
   */
  public var tmux_integration: Boolean
}
