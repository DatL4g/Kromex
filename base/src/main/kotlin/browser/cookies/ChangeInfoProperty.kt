@file:JsModule("webextension-polyfill")
@file:JsQualifier("cookies")

package browser.cookies

public external interface ChangeInfoProperty {
  /**
   * True if a cookie was removed.
   */
  public var removed: Boolean

  /**
   * Information about the cookie that was set or removed.
   */
  public var cookie: Cookie

  /**
   * The underlying reason behind the cookie's change.
   */
  public var cause: OnChangedCause
}
