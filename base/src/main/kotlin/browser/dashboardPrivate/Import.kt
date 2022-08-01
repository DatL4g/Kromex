@file:JsModule("webextension-polyfill")
@file:JsQualifier("dashboardPrivate")

package browser.dashboardPrivate

import kotlin.js.Promise

/**
 * Shows a permission prompt for the given extension, for installing to a different account.
 *
 * @return Called when the user has either accepted/rejected the dialog, or some error occurred
 * (such as invalid manifest or icon image data).
 */
public external
    fun showPermissionPromptForDelegatedInstall(details: ShowPermissionPromptForDelegatedInstallDetails):
    Promise<Result>
