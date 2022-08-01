@file:JsModule("webextension-polyfill")
@file:JsQualifier("gcm")

package browser.gcm

import browser.events.Event
import kotlin.js.Promise

/**
 * The maximum size (in bytes) of all key/value pairs in a message.
 */
public external val MAX_MESSAGE_SIZE: Number = definedExternally

/**
 * Registers the application with FCM. The registration ID will be returned by the
 * <code>callback</code>. If <code>register</code> is called again with the same list of
 * <code>senderIds</code>, the same registration ID will be returned.
 *
 * @param senderIds A list of server IDs that are allowed to send messages to the application. It
 * should contain at least one and no more than 100 sender IDs.
 * @return Function called when registration completes. It should check $(ref:runtime.lastError) for
 * error when <code>registrationId</code> is empty.
 */
public external fun register(senderIds: Array<String>): Promise<String>

/**
 * Unregisters the application from FCM.
 *
 * @return A function called after the unregistration completes. Unregistration was successful if
 * $(ref:runtime.lastError) is not set.
 */
public external fun unregister(): Promise<Nothing>

/**
 * Sends a message according to its contents.
 *
 * @param message A message to send to the other party via FCM.
 * @return A function called after the message is successfully queued for sending.
 * $(ref:runtime.lastError) should be checked, to ensure a message was sent without problems.
 */
public external fun send(message: SendMessage): Promise<String>

/**
 * Fired when a message is received through FCM.
 */
public external val onMessage: Event<OnMessageListener, Any?> = definedExternally

/**
 * Fired when a FCM server had to delete messages sent by an app server to the application. See <a
 * href='https://firebase.google.com/docs/cloud-messaging/concept-options#lifetime'>Lifetime of a
 * message</a> for details on handling this event.
 */
public external val onMessagesDeleted: Event<Nothing, Unit> = definedExternally

/**
 * Fired when it was not possible to send a message to the FCM server.
 */
public external val onSendError: Event<OnSendErrorListener, Unit> = definedExternally
