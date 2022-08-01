package browser.webRequest

import kotlin.String

public enum class OnSendHeadersOptions(
  private val `value`: String,
) {
  requestHeaders("requestHeaders"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
