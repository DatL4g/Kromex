@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.listeners

import browser.runtime.RequestUpdateCheckStatus
import browser.runtime.details.RequestUpdateCheckDetails

external interface RequestUpdateCheckListener {
    /**
     * Result of the update check.
     */
    val status: RequestUpdateCheckStatus

    /**
     * If an update is available, this contains more information about the available update.
     */
    val details: RequestUpdateCheckDetails?
}