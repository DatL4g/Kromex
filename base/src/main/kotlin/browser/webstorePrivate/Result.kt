package browser.webstorePrivate

import kotlin.String

/**
 * Whether the API call succeeded, or the reason for failure.
 */
public enum class Result(
  private val `value`: String,
) {
  /**
   * Empty string, used to indicate success by beginInstallWithManifest3
   */
  empty(""),
  /**
   * Installation was successful
   */
  success("success"),
  /**
   * Function was called without a user gesture
   */
  user_gesture_required("user_gesture_required"),
  /**
   * An unknown error occured
   */
  unknown_error("unknown_error"),
  /**
   * The requested feature is not available
   */
  feature_disabled("feature_disabled"),
  /**
   * The requested feature is not availabe for this type of extension
   */
  unsupported_extension_type("unsupported_extension_type"),
  /**
   * There were unsatisfied dependencies, such as shared modules
   */
  missing_dependencies("missing_dependencies"),
  /**
   * An error occured during installation
   */
  install_error("install_error"),
  /**
   * The user canceled the operation
   */
  user_cancelled("user_cancelled"),
  /**
   * An invalid Chrome Web Store item ID was provided
   */
  invalid_id("invalid_id"),
  /**
   * The given extension is blacklisted
   */
  blacklisted("blacklisted"),
  /**
   * The given extension is blocked by management policy
   */
  blocked_by_policy("blocked_by_policy"),
  /**
   * An installation of the same extension is already in progress
   */
  install_in_progress("install_in_progress"),
  /**
   * A launch of the same extension is already in progress
   */
  launch_in_progress("launch_in_progress"),
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
  /**
   * The extension is already installed
   */
  already_installed("already_installed"),
  /**
   * The user is signed in to a child account, and not allowed to perform the operation
   */
  blocked_for_child_account("blocked_for_child_account"),
  ;

  public override fun toString(): String = value
}
