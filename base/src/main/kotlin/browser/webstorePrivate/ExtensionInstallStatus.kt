package browser.webstorePrivate

import kotlin.String

public enum class ExtensionInstallStatus(
  private val `value`: String,
) {
  /**
   * The extension install request feature is enabled and the extension can be requested.
   */
  can_request("can_request"),
  /**
   * The extension install request has been sent and is waiting to be reviewed.
   */
  request_pending("request_pending"),
  /**
   * The extension cannot be installed due to enterprise policy.
   */
  blocked_by_policy("blocked_by_policy"),
  /**
   * The extension can be installed.
   */
  installable("installable"),
  /**
   * The extension has been installed already and it's enabled.
   */
  enabled("enabled"),
  /**
   * The extension has been installed already but it's disabled.
   */
  disabled("disabled"),
  /**
   * The extension has been installed already but it's terminated.
   */
  terminated("terminated"),
  /**
   * The extension has been blacklisted.
   */
  blacklisted("blacklisted"),
  /**
   * The extension cannot be enabled due to lack of custodian approval for child users.
   */
  custodian_approval_required("custodian_approval_required"),
  /**
   * The extension is force installed or recommended by policy.
   */
  force_installed("force_installed"),
  ;

  public override fun toString(): String = value
}
