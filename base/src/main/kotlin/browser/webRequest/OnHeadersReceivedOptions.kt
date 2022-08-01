package browser.webRequest

import kotlin.String

public enum class OnHeadersReceivedOptions(
  private val `value`: String,
) {
  blocking("blocking"),
  responseHeaders("responseHeaders"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
