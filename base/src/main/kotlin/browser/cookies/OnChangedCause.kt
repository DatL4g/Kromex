package browser.cookies

import kotlin.String

/**
 * The underlying reason behind the cookie's change. If a cookie was inserted, or removed via an
 * explicit call to "chrome.cookies.remove", "cause" will be "explicit". If a cookie was automatically
 * removed due to expiry, "cause" will be "expired". If a cookie was removed due to being overwritten
 * with an already-expired expiration date, "cause" will be set to "expired_overwrite".  If a cookie
 * was automatically removed due to garbage collection, "cause" will be "evicted".  If a cookie was
 * automatically removed due to a "set" call that overwrote it, "cause" will be "overwrite". Plan your
 * response accordingly.
 */
public enum class OnChangedCause(
  private val `value`: String,
) {
  evicted("evicted"),
  expired("expired"),
  explicit("explicit"),
  expired_overwrite("expired_overwrite"),
  overwrite("overwrite"),
  ;

  public override fun toString(): String = value
}
