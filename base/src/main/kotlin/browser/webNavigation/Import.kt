@file:JsModule("webextension-polyfill")
@file:JsQualifier("webNavigation")

package browser.webNavigation

import browser.events.Event
import kotlin.js.Promise

/**
 * Retrieves information about the given frame. A frame refers to an &lt;iframe&gt; or a
 * &lt;frame&gt; of a web page and is identified by a tab ID and a frame ID.
 *
 * @param details Information about the frame to retrieve information about.
 */
public external fun getFrame(details: GetFrameDetails): Promise<GetFrameReturn?>

/**
 * Retrieves information about all frames of a given tab.
 *
 * @param details Information about the tab to retrieve all frames from.
 */
public external fun getAllFrames(details: GetAllFramesDetails): Promise<Array<Any>>

/**
 * Fired when a navigation is about to occur.
 */
public external val onBeforeNavigate: Event<OnBeforeNavigateListener, Unit> = definedExternally

/**
 * Fired when a navigation is committed. The document (and the resources it refers to, such as
 * images and subframes) might still be downloading, but at least part of the document has been
 * received from the server and the browser has decided to switch to the new document.
 */
public external val onCommitted: Event<OnCommittedListener, Unit> = definedExternally

/**
 * Fired when the page's DOM is fully constructed, but the referenced resources may not finish
 * loading.
 */
public external val onDOMContentLoaded: Event<OnDOMContentLoadedListener, Unit> = definedExternally

/**
 * Fired when a document, including the resources it refers to, is completely loaded and
 * initialized.
 */
public external val onCompleted: Event<OnCompletedListener, Unit> = definedExternally

/**
 * Fired when an error occurs and the navigation is aborted. This can happen if either a network
 * error occurred, or the user aborted the navigation.
 */
public external val onErrorOccurred: Event<OnErrorOccurredListener, Unit> = definedExternally

/**
 * Fired when a new window, or a new tab in an existing window, is created to host a navigation.
 */
public external val onCreatedNavigationTarget: Event<OnCreatedNavigationTargetListener, Unit> =
    definedExternally

/**
 * Fired when the reference fragment of a frame was updated. All future events for that frame will
 * use the updated URL.
 */
public external val onReferenceFragmentUpdated: Event<OnReferenceFragmentUpdatedListener, Unit> =
    definedExternally

/**
 * Fired when the contents of the tab is replaced by a different (usually previously pre-rendered)
 * tab.
 */
public external val onTabReplaced: Event<OnTabReplacedListener, Unit> = definedExternally

/**
 * Fired when the frame's history was updated to a new URL. All future events for that frame will
 * use the updated URL.
 */
public external val onHistoryStateUpdated: Event<OnHistoryStateUpdatedListener, Unit> =
    definedExternally
