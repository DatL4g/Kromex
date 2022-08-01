package browser.webstorePrivate

import kotlin.String

public enum class WebGlStatus(
  private val `value`: String,
) {
  webgl_allowed("webgl_allowed"),
  webgl_blocked("webgl_blocked"),
  ;

  public override fun toString(): String = value
}
