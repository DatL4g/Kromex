@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired before showing a context menu on this <code>webview</code>. Can be used to disable this
 * context menu by calling <code>event.preventDefault()</code>.
 */
public external interface OnShowListener {
  public var event: EventProperty
}
