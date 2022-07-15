@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime

import browser.extensionTypes.DocumentLifecycle
import browser.tabs.Tab

/**
 * An object containing information about the script context that sent a message or request.
 */
external interface MessageSender {
    /**
     * The tabs.Tab which opened the connection, if any.
     * This property will only be present when the connection was opened from a tab (including content scripts), and only if the receiver is an extension, not an app.
     */
    var tab: Tab?

    /**
     * The frame that opened the connection.
     * 0 for top-level frames, positive for child frames.
     * This will only be set when tab is set.
     *
     * @see <a href='webNavigation#frame_ids'>frame</a>
     */
    var frameId: Int?

    /**
     * The guest process id of the requesting webview, if available.
     * Only available for component extensions.
     */
    var guestProcessId: Int?

    /**
     * The guest render frame routing id of the requesting webview, if available.
     * Only available for component extensions.
     */
    var guestRenderFrameRoutingId: Int?

    /**
     * The ID of the extension or app that opened the connection, if any.
     */
    var id: String?

    /**
     * The URL of the page or frame that opened the connection.
     * If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
     */
    var url: String?

    /**
     * The name of the native application that opened the connection, if any.
     */
    var nativeApplication: String?

    /**
     * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app, and if available.
     */
    var tlsChannelId: String?

    /**
     * The origin of the page or frame that opened the connection.
     * It can vary from the url property (e.g., about:blank) or can be opaque (e.g., sandboxed iframes).
     * This is useful for identifying if the origin can be trusted if we can't immediately tell from the URL.
     */
    var origin: String?

    /**
     * A UUID of the document that opened the connection.
     */
    var documentId: String?

    /**
     * The lifecycle the document that opened the connection is in at the time the port was created.
     * Note that the lifecycle state of the document may have changed since port creation.
     */
    var documentLifecycle: String?
}