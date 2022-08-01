@file:JsModule("webextension-polyfill")
@file:JsQualifier("debugger")

package browser.debugger

import browser.events.Event
import kotlin.js.Promise

/**
 * Attaches debugger to the given target.
 *
 * @param target Debugging target to which you want to attach.
 * @param requiredVersion Required debugging protocol version ("0.1"). One can only attach to the
 * debuggee with matching major version and greater or equal minor version. List of the protocol
 * versions can be obtained <a
 * href='https://developer.chrome.com/devtools/docs/debugger-protocol'>here</a>.
 * @return Called once the attach operation succeeds or fails. Callback receives no arguments. If
 * the attach fails, $(ref:runtime.lastError) will be set to the error message.
 */
public external fun attach(target: Debuggee, requiredVersion: String): Promise<Nothing>?

/**
 * Detaches debugger from the given target.
 *
 * @param target Debugging target from which you want to detach.
 * @return Called once the detach operation succeeds or fails. Callback receives no arguments. If
 * the detach fails, $(ref:runtime.lastError) will be set to the error message.
 */
public external fun detach(target: Debuggee): Promise<Nothing>?

/**
 * Sends given command to the debugging target.
 *
 * @param target Debugging target to which you want to send the command.
 * @param method Method name. Should be one of the methods defined by the <a
 * href='https://developer.chrome.com/devtools/docs/debugger-protocol'>remote debugging protocol</a>.
 * @param commandParams JSON object with request parameters. This object must conform to the remote
 * debugging params scheme for given method.
 * @return Response body. If an error occurs while posting the message, the callback will be called
 * with no arguments and $(ref:runtime.lastError) will be set to the error message.
 */
public external fun sendCommand(
  target: Debuggee,
  method: String,
  commandParams: Any? = definedExternally,
): Promise<Any?>?

/**
 * Returns the list of available debug targets.
 */
public external fun getTargets(): Promise<Array<TargetInfo>>

/**
 * Fired whenever debugging target issues instrumentation event.
 */
public external val onEvent: Event<OnEventListener, Unit> = definedExternally

/**
 * Fired when browser terminates debugging session for the tab. This happens when either the tab is
 * being closed or Chrome DevTools is being invoked for the attached tab.
 */
public external val onDetach: Event<OnDetachListener, Unit> = definedExternally
