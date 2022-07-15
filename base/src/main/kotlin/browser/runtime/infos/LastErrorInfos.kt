@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.infos

/**
 * This will be defined during an API method callback if there was an error
 */
external interface LastErrorInfos {
    /**
     * Details about the error which occurred.
     */
    var message: String?
}