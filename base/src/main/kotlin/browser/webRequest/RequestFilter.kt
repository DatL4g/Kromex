@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest

/**
 * An object describing filters to apply to webRequest events.
 */
external interface RequestFilter {
    /**
     * A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out.
     */
    var urls: Array<String>?

    /**
     * A list of request types. Requests that cannot match any of the types will be filtered out.
     */
    var types: Array<ResourceType>?

    var tabId: Int?

    var windowId: Int?
}