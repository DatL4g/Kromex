package browser.incognito

import kotlin.String

public enum class IncognitoMode(
  private val `value`: String,
) {
  split("split"),
  spanning("spanning"),
  not_allowed("not_allowed"),
  ;

  public override fun toString(): String = value
}
