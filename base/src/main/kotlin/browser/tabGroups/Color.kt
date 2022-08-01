package browser.tabGroups

import kotlin.String

/**
 * The group's color.
 */
public enum class Color(
  private val `value`: String,
) {
  grey("grey"),
  blue("blue"),
  red("red"),
  yellow("yellow"),
  green("green"),
  pink("pink"),
  purple("purple"),
  cyan("cyan"),
  orange("orange"),
  ;

  public override fun toString(): String = value
}
