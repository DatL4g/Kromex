@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

/**
 * Fired when an update is available, but isn't installed immediately because the app is currently
 * running. If you do nothing, the update will be installed the next time the background page gets
 * unloaded, if you want it to be installed sooner you can explicitly call chrome.runtime.reload(). If
 * your extension is using a persistent background page, the background page of course never gets
 * unloaded, so unless you call chrome.runtime.reload() manually in response to this event the update
 * will not get installed until the next time Chrome itself restarts. If no handlers are listening for
 * this event, and your extension has a persistent background page, it behaves as if
 * chrome.runtime.reload() is called in response to this event.
 */
public external interface OnUpdateAvailableListener {
  /**
   * The manifest details of the available update.
   */
  public var details: DetailsProperty
}
