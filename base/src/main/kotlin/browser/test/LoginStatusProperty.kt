@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface LoginStatusProperty {
  /**
   * Whether there's a logged-in user.
   */
  public var isLoggedIn: Boolean?

  /**
   * Whether the screen is locked.
   */
  public var isScreenLocked: Boolean?
}
