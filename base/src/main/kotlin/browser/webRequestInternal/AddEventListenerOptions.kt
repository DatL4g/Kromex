package browser.webRequestInternal

import kotlin.String

public enum class AddEventListenerOptions(
  private val `value`: String,
) {
  requestHeaders("requestHeaders"),
  responseHeaders("responseHeaders"),
  blocking("blocking"),
  asyncBlocking("asyncBlocking"),
  requestBody("requestBody"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
