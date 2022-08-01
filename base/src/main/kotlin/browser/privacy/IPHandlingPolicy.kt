package browser.privacy

import kotlin.String

/**
 * The IP handling policy of WebRTC.
 */
public enum class IPHandlingPolicy(
  private val `value`: String,
) {
  default("default"),
  default_public_and_private_interfaces("default_public_and_private_interfaces"),
  default_public_interface_only("default_public_interface_only"),
  disable_non_proxied_udp("disable_non_proxied_udp"),
  ;

  public override fun toString(): String = value
}
