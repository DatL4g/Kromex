package browser.webRequest

import kotlin.String

public enum class OnBeforeRequestOptions(
  private val `value`: String,
) {
  blocking("blocking"),
  requestBody("requestBody"),
  extraHeaders("extraHeaders"),
  ;

  public override fun toString(): String = value
}
