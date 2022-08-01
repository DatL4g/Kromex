@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is attached to a window; for example, because it was moved between windows.
 */
public external interface OnAttachedListener {
  public var tabId: Int

  public var attachInfo: AttachInfoProperty
}
