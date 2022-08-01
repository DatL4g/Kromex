@file:JsModule("webextension-polyfill")
@file:JsQualifier("guestViewInternal")

package browser.guestViewInternal

import kotlin.js.Promise

public external fun createGuest(viewType: String, createParams: Any): Promise<Any>

public external fun destroyGuest(instanceId: Int): Promise<Nothing>?

/**
 * @param instanceId The instance ID of the guest &lt;webview&gt; process. This not exposed to
 * developers through the API.
 */
public external fun setSize(instanceId: Int, params: SizeParams): Promise<Nothing>?
