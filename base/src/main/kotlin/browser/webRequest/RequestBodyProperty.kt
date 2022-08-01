@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

public external interface RequestBodyProperty {
  /**
   * Errors when obtaining request body data.
   */
  public var error: String?

  /**
   * If the request method is POST and the body is a sequence of key-value pairs encoded in UTF8,
   * encoded as either multipart/form-data, or application/x-www-form-urlencoded, this dictionary is
   * present and for each key contains the list of all values for that key. If the data is of another
   * media type, or if it is malformed, the dictionary is not present. An example value of this
   * dictionary is {'key': ['value1', 'value2']}.
   */
  public var formData: Any?

  /**
   * If the request method is PUT or POST, and the body is not already parsed in formData, then the
   * unparsed request body elements are contained in this array.
   */
  public var raw: Array<UploadData>?
}
