package browser.fontSettings

import kotlin.String

/**
 * A CSS generic font family.
 */
public enum class GenericFamily(
  private val `value`: String,
) {
  standard("standard"),
  sansserif("sansserif"),
  serif("serif"),
  fixed("fixed"),
  cursive("cursive"),
  fantasy("fantasy"),
  math("math"),
  ;

  public override fun toString(): String = value
}
