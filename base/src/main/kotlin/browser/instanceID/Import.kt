@file:JsModule("webextension-polyfill")
@file:JsQualifier("instanceID")

package browser.instanceID

import browser.events.Event
import kotlin.js.Promise

/**
 * Retrieves an identifier for the app instance. The instance ID will be returned by the
 * <code>callback</code>. The same ID will be returned as long as the application identity has not been
 * revoked or expired.
 *
 * @return Function called when the retrieval completes. It should check $(ref:runtime.lastError)
 * for error when instanceID is empty.
 */
public external fun getID(): Promise<String>

/**
 * Retrieves the time when the InstanceID has been generated. The creation time will be returned by
 * the <code>callback</code>.
 *
 * @return Function called when the retrieval completes. It should check $(ref:runtime.lastError)
 * for error when creationTime is zero.
 */
public external fun getCreationTime(): Promise<Number>

/**
 * Return a token that allows the authorized entity to access the service defined by scope.
 *
 * @param getTokenParams Parameters for getToken.
 * @return Function called when the retrieval completes. It should check $(ref:runtime.lastError)
 * for error when token is empty.
 */
public external fun getToken(getTokenParams: GetTokenGetTokenParams): Promise<String>

/**
 * Revokes a granted token.
 *
 * @param deleteTokenParams Parameters for deleteToken.
 * @return Function called when the token deletion completes. The token was revoked successfully if
 * $(ref:runtime.lastError) is not set.
 */
public external fun deleteToken(deleteTokenParams: DeleteTokenDeleteTokenParams): Promise<Nothing>

/**
 * Resets the app instance identifier and revokes all tokens associated with it.
 *
 * @return Function called when the deletion completes. The instance identifier was revoked
 * successfully if $(ref:runtime.lastError) is not set.
 */
public external fun deleteID(): Promise<Nothing>

/**
 * Fired when all the granted tokens need to be refreshed.
 */
public external val onTokenRefresh: Event<Nothing, Unit> = definedExternally
