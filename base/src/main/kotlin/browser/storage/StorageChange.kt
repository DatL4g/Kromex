@file:JsModule("webextension-polyfill")
@file:JsQualifier("storage")

package browser.storage

public external interface StorageChange {
  /**
   * The old value of the item, if there was an old value.
   */
  public var oldValue: Any?

  /**
   * The new value of the item, if there is a new value.
   */
  public var newValue: Any?
}
