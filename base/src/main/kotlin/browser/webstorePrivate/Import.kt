@file:JsModule("webextension-polyfill")
@file:JsQualifier("webstorePrivate")

package browser.webstorePrivate

import kotlin.js.Promise

/**
 * Installs the extension corresponding to the given id
 *
 * @param expected_id The id of the extension to install.
 */
public external fun install(expected_id: String): Promise<Nothing>

/**
 * Initiates the install process for the given extension.
 *
 * @return Called when the user has either accepted/rejected the dialog, or some error occurred
 * (such as invalid manifest or icon image data).
 */
public external fun beginInstallWithManifest3(details: BeginInstallWithManifest3Details):
    Promise<Result>

/**
 * @param expected_id The id of the extension to be installed. This should match a previous call to
 * beginInstallWithManifest3.
 */
public external fun completeInstall(expected_id: String): Promise<Nothing>

public external fun enableAppLauncher(): Promise<Nothing>

/**
 * Returns the logged-in sync user login if there is one, or the empty string otherwise.
 */
public external fun getBrowserLogin(): Promise<GetBrowserLoginReturn>

/**
 * Returns the previous value set by setStoreLogin, or the empty string if there is none.
 */
public external fun getStoreLogin(): Promise<String>

/**
 * Sets a preference value with the store login.
 */
public external fun setStoreLogin(login: String): Promise<Nothing>

/**
 * Invokes a callback that returns whether WebGL is blacklisted or not.
 */
public external fun getWebGLStatus(): Promise<WebGlStatus>

/**
 * Returns whether the apps launcher is enabled or not.
 */
public external fun getIsLauncherEnabled(): Promise<Boolean>

/**
 * Returns whether the browser is in incognito mode or not.
 */
public external fun isInIncognitoMode(): Promise<Boolean>

/**
 * Returns whether the ephemeral apps feature is enabled.
 */
public external fun getEphemeralAppsEnabled(): Promise<Boolean>

/**
 * Installs an app ephemerally in Chrome (if not already fully installed) and launches the app. A
 * user gesture is required.
 *
 * @param id The extension id of the app to launch.
 */
public external fun launchEphemeralApp(id: String): Promise<Result>

/**
 * Checks if an extension installed on a Supervised User profile is pending custodian approval.
 *
 * @param id The extension id of the extension to be checked.
 */
public external fun isPendingCustodianApproval(id: String): Promise<Boolean>

/**
 * Returns a base-64 encoded referrer chain leading to the webstore page. Should only be used for
 * extension anti-abuse purposes.
 */
public external fun getReferrerChain(): Promise<String>

/**
 * Returns the install status of the extension.
 *
 * @param id The id of the extension
 * @param manifest The manifest of the extension
 */
public external fun getExtensionStatus(id: String, manifest: String? = definedExternally):
    Promise<ExtensionInstallStatus>

/**
 * Ask Chrome to send the extension request to the Admin Console.
 *
 * @param id The id of the extension to be requested. The webstore should call this after a call to
 * getExtensionStatus
 */
public external fun requestExtension(id: String): Promise<ExtensionInstallStatus>
