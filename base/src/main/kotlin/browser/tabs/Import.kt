@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

import browser.events.Event
import browser.extensionTypes.DeleteInjectionDetails
import browser.extensionTypes.ImageDetails
import browser.extensionTypes.InjectDetails
import browser.runtime.Port
import browser.windows.Window
import kotlin.js.Promise

/**
 * The maximum number of times that $(ref:captureVisibleTab) can be called per second.
 * $(ref:captureVisibleTab) is expensive and should not be called too often.
 */
public external val MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND: Number = definedExternally

/**
 * An ID that represents the absence of a browser tab.
 */
public external val TAB_ID_NONE: Number = definedExternally

/**
 * Retrieves details about the specified tab.
 */
public external fun `get`(tabId: Int): Promise<Tab>

/**
 * Gets the tab that this script call is being made from. May be undefined if called from a non-tab
 * context (for example, a background page or popup view).
 */
public external fun getCurrent(): Promise<Tab?>

/**
 * Connects to the content script(s) in the specified tab. The $(ref:runtime.onConnect) event is
 * fired in each content script running in the specified tab for the current extension. For more
 * details, see <a href='messaging'>Content Script Messaging</a>.
 *
 * @return A port that can be used to communicate with the content scripts running in the specified
 * tab. The port's $(ref:runtime.Port) event is fired if the tab closes or does not exist. 
 */
public external fun connect(tabId: Int, connectInfo: ConnectConnectInfo? = definedExternally): Port

/**
 * Sends a single request to the content script(s) in the specified tab, with an optional callback
 * to run when a response is sent back.  The $(ref:extension.onRequest) event is fired in each content
 * script running in the specified tab for the current extension.
 */
public external fun sendRequest(tabId: Int, request: Any): Promise<Any>?

/**
 * Sends a single message to the content script(s) in the specified tab, with an optional callback
 * to run when a response is sent back.  The $(ref:runtime.onMessage) event is fired in each content
 * script running in the specified tab for the current extension.
 * @param message The message to send. This message should be a JSON-ifiable object.
 */
public external fun sendMessage(
  tabId: Int,
  message: Any,
  options: SendMessageOptions? = definedExternally,
): Promise<Any>?

/**
 * Gets the tab that is selected in the specified window.
 *
 * @param windowId Defaults to the <a href='windows#current-window'>current window</a>.
 */
public external fun getSelected(windowId: Int? = definedExternally): Promise<Tab>

/**
 * Gets details about all tabs in the specified window.
 *
 * @param windowId Defaults to the <a href='windows#current-window'>current window</a>.
 */
public external fun getAllInWindow(windowId: Int? = definedExternally): Promise<Array<Tab>>

/**
 * Creates a new tab.
 */
public external fun create(createProperties: CreateCreateProperties): Promise<Tab>?

/**
 * Duplicates a tab.
 *
 * @param tabId The ID of the tab to duplicate.
 */
public external fun duplicate(tabId: Int): Promise<Tab?>?

/**
 * Gets all tabs that have the specified properties, or all tabs if no properties are specified.
 */
public external fun query(queryInfo: QueryQueryInfo): Promise<Array<Tab>>

/**
 * Highlights the given tabs and focuses on the first of group. Will appear to do nothing if the
 * specified tab is currently active.
 */
public external fun highlight(highlightInfo: HighlightHighlightInfo): Promise<Window>?

/**
 * Modifies the properties of a tab. Properties that are not specified in
 * <var>updateProperties</var> are not modified.
 *
 * @param tabId Defaults to the selected tab of the <a href='windows#current-window'>current
 * window</a>.
 */
public external fun update(tabId: Int? = definedExternally,
    updateProperties: UpdateUpdateProperties): Promise<Tab?>?

/**
 * Moves one or more tabs to a new position within its window, or to a new window. Note that tabs
 * can only be moved to and from normal (window.type === "normal") windows.
 *
 * @param tabIds The tab ID or list of tab IDs to move.
 */
public external fun move(tabIds: Any, moveProperties: MoveMoveProperties): Promise<Any>?

/**
 * Reload a tab.
 *
 * @param tabId The ID of the tab to reload; defaults to the selected tab of the current window.
 */
public external fun reload(tabId: Int? = definedExternally,
    reloadProperties: ReloadReloadProperties? = definedExternally): Promise<Nothing>?

/**
 * Closes one or more tabs.
 *
 * @param tabIds The tab ID or list of tab IDs to close.
 */
public external fun remove(tabIds: Any): Promise<Nothing>?

/**
 * Adds one or more tabs to a specified group, or if no group is specified, adds the given tabs to a
 * newly created group.
 */
public external fun group(options: GroupOptions): Promise<Int>?

/**
 * Removes one or more tabs from their respective groups. If any groups become empty, they are
 * deleted.
 *
 * @param tabIds The tab ID or list of tab IDs to remove from their respective groups.
 */
public external fun ungroup(tabIds: Any): Promise<Nothing>?

/**
 * Detects the primary language of the content in a tab.
 *
 * @param tabId Defaults to the active tab of the <a href='windows#current-window'>current
 * window</a>.
 */
public external fun detectLanguage(tabId: Int? = definedExternally): Promise<String>

/**
 * Captures the visible area of the currently active tab in the specified window. In order to call
 * this method, the extension must have either the <a href='declare_permissions'>&lt;all_urls&gt;</a>
 * permission or the <a href='activeTab'>activeTab</a> permission. In addition to sites that extensions
 * can normally access, this method allows extensions to capture sensitive sites that are otherwise
 * restricted, including chrome:-scheme pages, other extensions' pages, and data: URLs. These sensitive
 * sites can only be captured with the activeTab permission. File URLs may be captured only if the
 * extension has been granted file access.
 *
 * @param windowId The target window. Defaults to the <a href='windows#current-window'>current
 * window</a>.
 */
public external fun captureVisibleTab(windowId: Int? = definedExternally, options: ImageDetails? =
    definedExternally): Promise<String>

/**
 * Injects JavaScript code into a page. For details, see the <a
 * href='content_scripts#pi'>programmatic injection</a> section of the content scripts doc.
 *
 * @param tabId The ID of the tab in which to run the script; defaults to the active tab of the
 * current window.
 * @param details Details of the script to run. Either the code or the file property must be set,
 * but both may not be set at the same time.
 * @return Called after all the JavaScript has been executed.
 */
public external fun executeScript(tabId: Int? = definedExternally, details: InjectDetails):
    Promise<Array<Any>>?

/**
 * Injects CSS into a page. Styles inserted with this method can be removed with
 * $(ref:scripting.removeCSS). For details, see the <a href='content_scripts#pi'>programmatic
 * injection</a> section of the content scripts doc.
 *
 * @param tabId The ID of the tab in which to insert the CSS; defaults to the active tab of the
 * current window.
 * @param details Details of the CSS text to insert. Either the code or the file property must be
 * set, but both may not be set at the same time.
 * @return Called when all the CSS has been inserted.
 */
public external fun insertCSS(tabId: Int? = definedExternally, details: InjectDetails):
    Promise<Nothing>?

/**
 * Removes from a page CSS that was previously injected by a call to $(ref:scripting.insertCSS).
 *
 * @param tabId The ID of the tab from which to remove the CSS; defaults to the active tab of the
 * current window.
 * @param details Details of the CSS text to remove. Either the code or the file property must be
 * set, but both may not be set at the same time.
 * @return Called when all the CSS has been removed.
 */
public external fun removeCSS(tabId: Int? = definedExternally, details: DeleteInjectionDetails):
    Promise<Nothing>?

/**
 * Zooms a specified tab.
 *
 * @param tabId The ID of the tab to zoom; defaults to the active tab of the current window.
 * @param zoomFactor The new zoom factor. A value of <code>0</code> sets the tab to its current
 * default zoom factor. Values greater than <code>0</code> specify a (possibly non-default) zoom factor
 * for the tab.
 * @return Called after the zoom factor has been changed.
 */
public external fun setZoom(tabId: Int? = definedExternally, zoomFactor: Number): Promise<Nothing>?

/**
 * Gets the current zoom factor of a specified tab.
 *
 * @param tabId The ID of the tab to get the current zoom factor from; defaults to the active tab of
 * the current window.
 * @return Called with the tab's current zoom factor after it has been fetched.
 */
public external fun getZoom(tabId: Int? = definedExternally): Promise<Number>

/**
 * Sets the zoom settings for a specified tab, which define how zoom changes are handled. These
 * settings are reset to defaults upon navigating the tab.
 *
 * @param tabId The ID of the tab to change the zoom settings for; defaults to the active tab of the
 * current window.
 * @param zoomSettings Defines how zoom changes are handled and at what scope.
 * @return Called after the zoom settings are changed.
 */
public external fun setZoomSettings(tabId: Int? = definedExternally, zoomSettings: ZoomSettings):
    Promise<Nothing>?

/**
 * Gets the current zoom settings of a specified tab.
 *
 * @param tabId The ID of the tab to get the current zoom settings from; defaults to the active tab
 * of the current window.
 * @return Called with the tab's current zoom settings.
 */
public external fun getZoomSettings(tabId: Int? = definedExternally): Promise<ZoomSettings>

/**
 * Discards a tab from memory. Discarded tabs are still visible on the tab strip and are reloaded
 * when activated.
 *
 * @param tabId The ID of the tab to be discarded. If specified, the tab is discarded unless it is
 * active or already discarded. If omitted, the browser discards the least important tab. This can fail
 * if no discardable tabs exist.
 * @return Called after the operation is completed.
 */
public external fun discard(tabId: Int? = definedExternally): Promise<Tab?>?

/**
 * Go foward to the next page, if one is available.
 *
 * @param tabId The ID of the tab to navigate forward; defaults to the selected tab of the current
 * window.
 */
public external fun goForward(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Go back to the previous page, if one is available.
 *
 * @param tabId The ID of the tab to navigate back; defaults to the selected tab of the current
 * window.
 */
public external fun goBack(tabId: Int? = definedExternally): Promise<Nothing>?

/**
 * Fired when a tab is created. Note that the tab's URL and tab group membership may not be set at
 * the time this event is fired, but you can listen to onUpdated events so as to be notified when a URL
 * is set or the tab is added to a tab group.
 */
public external val onCreated: Event<OnCreatedListener, Unit> = definedExternally

/**
 * Fired when a tab is updated.
 */
public external val onUpdated: Event<OnUpdatedListener, Unit> = definedExternally

/**
 * Fired when a tab is moved within a window. Only one move event is fired, representing the tab the
 * user directly moved. Move events are not fired for the other tabs that must move in response to the
 * manually-moved tab. This event is not fired when a tab is moved between windows; for details, see
 * $(ref:tabs.onDetached).
 */
public external val onMoved: Event<OnMovedListener, Unit> = definedExternally

/**
 * Fires when the selected tab in a window changes.
 */
public external val onSelectionChanged: Event<OnSelectionChangedListener, Unit> = definedExternally

/**
 * Fires when the selected tab in a window changes. Note that the tab's URL may not be set at the
 * time this event fired, but you can listen to $(ref:tabs.onUpdated) events so as to be notified when
 * a URL is set.
 */
public external val onActiveChanged: Event<OnActiveChangedListener, Unit> = definedExternally

/**
 * Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time
 * this event fired, but you can listen to onUpdated events so as to be notified when a URL is set.
 */
public external val onActivated: Event<OnActivatedListener, Unit> = definedExternally

/**
 * Fired when the highlighted or selected tabs in a window changes.
 */
public external val onHighlightChanged: Event<OnHighlightChangedListener, Unit> = definedExternally

/**
 * Fired when the highlighted or selected tabs in a window changes.
 */
public external val onHighlighted: Event<OnHighlightedListener, Unit> = definedExternally

/**
 * Fired when a tab is detached from a window; for example, because it was moved between windows.
 */
public external val onDetached: Event<OnDetachedListener, Unit> = definedExternally

/**
 * Fired when a tab is attached to a window; for example, because it was moved between windows.
 */
public external val onAttached: Event<OnAttachedListener, Unit> = definedExternally

/**
 * Fired when a tab is closed.
 */
public external val onRemoved: Event<OnRemovedListener, Unit> = definedExternally

/**
 * Fired when a tab is replaced with another tab due to prerendering or instant.
 */
public external val onReplaced: Event<OnReplacedListener, Unit> = definedExternally

/**
 * Fired when a tab is zoomed.
 */
public external val onZoomChange: Event<OnZoomChangeListener, Unit> = definedExternally
