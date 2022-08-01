@file:JsModule("webextension-polyfill")
@file:JsQualifier("sessions")

package browser.sessions

import browser.events.Event
import kotlin.js.Promise

/**
 * The maximum number of $(ref:sessions.Session) that will be included in a requested list.
 */
public external var MAX_SESSION_RESULTS: Any

/**
 * Gets the list of recently closed tabs and/or windows.
 */
public external fun getRecentlyClosed(filter: Filter? = definedExternally): Promise<Array<Session>>

/**
 * Retrieves all devices with synced sessions.
 */
public external fun getDevices(filter: Filter? = definedExternally): Promise<Array<Device>>

/**
 * Reopens a $(ref:windows.Window) or $(ref:tabs.Tab), with an optional callback to run when the
 * entry has been restored.
 *
 * @param sessionId The $(ref:windows.Window.sessionId), or $(ref:tabs.Tab.sessionId) to restore. If
 * this parameter is not specified, the most recently closed session is restored.
 */
public external fun restore(sessionId: String? = definedExternally): Promise<Session>?

/**
 * Fired when recently closed tabs and/or windows are changed. This event does not monitor synced
 * sessions changes.
 */
public external val onChanged: Event<Nothing, Unit> = definedExternally
