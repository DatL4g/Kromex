@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.details

import browser.runtime.OnInstalledReason

external interface InstalledDetails {
    /**
     * The reason that this event is being dispatched.
     */
    var reason: OnInstalledReason?

    /**
     * Indicates the previous version of the extension, which has just been updated.
     * This is present only if 'reason' is 'update'.
     */
    var previousVersion: String?

    /**
     * Indicates the ID of the imported shared module extension which updated.
     * This is present only if 'reason' is 'shared_module_update'.
     */
    var id: String?
}