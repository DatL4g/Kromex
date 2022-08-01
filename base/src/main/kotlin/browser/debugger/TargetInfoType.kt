package browser.debugger

import kotlin.String

/**
 * Target type.
 */
public enum class TargetInfoType(
  private val `value`: String,
) {
  page("page"),
  background_page("background_page"),
  worker("worker"),
  other("other"),
  ;

  public override fun toString(): String = value
}
