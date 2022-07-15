@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.properties

external interface ReloadProperties {
    /**
     * Whether to bypass local caching. Defaults to false.
     */
    var bypassCache: Boolean?
}