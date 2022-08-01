@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandlerInternal")

package browser.fileBrowserHandlerInternal

/**
 * Information needed to build a file entry using DirectoryEntry.getFile() that will be returned
 * through the API.
 */
public external interface FileEntryInfoForGetFile {
  public var fileSystemId: String

  public var baseName: String

  public var entryId: String

  public var isDirectory: Boolean
}
