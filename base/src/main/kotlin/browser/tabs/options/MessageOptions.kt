@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.options

external interface MessageOptions {
    /**
     * Send a message to a specific frame identified by frameId instead of all frames in the tab.
     *
     * @see <a href='webNavigation#frame_ids'>frame</a>
     */
    var frameId: Int?

    /**
     * Send a message to a specific document identified by documentId instead of all frames in the tab.
     *
     * @see <a href='webNavigation#document_ids'>document</a>
     */
    var documentId: String?
}