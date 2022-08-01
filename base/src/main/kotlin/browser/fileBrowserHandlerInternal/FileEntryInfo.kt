@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandlerInternal")

package browser.fileBrowserHandlerInternal

/**
 * Information needed to build a file entry that will be returned through the API.
 */
public external interface FileEntryInfo {
  public var fileSystemName: String

  public var fileSystemRoot: String

  public var fileFullPath: String

  public var fileIsDirectory: Boolean
}
