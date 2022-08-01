@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when a tab is detached from a window; for example, because it was moved between windows.
 */
public external interface OnDetachedListener {
  public var tabId: Int

  public var detachInfo: DetachInfoProperty
}
