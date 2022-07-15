@file:JsModule("webextension-polyfill")
@file:JsQualifier("action")

package browser.action.details

external interface TabDetails {
    /**
     * The ID of the tab to query state for. If no tab is specified, the non-tab-specific state is returned.
     */
    var tabId: Int?
}