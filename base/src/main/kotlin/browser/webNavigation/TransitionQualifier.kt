package browser.webNavigation

import kotlin.String

public enum class TransitionQualifier(
  private val `value`: String,
) {
  client_redirect("client_redirect"),
  server_redirect("server_redirect"),
  forward_back("forward_back"),
  from_address_bar("from_address_bar"),
  ;

  public override fun toString(): String = value
}
