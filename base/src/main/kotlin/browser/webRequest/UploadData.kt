@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Contains data uploaded in a URL request.
 */
public external interface UploadData {
  /**
   * An ArrayBuffer with a copy of the data.
   */
  public var bytes: Any?

  /**
   * A string with the file's path and name.
   */
  public var `file`: String?
}
