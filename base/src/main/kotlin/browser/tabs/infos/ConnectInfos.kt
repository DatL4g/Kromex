@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs.infos

external interface ConnectInfos {
    /**
     * Is passed into onConnect for content scripts that are listening for the connection event.
     */
    var name: String?

    /**
     * Open a port to a specific frame identified by frameId instead of all frames in the tab.
     *
     * @see <a href='webNavigation#frame_ids'>frame</a>
     */
    var frameId: Int?

    /**
     * Open a port to a specific document identified by documentId instead of all frames in the tab.
     *
     * @see <a href='webNavigation#document_ids'>document</a>
     */
    var documentId: String?
}