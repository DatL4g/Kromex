@file:JsModule("webextension-polyfill")
@file:JsQualifier("webRequest")

package browser.webRequest.details

import browser.webRequest.RequestBody
import browser.webRequest.ResourceType

external interface BeforeRequestDetails {
    /**
     * The ID of the request.
     * Request IDs are unique within a browser session.
     * As a result, they could be used to relate different events of the same request.
     */
    var requestId: String?

    var url: String?

    /**
     * Standard HTTP method.
     */
    var method: String?

    /**
     * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens.
     * If the document of a (sub-)frame is loaded (type is main_frame or sub_frame), frameId indicates the ID of this frame, not the ID of the outer frame.
     * Frame IDs are unique within a tab.
     */
    var frameId: Int?

    /**
     * ID of frame that wraps the frame which sent the request.
     * Set to -1 if no parent frame exists.
     */
    var parentFrameId: Int?

    /**
     * The UUID of the document making the request.
     */
    var documentId: String?

    /**
     * The UUID of the parent document owning this frame.
     * This is not set if there is no parent.
     */
    var parentDocumentId: String?

    /**
     * The lifecycle the document is in.
     */
    var documentLifecycle: String?

    /**
     * The type of frame the request occurred in.
     */
    var frameType: String?

    /**
     * Contains the HTTP request body data.
     * Only provided if extraInfoSpec contains 'requestBody'.
     */
    var requestBody: RequestBody?

    /**
     * The ID of the tab in which the request takes place.
     * Set to -1 if the request isn't related to a tab.
     */
    var tabId: Int?

    /**
     * How the requested resource will be used.
     */
    var type: ResourceType?

    /**
     * The origin where the request was initiated.
     * This does not change through redirects.
     * If this is an opaque origin, the string 'null' will be used.
     */
    var initiator: String?

    /**
     * The time when this signal is triggered, in milliseconds since the epoch.
     */
    var timeStamp: Number?
}