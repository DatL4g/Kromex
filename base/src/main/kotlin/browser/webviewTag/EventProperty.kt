@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

public external interface EventProperty {
  /**
   * Call this to prevent showing the context menu.
   */
  public fun preventDefault(): Nothing
}
