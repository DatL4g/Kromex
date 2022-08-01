package browser.fontSettings

import kotlin.String

/**
 * One of<br><var>not_controllable</var>: cannot be controlled by any
 * extension<br><var>controlled_by_other_extensions</var>: controlled by extensions with higher
 * precedence<br><var>controllable_by_this_extension</var>: can be controlled by this
 * extension<br><var>controlled_by_this_extension</var>: controlled by this extension
 */
public enum class LevelOfControl(
  private val `value`: String,
) {
  not_controllable("not_controllable"),
  controlled_by_other_extensions("controlled_by_other_extensions"),
  controllable_by_this_extension("controllable_by_this_extension"),
  controlled_by_this_extension("controlled_by_this_extension"),
  ;

  public override fun toString(): String = value
}
