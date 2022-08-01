@file:JsModule("webextension-polyfill")
@file:JsQualifier("chromeWebViewInternal")

package browser.chromeWebViewInternal

/**
 * An item in the context menu.
 */
public external interface ContextMenuItem {
  /**
   * label of the item
   */
  public var label: String?

  /**
   * id of the input item
   */
  public var commandId: Int
}
