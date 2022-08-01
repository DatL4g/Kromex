@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Interface which provides access to webRequest events on the guest page. See the <a
 * href="http://developer.chrome.com/extensions/webRequest">chrome.webRequest</a> extensions API for
 * details on webRequest life cycle and related concepts. Note: The <a
 * href="/extensions/webRequest#event-onActionIgnored">chrome.webRequest.onActionIgnored</a> event is
 * not supported for webviews. <p>To illustrate how usage differs from the extensions webRequest API,
 * consider the following example code which blocks any guest requests for URLs which match
 * <code>*://www.evil.com//</code>:</p><pre>webview.request.onBeforeRequest.addListener( 
 * function(details) { return {cancel: true}; },  {urls: ["*://www.evil.com//"]}, 
 * ["blocking"]);</pre><p>Additionally, this interface supports declarative webRequest rules through
 * <code>onRequest</code> and <code>onMessage</code> events. See <a
 * href="http://developer.chrome.com/extensions/declarativeWebRequest.html">declarativeWebRequest</a>
 * for API details.</p>Note that conditions and actions for declarative webview webRequests should be
 * instantiated from their <code>chrome.webViewRequest.*</code> counterparts. The following example
 * code declaratively blocks all requests to <code>"example.com"</code> on the webview
 * <code>myWebview</code>:</p><pre>var rule = {  conditions: [    new
 * chrome.webViewRequest.RequestMatcher({ url: { hostSuffix: 'example.com' } })  ],  actions: [ new
 * chrome.webViewRequest.CancelRequest() ]};myWebview.request.onRequest.addRules([rule]);</pre>
 */
public external interface WebRequestEventInterface
