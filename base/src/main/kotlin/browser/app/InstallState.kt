package browser.app

import kotlin.String

public enum class InstallState(
  private val `value`: String,
) {
  not_installed("not_installed"),
  installed("installed"),
  disabled("disabled"),
  ;

  public override fun toString(): String = value
}
