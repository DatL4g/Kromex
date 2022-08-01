@file:JsModule("webextension-polyfill")
@file:JsQualifier("webViewInternal")

package browser.webViewInternal

import browser.extensionTypes.ImageDetails
import browser.extensionTypes.InjectDetails
import kotlin.js.Promise

/**
 * The maximum number of times that $(ref:captureVisibleRegion) can be called per second.
 * $(ref:captureVisibleRegion) is expensive and should not be called too often.
 */
public external val MAX_CAPTURE_VISIBLE_REGION_CALLS_PER_SECOND: Number = definedExternally

/**
 * Callback that returns audio state.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 */
public external fun getAudioState(instanceId: Int): Promise<Boolean>

/**
 * Sets audio mute state.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param mute Mute audio value.
 */
public external fun setAudioMuted(instanceId: Int, mute: Boolean): Nothing

/**
 * Callback that returns whether audio is muted.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 */
public external fun isAudioMuted(instanceId: Int): Promise<Boolean>

/**
 * Injects JavaScript code into a <webview> page.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param src The src of the guest <webview> tag.
 * @param details Details of the script to run.
 * @return Called after all the JavaScript has been executed.
 */
public external fun executeScript(
  instanceId: Int,
  src: String,
  details: InjectDetails,
): Promise<Array<Any>>

/**
 * Injects CSS into a <webview> page. For details, see the <a
 * href='/extensions/content_scripts#pi'>programmatic injection</a> section of the content scripts doc.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param src The src of the guest <webview> tag.
 * @param details Details of the CSS text to insert.
 * @return Called when all the CSS has been inserted.
 */
public external fun insertCSS(
  instanceId: Int,
  src: String,
  details: InjectDetails,
): Promise<Nothing>

/**
 * Adds content scripts into a <webview> page. For details, see the <a
 * href='/extensions/content_scripts#pi'>programmatic injection</a> section of the content scripts doc.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param contentScriptList Details of the content scripts to add.
 */
public external fun addContentScripts(instanceId: Int,
    contentScriptList: Array<ContentScriptDetails>): Nothing

/**
 * Removes specified content scripts from a <webview> page. For details, see the <a
 * href='/extensions/content_scripts#pi'>programmatic injection</a> section of the content scripts doc.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param scriptNameList A list of names of content scripts that will be removed. If the list is
 * empty, all the content scripts added to the <webview> page will be removed.
 */
public external fun removeContentScripts(instanceId: Int, scriptNameList: Array<String> =
    definedExternally): Nothing

/**
 * @param instanceId The instance ID of the guest <webview> process.
 * @param zoomFactor The new zoom factor.
 * @return Called after the zoom message has been sent to the guest process.
 */
public external fun setZoom(instanceId: Int, zoomFactor: Number): Promise<Nothing>

/**
 * @param instanceId The instance ID of the guest <webview> process.
 * @return Called after the current zoom factor is retrieved.
 */
public external fun getZoom(instanceId: Int): Promise<Number>

/**
 * Sets the zoom mode of the webview.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param ZoomMode Defines how zooming is handled in the webview.
 * @return Called after the zoom mode has been changed.
 */
public external fun setZoomMode(instanceId: Int, ZoomMode: ZoomMode): Promise<Nothing>

/**
 * Gets the current zoom mode.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @return Called with the webview's current zoom mode.
 */
public external fun getZoomMode(instanceId: Int): Promise<ZoomMode>

/**
 * Initiates a find-in-page request.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param searchText The string to find in the page.
 * @return Called after all find results have been returned for this find request.
 */
public external fun find(
  instanceId: Int,
  searchText: String,
  options: FindOptions? = definedExternally,
): Promise<FindReturn?>

/**
 * Ends the current find session (clearing all highlighting) and cancels all find requests in
 * progress.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param action Determines what to do with the active match after the find session has ended.
 */
public external fun stopFinding(instanceId: Int, action: StopFindingAction? = definedExternally):
    Nothing

/**
 * Loads a data URL with a specified base URL used for relative links. Optionally, a virtual URL can
 * be provided to be shown to the user instead of the data URL.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param dataUrl The data URL to load.
 * @param baseUrl The base URL that will be used for relative links.
 * @param virtualUrl The URL that will be displayed to the user.
 * @return Called internally for the purpose of reporting errors to console.error().
 */
public external fun loadDataWithBaseUrl(
  instanceId: Int,
  dataUrl: String,
  baseUrl: String,
  virtualUrl: String? = definedExternally,
): Promise<Nothing>

public external fun go(instanceId: Int, relativeIndex: Int): Promise<Boolean>

public external fun overrideUserAgent(instanceId: Int, userAgentOverride: String): Nothing

public external fun reload(instanceId: Int): Nothing

public external fun setAllowTransparency(instanceId: Int, allow: Boolean): Nothing

public external fun setAllowScaling(instanceId: Int, allow: Boolean): Nothing

public external fun setName(instanceId: Int, frameName: String): Nothing

public external fun setPermission(
  instanceId: Int,
  requestId: Int,
  action: SetPermissionAction,
  userInput: String? = definedExternally,
): Promise<Boolean>

public external fun navigate(instanceId: Int, src: String): Nothing

public external fun stop(instanceId: Int): Nothing

public external fun terminate(instanceId: Int): Nothing

/**
 * foo
 *
 * @param instanceId The instance ID of the guest <webview> process.
 */
public external fun captureVisibleRegion(instanceId: Int, options: ImageDetails? =
    definedExternally): Promise<String>

/**
 * Sets spatial navigation state of the webview.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param spatialNavEnabled Spatial navigation state value.
 */
public external fun setSpatialNavigationEnabled(instanceId: Int, spatialNavEnabled: Boolean):
    Nothing

/**
 * Callback that returns whether whether spatial navigation is enabled for the webview.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 */
public external fun isSpatialNavigationEnabled(instanceId: Int): Promise<Boolean>

/**
 * Clears various types of browsing data stored in a storage partition of a <webview>.
 *
 * @param instanceId The instance ID of the guest <webview> process.
 * @param dataToRemove The set of data types to remove.
 * @return Called when deletion has completed.
 */
public external fun clearData(
  instanceId: Int,
  options: RemovalOptions,
  dataToRemove: DataTypeSet,
): Promise<Nothing>
