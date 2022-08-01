package browser.requirements

import kotlin.String

public enum class _3DFeature(
  private val `value`: String,
) {
  webgl("webgl"),
  css3d("css3d"),
  ;

  public override fun toString(): String = value
}
