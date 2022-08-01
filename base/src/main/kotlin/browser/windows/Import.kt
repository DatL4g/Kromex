@file:JsModule("webextension-polyfill")
@file:JsQualifier("windows")

package browser.windows

import browser.events.Event
import kotlin.js.Promise

/**
 * The windowId value that represents the absence of a Chrome browser window.
 */
public external val WINDOW_ID_NONE: Number = definedExternally

/**
 * The windowId value that represents the <a href='windows#current-window'>current window</a>.
 */
public external val WINDOW_ID_CURRENT: Number = definedExternally

/**
 * Gets details about a window.
 */
public external fun `get`(windowId: Int, queryOptions: QueryOptions? = definedExternally):
    Promise<Window>

/**
 * Gets the <a href='#current-window'>current window</a>.
 */
public external fun getCurrent(queryOptions: QueryOptions? = definedExternally): Promise<Window>

/**
 * Gets the window that was most recently focused &mdash; typically the window 'on top'.
 */
public external fun getLastFocused(queryOptions: QueryOptions? = definedExternally): Promise<Window>

/**
 * Gets all windows.
 */
public external fun getAll(queryOptions: QueryOptions? = definedExternally): Promise<Array<Window>>

/**
 * Creates (opens) a new browser window with any optional sizing, position, or default URL provided.
 */
public external fun create(createData: CreateCreateData? = definedExternally): Promise<Window?>?

/**
 * Updates the properties of a window. Specify only the properties that to be changed; unspecified
 * properties are unchanged.
 */
public external fun update(windowId: Int, updateInfo: UpdateUpdateInfo): Promise<Window>?

/**
 * Removes (closes) a window and all the tabs inside it.
 */
public external fun remove(windowId: Int): Promise<Nothing>?

/**
 * Fired when a window is created.
 */
public external val onCreated: Event<OnCreatedListener, Unit> = definedExternally

/**
 * Fired when a window is removed (closed).
 */
public external val onRemoved: Event<OnRemovedListener, Unit> = definedExternally

/**
 * Fired when the currently focused window changes. Returns
 * <code>chrome.windows.WINDOW_ID_NONE</code> if all Chrome windows have lost focus. <b>Note:</b> On
 * some Linux window managers, <code>WINDOW_ID_NONE</code> is always sent immediately preceding a
 * switch from one Chrome window to another.
 */
public external val onFocusChanged: Event<OnFocusChangedListener, Unit> = definedExternally

/**
 * Fired when a window has been resized; this event is only dispatched when the new bounds are
 * committed, and not for in-progress changes.
 */
public external val onBoundsChanged: Event<OnBoundsChangedListener, Unit> = definedExternally
