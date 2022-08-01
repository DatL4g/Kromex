package browser.webRequest

import kotlin.String

public enum class OnCompletedOptions(
  private val `value`: String,
) {
  responseHeaders("responseHeaders"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
