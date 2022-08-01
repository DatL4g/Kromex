@file:JsModule("webextension-polyfill")
@file:JsQualifier("extension")

package browser.extension

import browser.events.Event
import kotlin.js.Promise

/**
 * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If
 * no error has occured lastError will be <var>undefined</var>.
 */
@Deprecated(
  message = "Please use ${'$'}(ref:runtime.lastError).",
  level = DeprecationLevel.WARNING,
)
public external var lastError: LastErrorProperty?

/**
 * True for content scripts running inside incognito tabs, and for extension pages running inside an
 * incognito process. The latter only applies to extensions with 'split' incognito_behavior.
 */
public external var inIncognitoContext: Boolean?

/**
 * Sends a single request to other listeners within the extension. Similar to
 * $(ref:runtime.connect), but only sends a single request with an optional response. The
 * $(ref:extension.onRequest) event is fired in each page of the extension.
 *
 * @param extensionId The extension ID of the extension you want to connect to. If omitted, default
 * is your own extension.
 */
public external fun sendRequest(extensionId: String? = definedExternally, request: Any):
    Promise<Any>?

/**
 * Converts a relative path within an extension install directory to a fully-qualified URL.
 *
 * @param path A path to a resource within an extension expressed relative to its install directory.
 * @return The fully-qualified URL to the resource.
 */
public external fun getURL(path: String): String

/**
 * Returns an array of the JavaScript 'window' objects for each of the pages running inside the
 * current extension.
 *
 * @return Array of global objects
 */
public external fun getViews(fetchProperties: GetViewsFetchProperties? = definedExternally): Nothing

/**
 * Returns the JavaScript 'window' object for the background page running inside the current
 * extension. Returns null if the extension has no background page.
 */
public external fun getBackgroundPage(): Any?

/**
 * Returns an array of the JavaScript 'window' objects for each of the tabs running inside the
 * current extension. If <code>windowId</code> is specified, returns only the 'window' objects of tabs
 * attached to the specified window.
 *
 * @return Array of global window objects
 */
public external fun getExtensionTabs(windowId: Int? = definedExternally): Nothing

/**
 * Retrieves the state of the extension's access to Incognito-mode. This corresponds to the
 * user-controlled per-extension 'Allowed in Incognito' setting accessible via the chrome://extensions
 * page.
 */
public external fun isAllowedIncognitoAccess(): Promise<Boolean>

/**
 * Retrieves the state of the extension's access to the 'file://' scheme. This corresponds to the
 * user-controlled per-extension 'Allow access to File URLs' setting accessible via the
 * chrome://extensions page.
 */
public external fun isAllowedFileSchemeAccess(): Promise<Boolean>

/**
 * Sets the value of the ap CGI parameter used in the extension's update URL.  This value is ignored
 * for extensions that are hosted in the Chrome Extension Gallery.
 */
public external fun setUpdateUrlData(`data`: String): Nothing

/**
 * Fired when a request is sent from either an extension process or a content script.
 */
public external val onRequest: Event<OnRequestListener, Promise<Unit>> = definedExternally

/**
 * Fired when a request is sent from another extension.
 */
public external val onRequestExternal: Event<OnRequestExternalListener, Promise<Unit>> =
    definedExternally
