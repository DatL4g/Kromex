@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * This event is sent when the settings for any input method changed. It is sent to all extensions
 * that are listening to this event, and enabled by the user.
 */
public external interface OnSettingsChangedListener {
  /**
   * ID of the engine that changed
   */
  public var engineID: String

  /**
   * The new settings
   */
  public var settings: InputMethodSettings
}
