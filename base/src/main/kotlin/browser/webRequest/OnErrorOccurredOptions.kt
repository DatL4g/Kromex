package browser.webRequest

import kotlin.String

public enum class OnErrorOccurredOptions(
  private val `value`: String,
) {
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
