@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

import browser.events.Event
import browser.runtime.details.InstalledDetails
import browser.runtime.details.UpdateAvailableDetails
import browser.runtime.infos.ConnectInfos
import browser.runtime.infos.LastErrorInfos
import browser.runtime.infos.PlatformInfos
import browser.runtime.listeners.OnMessageListener
import browser.runtime.listeners.RequestUpdateCheckListener
import browser.runtime.options.SendMessageOptions
import browser.windows.Window
import kotlin.js.Promise

/**
 * This will be defined during an API method callback if there was an error
 */
external var lastError: LastErrorInfos = definedExternally

/**
 * The ID of the extension/app.
 */
external val id: String = definedExternally

/**
 * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app.
 * If the background page is an event page, the system will ensure it is loaded before calling the callback.
 * If there is no background page, an error is set.
 */
external fun getBackgroundPage(): Promise<Window?>?

/**
 * Open your Extension's options page, if possible.
 * The precise behavior may depend on your manifest's options_ui or options_page key, or what Chrome happens to support at the time.
 * For example, the page may be opened in a new tab, within chrome://extensions, within an App, or it may just focus an open options page.
 * It will never cause the caller page to reload.
 * If your Extension does not declare an options page, or Chrome failed to create one for some other reason, the callback will set lastError
 *
 * @see <a href=\"optionsV2\">options_ui</a>
 * @see <a href=\"options\">options_page</a>
 */
external fun openOptionsPage(): Promise<Nothing?>?

/**
 * Returns details about the app or extension from the manifest.
 * The object returned is a serialization of the full manifest file.
 *
 * @see <a href=\"manifest.html\">manifest file</a>
 * @return The manifest details.
 */
external fun getManifest(): Any

/**
 * Converts a relative path within an app/extension install directory to a fully-qualified URL.
 *
 * @param path A path to a resource within an app/extension expressed relative to its install directory.
 *
 * @return The fully-qualified URL to the resource.
 */
external fun getURL(
    path: String
): String

/**
 * Sets the URL to be visited upon uninstallation.
 * This may be used to clean up server-side data, do analytics, and implement surveys.
 * Maximum 255 characters.
 *
 * @param url URL to be opened after the extension is uninstalled.
 *            This URL must have an http: or https: scheme.
 *            Set an empty string to not open a new tab upon uninstallation.
 */
external fun setUninstallURL(
    url: String
): Promise<Nothing?>?

/**
 * Reloads the app or extension.
 * This method is not supported in kiosk mode.
 * For kiosk mode, use chrome.runtime.restart() method.
 */
external fun reload()

/**
 * Requests an immediate update check be done for this app/extension.
 *
 * Important: Most extensions/apps should not use this method, since Chrome already does automatic checks every few hours, and you can listen for the runtime.onUpdateAvailable event without needing to call requestUpdateCheck.
 *
 * This method is only appropriate to call in very limited circumstances, such as if your extension/app talks to a backend service, and the backend service has determined that the client extension/app version is very far out of date and you'd like to prompt a user to update.
 * Most other uses of requestUpdateCheck, such as calling it unconditionally based on a repeating timer, probably only serve to waste client, network, and server resources.
 */
external fun requestUpdateCheck(): Promise<RequestUpdateCheckListener?>?

/**
 * Restart the ChromeOS device when the app runs in kiosk mode.
 * Otherwise, it's no-op.
 */
external fun restart()

/**
 * Restart the ChromeOS device when the app runs in kiosk mode after the given seconds.
 * If called again before the time ends, the reboot will be delayed.
 * If called with a value of -1, the reboot will be cancelled.
 * It's a no-op in non-kiosk mode.
 * It's only allowed to be called repeatedly by the first extension to invoke this API.
 */
external fun restartAfterDelay(
    seconds: Int
): Promise<Nothing?>?

/**
 * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps.
 * This is useful for content scripts connecting to their extension processes, inter-app/extension communication, and web messaging.
 * Note that this does not connect to any listeners in a content script.
 * Extensions may connect to content scripts embedded in tabs via tabs.connect.
 *
 * @see <a href=\"manifest/externally_connectable.html\">web messaging</a>
 * @return Port through which messages can be sent and received.
 *         The port's Port onDisconnect event is fired if the extension/app does not exist.
 */
external fun connect(
    extensionId: String? = definedExternally,
    connectInfo: ConnectInfos? = definedExternally
): Port?

/**
 * Connects to a native application in the host machine.
 * See Native Messaging for more information.
 *
 * @param application The name of the registered application to connect to.
 *
 * @see <a href=\"nativeMessaging\">Native Messaging</a>
 */
external fun connectNative(
    application: String
): Port?

/**
 * Sends a single message to event listeners within your extension/app or a different extension/app.
 * Similar to runtime.connect but only sends a single message, with an optional response.
 * If sending to your extension, the runtime.onMessage event will be fired in every frame of your extension (except for the sender's frame), or $(ref:runtime.onMessageExternal), if a different extension.
 * Note that extensions cannot send messages to content scripts using this method.
 * To send messages to content scripts, use tabs.sendMessage.
 *
 * @param extensionId The ID of the extension/app to send the message to.
 *                    If omitted, the message will be sent to your own extension/app.
 *                    Required if sending messages from a web page for web messaging.
 * @param message The message to send. This message should be a JSON-ifiable object.
 *
 * @see <a href=\"manifest/externally_connectable.html\">web messaging</a>
 * @return The JSON response object sent by the handler of the message.
 *         If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
 */
external fun sendMessage(
    extensionId: String? = definedExternally,
    message: Any,
    options: SendMessageOptions? = definedExternally
): Promise<Any?>?

/**
 * Send a single message to a native application.
 *
 * @param application The name of the native messaging host.
 * @param message The message that will be passed to the native messaging host.
 *
 * @return The response message sent by the native messaging host.
 *         If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
 */
external fun sendNativeMessage(
    application: String,
    message: Any
): Promise<Any?>?

/**
 * Returns information about the current platform.
 */
external fun getPlatformInfo(): Promise<PlatformInfos?>?

/**
 * Returns a DirectoryEntry for the package directory.
 */
external fun getPackageDirectoryEntry(): Promise<Any?>? // ToDo("replace with directory entry if ever existing")

/**
 * Fired when a profile that has this extension installed first starts up.
 * This event is not fired when an incognito profile is started, even if this extension is operating in 'split' incognito mode.
 */
external val onStartup: Event<Nothing?, Unit> = definedExternally

/**
 * Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version.
 */
external val onInstalled: Event<InstalledDetails?, Unit> = definedExternally

/**
 * Sent to the event page just before it is unloaded.
 * This gives the extension opportunity to do some clean up.
 * Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete.
 * If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded.
 */
external val onSuspend: Event<Nothing?, Unit> = definedExternally

/**
 * Sent after onSuspend to indicate that the app won't be unloaded after all.
 */
external val onSuspendCanceled: Event<Nothing?, Unit> = definedExternally

/**
 * Fired when an update is available, but isn't installed immediately because the app is currently running.
 * If you do nothing, the update will be installed the next time the background page gets unloaded, if you want it to be installed sooner you can explicitly call chrome.runtime.reload().
 * If your extension is using a persistent background page, the background page of course never gets unloaded, so unless you call chrome.runtime.reload() manually in response to this event the update will not get installed until the next time Chrome itself restarts.
 * If no handlers are listening for this event, and your extension has a persistent background page, it behaves as if chrome.runtime.reload() is called in response to this event.
 */
external val onUpdateAvailable: Event<UpdateAvailableDetails?, Unit> = definedExternally

/**
 * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
 */
@Deprecated("Please use runtime.onRestartRequired.", level = DeprecationLevel.WARNING)
external val onBrowserUpdateAvailable: Event<Nothing?, Unit> = definedExternally

/**
 * Fired when a connection is made from either an extension process or a content script (by runtime.connect).
 */
external val onConnect: Event<Port?, Unit> = definedExternally

/**
 * Fired when a connection is made from another extension (by runtime.connect).
 */
external val onConnectExternal: Event<Port?, Unit> = definedExternally

/**
 * Fired when a connection is made from a native application.
 * Currently only supported on Chrome OS.
 */
external val onConnectNative: Event<Port?, Unit> = definedExternally

/**
 * Fired when a message is sent from either an extension process (by runtime.sendMessage) or a content script (by tabs.sendMessage).
 */
external val onMessage: Event<OnMessageListener?, Any> = definedExternally

/**
 * Fired when a message is sent from another extension/app (by runtime.sendMessage).
 * Cannot be used in a content script.
 */
external val onMessageExternal: Event<OnMessageListener?, Any> = definedExternally

/**
 * Fired when an app or the device that it runs on needs to be restarted.
 * The app should close all its windows at its earliest convenient time to let the restart to happen.
 * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
 * Currently, this event is only fired for Chrome OS kiosk apps.
 */
external val onRestartRequired: Event<OnRestartRequiredReason?, Unit> = definedExternally