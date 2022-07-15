@file:JsModule("webextension-polyfill")
@file:JsQualifier("runtime")

package browser.runtime.infos

external interface ConnectInfos {
    /**
     * Will be passed into onConnect for processes that are listening for the connection event.
     */
    var name: String?

    /**
     * Whether the TLS channel ID will be passed into onConnectExternal for processes that are listening for the connection event.
     */
    var includeTlsChannelId: Boolean?
}