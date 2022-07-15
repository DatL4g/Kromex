@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * An array of HTTP headers.
 * Each header is represented as a dictionary containing the keys name and either value or binaryValue.
 */
external interface HttpHeader {
    /**
     * Name of the HTTP header.
     */
    var name: String?

    /**
     * Value of the HTTP header if it can be represented by UTF-8.
     */
    var value: String?

    /**
     * Value of the HTTP header if it cannot be represented by UTF-8, stored as individual byte values (0..255).
     */
    var binaryValue: Array<Int>?
}