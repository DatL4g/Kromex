@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandlerInternal")

package browser.fileBrowserHandlerInternal

/**
 * Result of the method.
 */
public external interface SelectFileReturn {
  /**
   * Has the file been selected.
   */
  public var success: Boolean

  /**
   * Selected file entry.
   */
  public var entry: FileEntryInfo?

  /**
   * Selected file entry for DirectoryEngry.getFile() consumption.
   */
  public var entryForGetFile: FileEntryInfoForGetFile?
}
