@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows.options

import browser.windows.WindowType

external interface QueryOptions {
    /**
     * If true, the windows.Window object has a tabs property that contains a list of the tabs.Tab objects.
     * The Tab objects only contain the url, pendingUrl, title, and favIconUrl properties if the extension's manifest file includes the tabs permission.
     */
    var populate: Boolean?

    /**
     * If set, the windows.Window returned is filtered based on its type.
     * If unset, the default filter is set to ['normal', 'popup'].
     */
    var windowTypes: Array<WindowType>?
}