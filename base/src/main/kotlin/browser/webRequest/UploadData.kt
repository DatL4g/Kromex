@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Contains data uploaded in a URL request.
 */
external interface UploadData {
    /**
     * An ArrayBuffer with a copy of the data.
     */
    var bytes: Any?

    /**
     * A string with the file's path and name.
     */
    var file: String?
}