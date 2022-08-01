@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandler")

package browser.fileBrowserHandler

/**
 * Result of the method.
 */
public external interface SelectFileReturn {
  /**
   * Whether the file has been selected.
   */
  public var success: Boolean

  /**
   * Selected file entry. It will be null if a file hasn't been selected.
   */
  public var entry: Any?
}
