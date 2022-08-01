@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

public external interface SelectionRectProperty {
  public var left: Int

  public var top: Int

  public var width: Int

  public var height: Int
}
