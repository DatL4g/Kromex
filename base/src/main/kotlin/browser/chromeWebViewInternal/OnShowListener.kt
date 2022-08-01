@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeWebViewInternal")

package browser.chromeWebViewInternal

/**
 * Fired when context menu is about to be shown. Provides the ability to cancel the context menu by
 * calling <code>event.preventDefault()</code> from this handler.
 */
public external interface OnShowListener {
  public var event: EventProperty
}
