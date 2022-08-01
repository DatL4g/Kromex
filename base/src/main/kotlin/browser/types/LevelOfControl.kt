package browser.types

import kotlin.String

/**
 * One of<ul><li><var>not_controllable</var>: cannot be controlled by any
 * extension</li><li><var>controlled_by_other_extensions</var>: controlled by extensions with higher
 * precedence</li><li><var>controllable_by_this_extension</var>: can be controlled by this
 * extension</li><li><var>controlled_by_this_extension</var>: controlled by this extension</li></ul>
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
