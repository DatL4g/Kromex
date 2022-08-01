@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandlerInternal")

package browser.fileBrowserHandlerInternal

/**
 * Parameters that will be used to create new file.
 */
public external interface SelectFileSelectionParams {
  /**
   * Suggested name for the new file.
   */
  public var suggestedName: String

  /**
   * List of file extensions that the selected file can have. The list is also used to specify what
   * files to be shown in the select file dialog. Files with the listed extensions are only shown in
   * the dialog. Extensions should not include the leading '.'. Example: ['jpg', 'png']
   */
  public var allowedFileExtensions: Array<String>?
}
