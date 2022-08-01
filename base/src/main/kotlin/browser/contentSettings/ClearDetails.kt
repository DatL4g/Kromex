@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

public external interface ClearDetails {
  /**
   * Where to clear the setting (default: regular).
   */
  public var scope: Scope?
}
