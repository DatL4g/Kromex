package browser.webViewInternal

import kotlin.String

public enum class SetPermissionAction(
  private val `value`: String,
) {
  allow("allow"),
  deny("deny"),
  default("default"),
  ;

  public override fun toString(): String = value
}
