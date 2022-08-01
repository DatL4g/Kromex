package browser.dashboardPrivate

import kotlin.String

/**
 * Whether the API call succeeded, or the reason for failure.
 */
public enum class Result(
  private val `value`: String,
) {
  /**
   * Empty string, used to indicate success by showPermissionPromptForDelegatedInstall
   */
  empty(""),
  /**
   * An unknown error occured
   */
  unknown_error("unknown_error"),
  /**
   * The user canceled the operation
   */
  user_cancelled("user_cancelled"),
  /**
   * An invalid Chrome Web Store item ID was provided
   */
  invalid_id("invalid_id"),
  /**
   * Parsing of the extension manifest failed
   */
  manifest_error("manifest_error"),
  /**
   * Failed to retrieve the extension's icon from the Web Store, or the icon was invalid
   */
  icon_error("icon_error"),
  /**
   * An invalid icon URL was provided
   */
  invalid_icon_url("invalid_icon_url"),
  ;

  public override fun toString(): String = value
}
