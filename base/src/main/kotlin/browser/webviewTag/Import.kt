@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

import browser.events.Event
import browser.extensionTypes.ImageDetails
import kotlin.js.Promise

/**
 * Object reference which can be used to post messages into the guest page.
 */
public external val contentWindow: ContentWindow = definedExternally

/**
 * Interface which provides access to webRequest events on the guest page.
 */
public external val request: WebRequestEventInterface = definedExternally

/**
 * Similar to <a href='contextMenus'>chrome's ContextMenus API</a>, but applies to
 * <code>webview</code> instead of browser. Use the <code>webview.contextMenus</code> API to add items
 * to <code>webview</code>'s context menu. You can choose what types of objects your context menu
 * additions apply to, such as images, hyperlinks, and pages.
 */
public external val contextMenus: ContextMenus = definedExternally

/**
 * Queries audio state.
 */
public external fun getAudioState(): Promise<Boolean>

/**
 * Sets audio mute state of the webview.
 *
 * @param mute Mute audio value
 */
public external fun setAudioMuted(mute: Boolean): Nothing

/**
 * Queries whether audio is muted.
 */
public external fun isAudioMuted(): Promise<Boolean>

/**
 * Captures the visible region of the webview.
 */
public external fun captureVisibleRegion(options: ImageDetails? = definedExternally):
    Promise<String>

/**
 * <p>Adds content script injection rules to the <code>webview</code>. When the <code>webview</code>
 * navigates to a page matching one or more rules, the associated scripts will be injected. You can
 * programmatically add rules or update existing rules.</p><p>The following example adds two rules to
 * the <code>webview</code>: 'myRule' and 'anotherRule'.</p><pre>webview.addContentScripts([  {   
 * name: 'myRule',    matches: ['http://www.foo.com//'],    css: { files: ['mystyles.css'] },    js:
 * { files: ['jquery.js', 'myscript.js'] },    run_at: 'document_start'  },  {    name:
 * 'anotherRule',    matches: ['http://www.bar.com//'],    js: { code:
 * "document.body.style.backgroundColor = 'red';" },    run_at: 'document_end'  }]); ...//
 * Navigates webview.webview.src = 'http://www.foo.com';</pre><p>You can defer addContentScripts call
 * until you needs to inject scripts.</p><p>The following example shows how to overwrite an existing
 * rule.</p><pre>webview.addContentScripts([{    name: 'rule',    matches: ['http://www.foo.com//'],
 *    js: { files: ['scriptA.js'] },    run_at: 'document_start'}]);// Do something.webview.src =
 * 'http://www.foo.com//'; ...// Overwrite 'rule' defined before.webview.addContentScripts([{   
 * name: 'rule',    matches: ['http://www.bar.com//'],    js: { files: ['scriptB.js'] },    run_at:
 * 'document_end'}]);</pre><p>If <code>webview</code> has been naviagted to the origin (e.g., foo.com)
 * and calls <code>webview.addContentScripts</code> to add 'myRule', you need to wait for next
 * navigation to make the scripts injected. If you want immediate injection, <code>executeScript</code>
 * will do the right thing.</p><p>Rules are preserved even if the guest process crashes or is killed or
 * even if the <code>webview</code> is reparented.</p><p>Refer to the <a
 * href='/extensions/content_scripts'>content scripts</a> documentation for more details.</p>
 *
 * @param contentScriptList Details of the content scripts to add.
 */
public external fun addContentScripts(contentScriptList: Array<ContentScriptDetails>): Nothing

/**
 * Navigates backward one history entry if possible. Equivalent to <code>go(-1)</code>.
 *
 * @return Called after the navigation has either failed or completed successfully.
 */
public external fun back(): Promise<Boolean>

/**
 * Indicates whether or not it is possible to navigate backward through history. The state of this
 * function is cached, and updated before each <code>loadcommit</code>, so the best place to call it is
 * on <code>loadcommit</code>.
 */
public external fun canGoBack(): Boolean

/**
 * Indicates whether or not it is possible to navigate forward through history. The state of this
 * function is cached, and updated before each <code>loadcommit</code>, so the best place to call it is
 * on <code>loadcommit</code>.
 */
public external fun canGoForward(): Boolean

/**
 * <p>Clears browsing data for the <code>webview</code> partition.</p>
 *
 * @param options Options determining which data to clear.
 * @param types The types of data to be cleared.
 * @return Called after the data has been successfully cleared.
 */
public external fun clearData(options: ClearDataOptions, types: ClearDataTypeSet): Promise<Nothing>

/**
 * <p>Injects JavaScript code into the guest page.</p><p>The following sample code uses script
 * injection to set the guest page's background color to red:</p><pre>webview.executeScript({ code:
 * "document.body.style.backgroundColor = 'red'" });</pre>
 *
 * @param details Details of the script to run.
 * @return Called after all the JavaScript has been executed.
 */
public external fun executeScript(details: InjectDetails): Promise<Array<Any>>

/**
 * Initiates a find-in-page request.
 *
 * @param searchText The string to find in the page.
 * @param options Options for the find request.
 * @return Called after all find results have been returned for this find request.
 */
public external fun find(searchText: String, options: FindOptions? = definedExternally):
    Promise<FindCallbackResults?>

/**
 * Navigates forward one history entry if possible. Equivalent to <code>go(1)</code>.
 *
 * @return Called after the navigation has either failed or completed successfully.
 */
public external fun forward(): Promise<Boolean>

/**
 * Returns Chrome's internal process ID for the guest web page's current process, allowing embedders
 * to know how many guests would be affected by terminating the process. Two guests will share a
 * process only if they belong to the same app and have the same <a href="#partition">storage partition
 * ID</a>. The call is synchronous and returns the embedder's cached notion of the current process ID.
 * The process ID isn't the same as the operating system's process ID.
 */
public external fun getProcessId(): Int

/**
 * Returns the user agent string used by the <code>webview</code> for guest page requests.
 */
public external fun getUserAgent(): String

/**
 * Gets the current zoom factor.
 *
 * @return Called after the current zoom factor is retrieved.
 */
public external fun getZoom(): Promise<Number>

/**
 * Gets the current zoom mode.
 *
 * @return Called with the <code>webview</code>'s current zoom mode.
 */
public external fun getZoomMode(): Promise<ZoomMode>

/**
 * Navigates to a history entry using a history index relative to the current navigation. If the
 * requested navigation is impossible, this method has no effect.
 *
 * @param relativeIndex Relative history index to which the <code>webview</code> should be
 * navigated. For example, a value of <code>2</code> will navigate forward 2 history entries if
 * possible; a value of <code>-3</code> will navigate backward 3 entries.
 * @return Called after the navigation has either failed or completed successfully.
 */
public external fun go(relativeIndex: Int): Promise<Boolean>

/**
 * Injects CSS into the guest page.
 *
 * @param details Details of the CSS to insert.
 * @return Called after the CSS has been inserted.
 */
public external fun insertCSS(details: InjectDetails): Promise<Nothing>

/**
 * Indicates whether or not the <code>webview</code>'s user agent string has been overridden by
 * $(ref:webviewTag.setUserAgentOverride).
 */
public external fun isUserAgentOverridden(): Nothing

/**
 * Prints the contents of the <code>webview</code>. This is equivalent to calling scripted print
 * function from the <code>webview</code> itself.
 */
public external fun print(): Nothing

/**
 * Reloads the current top-level page.
 */
public external fun reload(): Nothing

/**
 * <p>Removes content scripts from a <code>webview</code>.</p><p>The following example removes
 * "myRule" which was added before.</p><pre>webview.removeContentScripts(['myRule']);</pre><p>You can
 * remove all the rules by calling:</p><pre>webview.removeContentScripts();</pre>
 *
 * @param scriptNameList A list of names of content scripts that will be removed. If the list is
 * empty, all the content scripts added to the <code>webview</code> will be removed.
 */
public external fun removeContentScripts(scriptNameList: Array<String> = definedExternally): Nothing

/**
 * Override the user agent string used by the <code>webview</code> for guest page requests.
 * Overriding will cause the User-Agent Client Hint header values and the values returned by
 * <code>navigator.userAgentData</code> to be empty for guest page requests this override is applied
 * to.
 *
 * @param userAgent The user agent string to use.
 */
public external fun setUserAgentOverride(userAgent: String): Nothing

/**
 * Changes the zoom factor of the page. The scope and persistence of this change are determined by
 * the webview's current zoom mode (see $(ref:webviewTag.ZoomMode)).
 *
 * @param zoomFactor The new zoom factor.
 * @return Called after the page has been zoomed.
 */
public external fun setZoom(zoomFactor: Number): Promise<Nothing>

/**
 * Sets the zoom mode of the <code>webview</code>.
 *
 * @param ZoomMode Defines how zooming is handled in the <code>webview</code>.
 * @return Called after the zoom mode has been changed.
 */
public external fun setZoomMode(ZoomMode: ZoomMode): Promise<Nothing>

/**
 * Stops loading the current <code>webview</code> navigation if in progress.
 */
public external fun stop(): Nothing

/**
 * Ends the current find session (clearing all highlighting) and cancels all find requests in
 * progress.
 *
 * @param action Determines what to do with the active match after the find session has ended.
 * <code>clear</code> will clear the highlighting over the active match; <code>keep</code> will keep
 * the active match highlighted; <code>activate</code> will keep the active match highlighted and
 * simulate a user click on that match. The default action is <code>keep</code>.
 */
public external fun stopFinding(action: String? = definedExternally): Nothing

/**
 * Loads a data URL with a specified base URL used for relative links. Optionally, a virtual URL can
 * be provided to be shown to the user instead of the data URL.
 *
 * @param dataUrl The data URL to load.
 * @param baseUrl The base URL that will be used for relative links.
 * @param virtualUrl The URL that will be displayed to the user (in the address bar).
 */
public external fun loadDataWithBaseUrl(
  dataUrl: String,
  baseUrl: String,
  virtualUrl: String? = definedExternally,
): Nothing

/**
 * Sets spatial navigation state of the webview.
 *
 * @param enabled Spatial navigation state value.
 */
public external fun setSpatialNavigationEnabled(enabled: Boolean): Nothing

/**
 * Queries whether spatial navigation is enabled for the webview.
 */
public external fun isSpatialNavigationEnabled(): Promise<Boolean>

/**
 * Forcibly kills the guest web page's renderer process. This may affect multiple
 * <code>webview</code> tags in the current app if they share the same process, but it will not affect
 * <code>webview</code> tags in other apps.
 */
public external fun terminate(): Nothing

/**
 * Fired when the guest window attempts to close itself.<p>The following example code navigates the
 * <code>webview</code> to <code>about:blank</code> when the guest attempts to close
 * itself.</p><pre>webview.addEventListener('close', function() {  webview.src =
 * 'about:blank';});</pre>
 */
public external val close: Event<Nothing, Unit> = definedExternally

/**
 * Fired when the guest window logs a console message.<p>The following example code forwards all log
 * messages to the embedder's console without regard for log level or other
 * properties.</p><pre>webview.addEventListener('consolemessage', function(e) {  console.log('Guest
 * page logged a message: ', e.message);});</pre>
 */
public external val consolemessage: Event<ConsolemessageListener, Unit> = definedExternally

/**
 * Fired when the guest window fires a <code>load</code> event, i.e., when a new document is loaded.
 * This does <em>not</em> include page navigation within the current document or asynchronous resource
 * loads. <p>The following example code modifies the default font size of the guest's <code>body</code>
 * element after the page loads:</p><pre>webview.addEventListener('contentload', function() { 
 * webview.executeScript({ code: 'document.body.style.fontSize = "42px"' });});</pre>
 */
public external val contentload: Event<Nothing, Unit> = definedExternally

/**
 * Fired when the guest window attempts to open a modal dialog via <code>window.alert</code>,
 * <code>window.confirm</code>, or <code>window.prompt</code>.<p>Handling this event will block the
 * guest process until each event listener returns or the <code>dialog</code> object becomes
 * unreachable (if <code>preventDefault()</code> was called.)</p><p>The default behavior is to cancel
 * the dialog.</p>
 */
public external val dialog: Event<DialogListener, Unit> = definedExternally

/**
 * Fired when the process rendering the guest web content has exited.<p>The following example code
 * will show a farewell message whenever the guest page
 * crashes:</p><pre>webview.addEventListener('exit', function(e) {  if (e.reason === 'crash') {   
 * webview.src = 'data:text/plain,Goodbye, world!';  }});</pre>
 */
public external val exit: Event<ExitListener, Unit> = definedExternally

/**
 * Fired when new find results are available for an active find request. This might happen multiple
 * times for a single find request as matches are found.
 */
public external val findupdate: Event<FindupdateListener, Unit> = definedExternally

/**
 * Fired when a top-level load has aborted without committing. An error message will be printed to
 * the console unless the event is default-prevented. <p class="note"><strong>Note:</strong> When a
 * resource load is aborted, a <code>loadabort</code> event will eventually be followed by a
 * <code>loadstop</code> event, even if all committed loads since the last <code>loadstop</code> event
 * (if any) were aborted.</p><p class="note"><strong>Note:</strong> When the load of either an about
 * URL or a JavaScript URL is aborted, <code>loadabort</code> will be fired and then the
 * <code>webview</code> will be navigated to 'about:blank'.</p>
 */
public external val loadabort: Event<LoadabortListener, Unit> = definedExternally

/**
 * Fired when a load has committed. This includes navigation within the current document as well as
 * subframe document-level loads, but does <em>not</em> include asynchronous resource loads.
 */
public external val loadcommit: Event<LoadcommitListener, Unit> = definedExternally

/**
 * Fired when a top-level load request has redirected to a different URL.
 */
public external val loadredirect: Event<LoadredirectListener, Unit> = definedExternally

/**
 * Fired when a load has begun.
 */
public external val loadstart: Event<LoadstartListener, Unit> = definedExternally

/**
 * Fired when all frame-level loads in a guest page (including all its subframes) have completed.
 * This includes navigation within the current document as well as subframe document-level loads, but
 * does <em>not</em> include asynchronous resource loads. This event fires every time the number of
 * document-level loads transitions from one (or more) to zero. For example, if a page that has already
 * finished loading (i.e., <code>loadstop</code> already fired once) creates a new iframe which loads a
 * page, then a second <code>loadstop</code> will fire when the iframe page load completes. This
 * pattern is commonly observed on pages that load ads. <p class="note"><strong>Note:</strong> When a
 * committed load is aborted, a <code>loadstop</code> event will eventually follow a
 * <code>loadabort</code> event, even if all committed loads since the last <code>loadstop</code> event
 * (if any) were aborted.</p>
 */
public external val loadstop: Event<Nothing, Unit> = definedExternally

/**
 * Fired when the guest page attempts to open a new browser window.<p>The following example code
 * will create and navigate a new <code>webview</code> in the embedder for each requested new
 * window:</p><pre>webview.addEventListener('newwindow', function(e) {  var newWebview =
 * document.createElement('webview');  document.body.appendChild(newWebview); 
 * e.window.attach(newWebview);});</pre>
 */
public external val newwindow: Event<NewwindowListener, Unit> = definedExternally

/**
 * Fired when the guest page needs to request special permission from the embedder.<p>The following
 * example code will grant the guest page access to the <code>webkitGetUserMedia</code> API. Note that
 * an app using this example code must itself specify <code>audioCapture</code> and/or
 * <code>videoCapture</code> manifest
 * permissions:</p><pre>webview.addEventListener('permissionrequest', function(e) {  if (e.permission
 * === 'media') {    e.request.allow();  }});</pre>
 */
public external val permissionrequest: Event<PermissionrequestListener, Unit> = definedExternally

/**
 * Fired when the process rendering the guest web content has become responsive again after being
 * unresponsive.<p>The following example code will fade the <code>webview</code> element in or out as
 * it becomes responsive or unresponsive:</p><pre>webview.style.webkitTransition = 'opacity
 * 250ms';webview.addEventListener('unresponsive', function() {  webview.style.opacity =
 * '0.5';});webview.addEventListener('responsive', function() {  webview.style.opacity =
 * '1';});</pre>
 */
public external val responsive: Event<ResponsiveListener, Unit> = definedExternally

/**
 * Fired when the embedded web content has been resized via <code>autosize</code>. Only fires if
 * <code>autosize</code> is enabled.
 */
public external val sizechanged: Event<SizechangedListener, Unit> = definedExternally

/**
 * Fired when the process rendering the guest web content has become unresponsive. This event will
 * be generated once with a matching responsive event if the guest begins to respond again.
 */
public external val unresponsive: Event<UnresponsiveListener, Unit> = definedExternally

/**
 * Fired when the page's zoom changes.
 */
public external val zoomchange: Event<ZoomchangeListener, Unit> = definedExternally
