package browser.webRequest

import kotlin.String

public enum class OnAuthRequiredOptions(
  private val `value`: String,
) {
  responseHeaders("responseHeaders"),
  blocking("blocking"),
  asyncBlocking("asyncBlocking"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
