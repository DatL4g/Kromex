@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

external interface AuthCredentials {
    var username: String?
    var password: String?
}