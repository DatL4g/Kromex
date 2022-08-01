@file:JsModule("webextension-polyfill")
@file:JsQualifier("input.ime")

package browser.input.ime

public external interface MenuParameters {
  /**
   * ID of the engine to use.
   */
  public var engineID: String

  /**
   * MenuItems to add or update. They will be added in the order they exist in the array.
   */
  public var items: Array<MenuItem>
}
