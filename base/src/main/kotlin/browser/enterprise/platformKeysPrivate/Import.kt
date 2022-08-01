@file:JsModule("webextension-polyfill")
@file:JsQualifier("enterprise.platformKeysPrivate")

package browser.enterprise.platformKeysPrivate

import kotlin.js.Promise

/**
 * Challenge a machine key.
 *
 * @param challenge Challenge to be signed in base64.
 * @return Callback function.
 */
public external fun challengeMachineKey(challenge: String): Promise<String>

/**
 * Challenge an user key.
 *
 * @param challenge Challenge to be signed in base64.
 * @param registerKey If true, the key will be registered.
 * @return Callback function.
 */
public external fun challengeUserKey(challenge: String, registerKey: Boolean): Promise<String>
