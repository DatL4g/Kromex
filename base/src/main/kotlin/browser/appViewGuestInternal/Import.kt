@file:JsModule("webextension-polyfill")
@file:JsQualifier("appViewGuestInternal")

package browser.appViewGuestInternal

import kotlin.js.Promise

/**
 * Attaches the specified url to the AppView with the provided instance ID.
 */
public external fun attachFrame(url: String, guestInstanceId: Int): Promise<Int>?

/**
 * Denies the embedding request made by the AppView with the provided instance ID.
 */
public external fun denyRequest(guestInstanceId: Int): Nothing
