@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.windows

import browser.events.Event
import browser.windows.data.CreateData
import browser.windows.infos.UpdateInfos
import browser.windows.options.QueryOptions
import kotlin.js.Promise

/**
 * The windowId value that represents the absence of a Chrome browser window.
 */
external val WINDOW_ID_NONE: Number = definedExternally

/**
 * The windowId value that represents the current window.
 *
 * @see <a href='windows#current-window'>current window</a>
 */
external val WINDOW_ID_CURRENT: Number = definedExternally

/**
 * Gets details about a window.
 */
external fun get(
    windowId: Int,
    queryOptions: QueryOptions? = definedExternally
): Promise<Window?>?

/**
 * Gets the current window.
 *
 * @see <a href='#current-window'>current window</a>
 */
external fun getCurrent(
    queryOptions: QueryOptions? = definedExternally
): Promise<Window?>?

/**
 * Gets the window that was most recently focused &mdash; typically the window 'on top'.
 */
external fun getLastFocused(
    queryOptions: QueryOptions? = definedExternally
): Promise<Window?>?

/**
 * Gets all windows.
 */
external fun getAll(
    queryOptions: QueryOptions? = definedExternally
): Promise<Array<Window>?>?

/**
 * Creates (opens) a new browser window with any optional sizing, position, or default URL provided.
 *
 * @return Contains details about the created window.
 */
external fun create(
    createData: CreateData? = definedExternally
): Promise<Window?>?

/**
 * Updates the properties of a window.
 * Specify only the properties that to be changed; unspecified properties are unchanged.
 */
external fun update(
    updateInfo: UpdateInfos
): Promise<Window?>?

/**
 * Removes (closes) a window and all the tabs inside it.
 */
external fun remove(
    windowId: Int
): Promise<Nothing?>?

/**
 * Fired when a window is created.
 */
external val onCreated: Event<Window?, Unit> = definedExternally

/**
 * Fired when a window is removed (closed).
 */
external val onRemoved: Event<Int?, Unit> = definedExternally

/**
 * Fired when the currently focused window changes.
 * Returns chrome.windows.WINDOW_ID_NONE if all Chrome windows have lost focus.
 *
 * Note: On some Linux window managers, WINDOW_ID_NONE is always sent immediately preceding a switch from one Chrome window to another.
 */
external val onFocusChanged: Event<Int?, Unit> = definedExternally

/**
 * Fired when a window has been resized; this event is only dispatched when the new bounds are committed, and not for in-progress changes.
 */
external val onBoundsChanged: Event<Window?, Unit> = definedExternally