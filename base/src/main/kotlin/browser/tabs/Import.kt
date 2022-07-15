@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

import browser.events.Event
import browser.extensionTypes.details.DeleteInjectDetails
import browser.extensionTypes.details.ImageDetails
import browser.extensionTypes.details.InjectDetails
import browser.runtime.Port
import browser.tabs.infos.*
import browser.tabs.listeners.*
import browser.tabs.options.GroupOptions
import browser.tabs.options.MessageOptions
import browser.tabs.properties.CreateProperties
import browser.tabs.properties.MoveProperties
import browser.tabs.properties.ReloadProperties
import browser.tabs.properties.UpdateProperties
import browser.windows.Window
import kotlin.js.Promise

/**
 * The maximum number of times that captureVisibleTab can be called per second.
 * captureVisibleTab is expensive and should not be called too often.
 */
external val MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND: Number

/**
 * An ID that represents the absence of a browser tab.
 */
external val TAB_ID_NONE: Number

/**
 * Retrieves details about the specified tab.
 */
external fun get(
    tabId: Int
): Promise<Tab?>?

/**
 * Gets the tab that this script call is being made from.
 * May be undefined if called from a non-tab context (for example, a background page or popup view).
 */
external fun getCurrent(): Promise<Tab?>?

/**
 * Connects to the content script(s) in the specified tab.
 * The runtime.onConnect event is fired in each content script running in the specified tab for the current extension.
 * For more details, see Content Script Messaging.
 *
 * @see <a href='messaging'>Content Script Messaging</a>
 * @return A port that can be used to communicate with the content scripts running in the specified tab.
 *         The port's runtime.Port event is fired if the tab closes or does not exist.
 */
external fun connect(
    tabId: Int,
    connectInfo: ConnectInfos? = definedExternally
): Promise<Port?>?

/**
 * Sends a single request to the content script(s) in the specified tab, with an optional callback to run when a response is sent back.
 * The extension.onRequest event is fired in each content script running in the specified tab for the current extension.
 *
 * @return The JSON response object sent by the handler of the request.
 *         If an error occurs while connecting to the specified tab, the callback is called with no arguments and runtime.lastError is set to the error message.
 */
@Deprecated("Please use runtime.sendMessage", level = DeprecationLevel.WARNING)
external fun sendRequest(
    tabId: Int,
    request: Any
): Promise<Any?>?

/**
 * Sends a single message to the content script(s) in the specified tab, with an optional callback to run when a response is sent back.
 * The runtime.onMessage event is fired in each content script running in the specified tab for the current extension.
 *
 * @param message The message to send. This message should be a JSON-ifiable object.
 *
 * @return The JSON response object sent by the handler of the message.
 *         If an error occurs while connecting to the specified tab, the callback is called with no arguments and runtime.lastError is set to the error message.
 */
external fun sendMessage(
    tabId: Int,
    message: Any,
    options: MessageOptions? = definedExternally
): Promise<Any?>?

/**
 * Gets the tab that is selected in the specified window.
 *
 * @param windowId Defaults to the current window.
 *
 * @see <a href='windows#current-window'>current window</a>
 */
@Deprecated("Please use tabs.query {active: true}.", level = DeprecationLevel.WARNING)
external fun getSelected(
    windowId: Int? = definedExternally
): Promise<Tab?>?

/**
 * Gets details about all tabs in the specified window.
 *
 * @param windowId Defaults to the current window.
 *
 * @see <a href='windows#current-window'>current window</a>
 */
@Deprecated("Please use tabs.query {windowId: windowId}.", level = DeprecationLevel.WARNING)
external fun getAllInWindow(
    windowId: Int? = definedExternally
): Promise<Array<Tab>?>?

/**
 * Creates a new tab.
 *
 * @return The created tab.
 */
external fun create(
    createProperties: CreateProperties
): Promise<Tab?>?

/**
 * Duplicates a tab.
 *
 * @param tabId The ID of the tab to duplicate.
 *
 * @return Details about the duplicated tab.
 *         The tabs.Tab object does not contain url, pendingUrl, title, and favIconUrl if the tabs permission has not been requested.
 */
external fun duplicate(
    tabId: Int
): Promise<Tab?>?

/**
 * Gets all tabs that have the specified properties, or all tabs if no properties are specified.
 */
external fun query(
    queryInfo: QueryInfos
): Promise<Array<Tab>?>?

/**
 * Highlights the given tabs and focuses on the first of group.
 * Will appear to do nothing if the specified tab is currently active.
 *
 * @return Contains details about the window whose tabs were highlighted.
 */
external fun highlight(
    highlightInfo: HighlightInfos
): Promise<Window?>?

/**
 * Modifies the properties of a tab.
 * Properties that are not specified in [updateProperties] are not modified.
 *
 * @return Details about the updated tab.
 *         The tabs.Tab object does not contain url, pendingUrl, title, and favIconUrl if the tabs permission has not been requested.
 */
external fun update(
    tabId: Int? = definedExternally,
    updateProperties: UpdateProperties
): Promise<Tab?>?

/**
 * Moves one or more tabs to a new position within its window, or to a new window.
 * Note that tabs can only be moved to and from normal (window.type === \"normal\") windows.
 *
 * @param tabIds The tab ID or list of tab IDs to move.
 *
 * @return Details about the moved tabs.
 *         Either instance of Tab or array of Tab
 */
external fun move(
    tabIds: Any,
    moveProperties: MoveProperties
): Promise<Any?>?

/**
 * Reload a tab.
 *
 * @param tabId The ID of the tab to reload; defaults to the selected tab of the current window.
 */
external fun reload(
    tabId: Int? = definedExternally,
    reloadProperties: ReloadProperties? = definedExternally
): Promise<Nothing?>?

/**
 * Closes one or more tabs.
 *
 * @param tabIds The tab ID or list of tab IDs to move.
 */
external fun remove(
    tabIds: Any
): Promise<Nothing?>?

/**
 * Adds one or more tabs to a specified group, or if no group is specified, adds the given tabs to a newly created group.
 *
 * @return The ID of the group that the tabs were added to.
 */
external fun group(
    options: GroupOptions
): Promise<Int?>?

/**
 * Removes one or more tabs from their respective groups.
 * If any groups become empty, they are deleted.
 *
 * @param tabIds The tab ID or list of tab IDs to remove from their respective groups.
 */
external fun ungroup(
    tabIds: Any
): Promise<Nothing?>?

/**
 * Detects the primary language of the content in a tab.
 *
 * @param tabId Defaults to the active tab of the current window.
 *
 * @see <a href='windows#current-window'>current window</a>
 * @return An ISO language code such as en or fr.
 *         For a complete list of languages supported by this method, see <a href='http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc'>kLanguageInfoTable</a>.
 *         The second to fourth columns are checked and the first non-NULL value is returned, except for Simplified Chinese for which zh-CN is returned.
 *         For an unknown/undefined language, und is returned.
 */
external fun detectLanguage(
    tabId: Int? = definedExternally
): Promise<String?>?

/**
 * Captures the visible area of the currently active tab in the specified window.
 * In order to call this method, the extension must have either the all_urls permission or the activeTab permission.
 * In addition to sites that extensions can normally access, this method allows extensions to capture sensitive sites that are otherwise restricted, including chrome:-scheme pages, other extensions' pages, and data: URLs.
 * These sensitive sites can only be captured with the activeTab permission.
 * File URLs may be captured only if the extension has been granted file access.
 *
 * @param windowId The target window. Defaults to the current window.
 *
 * @see <a href='windows#current-window'>current window</a>
 * @return A data URL that encodes an image of the visible area of the captured tab.
 *         May be assigned to the 'src' property of an HTML img element for display.
 */
external fun captureVisibleTab(
    windowId: Int? = definedExternally,
    options: ImageDetails? = definedExternally
): Promise<String?>?

/**
 * Injects JavaScript code into a page.
 * For details, see the programmatic injection section of the content scripts doc.
 *
 * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the current window.
 * @param details Details of the script to run.
 *                Either the code or the file property must be set, but both may not be set at the same time.
 *
 * @see <a href='content_scripts#pi'>programmatic injection</a>
 * @return Called after all the JavaScript has been executed.
 *         The result of the script in every injected frame.
 */
@Deprecated("Replaced by scripting.executeScript in Manifest V3.", level = DeprecationLevel.WARNING)
external fun executeScript(
    tabId: Int? = definedExternally,
    details: InjectDetails
): Promise<Array<Any>?>?

/**
 * Injects CSS into a page.
 * Styles inserted with this method can be removed with scripting.removeCSS.
 * For details, see the programmatic injection section of the content scripts doc.
 *
 * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the current window.
 * @param details Details of the CSS text to insert.
 *                Either the code or the file property must be set, but both may not be set at the same time.
 *
 * @see <a href='content_scripts#pi'>programmatic injection</a>
 * @return Called when all the CSS has been inserted.
 */
@Deprecated("Replaced by scripting.insertCSS in Manifest V3.", level = DeprecationLevel.WARNING)
external fun insertCSS(
    tabId: Int? = definedExternally,
    details: InjectDetails
): Promise<Nothing?>?

/**
 * Removes from a page CSS that was previously injected by a call to scripting.insertCSS.
 *
 * @param tabId The ID of the tab from which to remove the CSS; defaults to the active tab of the current window.
 * @param details Details of the CSS text to remove.
 *                Either the code or the file property must be set, but both may not be set at the same time.
 *
 * @return Called when all the CSS has been removed.
 */
@Deprecated("Replaced by scripting.removeCSS in Manifest V3.", level = DeprecationLevel.WARNING)
external fun removeCSS(
    tabId: Int? = definedExternally,
    details: DeleteInjectDetails
): Promise<Nothing?>?

/**
 * Zooms a specified tab.
 *
 * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
 * @param zoomFactor The new zoom factor.
 *                   A value of 0 sets the tab to its current default zoom factor.
 *                   Values greater than 0 specify a (possibly non-default) zoom factor for the tab.
 *
 * @return Called after the zoom factor has been changed.
 */
external fun setZoom(
    tabId: Int? = definedExternally,
    zoomFactor: Number
): Promise<Nothing?>?

/**
 * Gets the current zoom factor of a specified tab.
 *
 * @param tabId The ID of the tab to get the current zoom factor from; defaults to the active tab of the current window.
 *
 * @return Called with the tab's current zoom factor after it has been fetched.
 *         The tab's current zoom factor.
 */
external fun getZoom(
    tabId: Int? = definedExternally
): Promise<Number?>?

/**
 * Sets the zoom settings for a specified tab, which define how zoom changes are handled.
 * These settings are reset to defaults upon navigating the tab.
 *
 * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the current window.
 * @param zoomSettings Defines how zoom changes are handled and at what scope.
 *
 * @return Called after the zoom settings are changed.
 */
external fun setZoomSettings(
    tabId: Int? = definedExternally,
    zoomSettings: ZoomSettings
): Promise<Nothing?>?

/**
 * Gets the current zoom settings of a specified tab.
 *
 * @param tabId The ID of the tab to get the current zoom settings from; defaults to the active tab of the current window.
 *
 * @return Called with the tab's current zoom settings.
 *         The tab's current zoom settings.
 */
external fun getZoomSettings(
    tabId: Int? = definedExternally,
): Promise<ZoomSettings?>?

/**
 * Discards a tab from memory.
 * Discarded tabs are still visible on the tab strip and are reloaded when activated.
 *
 * @param tabId The ID of the tab to be discarded.
 *              If specified, the tab is discarded unless it is active or already discarded.
 *              If omitted, the browser discards the least important tab.
 *              This can fail if no discardable tabs exist.
 *
 * @return Called after the operation is completed.
 *         The discarded tab, if it was successfully discarded; undefined otherwise.
 */
external fun discard(
    tabId: Int? = definedExternally
): Promise<Tab?>?

/**
 * Go forward to the next page, if one is available.
 *
 * @param tabId The ID of the tab to navigate forward; defaults to the selected tab of the current window.
 */
external fun goForward(
    tabId: Int? = definedExternally
): Promise<Nothing?>?

/**
 * Go back to the previous page, if one is available.
 *
 * @param tabId The ID of the tab to navigate back; defaults to the selected tab of the current window.
 */
external fun goBack(
    tabId: Int? = definedExternally
): Promise<Nothing?>?

/**
 * Fired when a tab is created.
 * Note that the tab's URL and tab group membership may not be set at the time this event is fired, but you can listen to onUpdated events so as to be notified when a URL is set or the tab is added to a tab group.
 */
external val onCreated: Event<Tab?, Unit> = definedExternally

/**
 * Fired when a tab is updated.
 */
external val onUpdated: Event<UpdatedListener?, Unit> = definedExternally

/**
 * Fired when a tab is moved within a window.
 * Only one move event is fired, representing the tab the user directly moved.
 * Move events are not fired for the other tabs that must move in response to the manually-moved tab.
 * This event is not fired when a tab is moved between windows; for details, see tabs.onDetached.
 */
external val onMoved: Event<MovedListener?, Unit> = definedExternally

/**
 * Fires when the selected tab in a window changes.
 */
@Deprecated("Please use tabs.onActivated.", level = DeprecationLevel.WARNING)
external val onSelectionChanged: Event<SelectionChangeListener?, Unit> = definedExternally

/**
 * Fires when the selected tab in a window changes.
 * Note that the tab's URL may not be set at the time this event fired, but you can listen to tabs.onUpdated events so as to be notified when a URL is set.
 */
@Deprecated("Please use tabs.onActivated.", level = DeprecationLevel.WARNING)
external val onActiveChanged: Event<ActiveChangedListener?, Unit> = definedExternally

/**
 * Fires when the active tab in a window changes.
 * Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events so as to be notified when a URL is set.
 */
external val onActivated: Event<ActiveInfos?, Unit> = definedExternally

/**
 * Fired when the highlighted or selected tabs in a window changes.
 */
@Deprecated("Please use tabs.onHighlighted.", level = DeprecationLevel.WARNING)
external val onHighlightChanged: Event<HighlightInfos?, Unit> = definedExternally

/**
 * Fired when the highlighted or selected tabs in a window changes.
 */
external val onHighlighted: Event<HighlightInfos?, Unit> = definedExternally

/**
 * Fired when a tab is detached from a window; for example, because it was moved between windows.
 */
external val onDetached: Event<DetachedListener?, Unit> = definedExternally

/**
 * Fired when a tab is attached to a window; for example, because it was moved between windows.
 */
external val onAttached: Event<AttachedListener?, Unit> = definedExternally

/**
 * Fired when a tab is closed.
 */
external val onRemoved: Event<RemovedListener?, Unit> = definedExternally

/**
 * Fired when a tab is replaced with another tab due to prerendering or instant.
 */
external val onReplaced: Event<ReplacedListener?, Unit> = definedExternally

/**
 * Fired when a tab is zoomed.
 */
external val onZoomChange: Event<ZoomChangeInfos?, Unit> = definedExternally