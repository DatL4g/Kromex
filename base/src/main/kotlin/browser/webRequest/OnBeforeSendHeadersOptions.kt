package browser.webRequest

import kotlin.String

public enum class OnBeforeSendHeadersOptions(
  private val `value`: String,
) {
  requestHeaders("requestHeaders"),
  blocking("blocking"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
