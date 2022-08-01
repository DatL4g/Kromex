@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeWebViewInternal")

package browser.chromeWebViewInternal

public external interface EventProperty {
  public fun preventDefault(): Nothing
}
