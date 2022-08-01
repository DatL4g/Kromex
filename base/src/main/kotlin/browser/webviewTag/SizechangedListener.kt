@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Fired when the embedded web content has been resized via <code>autosize</code>. Only fires if
 * <code>autosize</code> is enabled.
 */
public external interface SizechangedListener {
  /**
   * Old width of embedded web content.
   */
  public var oldWidth: Number

  /**
   * Old height of embedded web content.
   */
  public var oldHeight: Number

  /**
   * New width of embedded web content.
   */
  public var newWidth: Number

  /**
   * New height of embedded web content.
   */
  public var newHeight: Number
}
