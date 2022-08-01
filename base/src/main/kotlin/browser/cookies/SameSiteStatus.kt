package browser.cookies

import kotlin.String

/**
 * A cookie's 'SameSite' state (https://tools.ietf.org/html/draft-west-first-party-cookies).
 * 'no_restriction' corresponds to a cookie set with 'SameSite=None', 'lax' to 'SameSite=Lax', and
 * 'strict' to 'SameSite=Strict'. 'unspecified' corresponds to a cookie set without the SameSite
 * attribute.
 */
public enum class SameSiteStatus(
  private val `value`: String,
) {
  no_restriction("no_restriction"),
  lax("lax"),
  strict("strict"),
  unspecified("unspecified"),
  ;

  public override fun toString(): String = value
}
