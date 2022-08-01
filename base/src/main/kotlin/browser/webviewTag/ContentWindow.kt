@file:JsModule("webextension-polyfill")
@file:JsQualifier("webviewTag")

package browser.webviewTag

/**
 * Messaging handle to a guest window.
 */
public external interface ContentWindow {
  /**
   * <p>Posts a message to the embedded web content as long as the embedded content is displaying a
   * page from the target origin. This method is available once the page has completed loading. Listen
   * for the <a href="#event-contentload">contentload</a> event and then call the method.</p><p>The
   * guest will be able to send replies to the embedder by posting message to <code>event.source</code>
   * on the message event it receives.</p><p>This API is identical to the <a
   * href="https://developer.mozilla.org/en-US/docs/DOM/window.postMessage">HTML5 postMessage API</a>
   * for communication between web pages. The embedder may listen for replies by adding a
   * <code>message</code> event listener to its own frame.</p>
   *
   * @param message Message object to send to the guest.
   * @param targetOrigin Specifies what the origin of the guest window must be for the event to be
   * dispatched.
   */
  public fun postMessage(message: Any, targetOrigin: String): Nothing
}
