@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action

/**
 * The collection of user-specified settings relating to an extension's action.
 */
public external interface UserSettings {
  /**
   * Whether the extension's action icon is visible on browser windows' top-level toolbar (i.e.,
   * whether the extension has been 'pinned' by the user).
   */
  public var isOnToolbar: Boolean
}
