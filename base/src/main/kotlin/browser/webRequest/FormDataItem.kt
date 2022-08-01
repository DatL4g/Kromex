@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * Contains data passed within form data. For urlencoded form it is stored as string if data is
 * utf-8 string and as ArrayBuffer otherwise. For form-data it is ArrayBuffer. If form-data represents
 * uploading file, it is string with filename, if the filename is provided.
 */
public abstract external class FormDataItem : Any
