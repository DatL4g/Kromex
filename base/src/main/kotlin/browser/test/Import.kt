@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

import browser.events.Event
import kotlin.js.Promise

/**
 * Gives configuration options set by the test.
 */
public external fun getConfig(): Promise<GetConfigReturn>

/**
 * Notifies the browser process that test code running in the extension failed.  This is only used
 * for internal unit testing.
 */
public external fun notifyFail(message: String): Nothing

/**
 * Notifies the browser process that test code running in the extension passed.  This is only used
 * for internal unit testing.
 */
public external fun notifyPass(message: String? = definedExternally): Nothing

/**
 * Logs a message during internal unit testing.
 */
public external fun log(message: String): Nothing

/**
 * Sends a string message to the browser process, generating a Notification that C++ test code can
 * wait for.
 */
public external fun sendMessage(message: String): Promise<String>?

/**
 * Sends a result back to the browser as a result of script executing; this is handy for
 * communicating results from browser-driven script execution.
 */
public external fun sendScriptResult(result: Any): Promise<Nothing>?

public external fun callbackAdded(): Nothing

public external fun fail(message: Any? = definedExternally): Nothing

public external fun succeed(message: Any? = definedExternally): Nothing

/**
 * Returns an instance of the module system for the given context.
 *
 * @return The module system
 */
public external fun getModuleSystem(context: Any): Any?

public external fun assertTrue(test: Any, message: String? = definedExternally): Nothing

public external fun assertFalse(test: Any, message: String? = definedExternally): Nothing

public external fun checkDeepEq(expected: Any? = definedExternally, `actual`: Any? =
    definedExternally): Nothing

public external fun assertEq(
  expected: Any? = definedExternally,
  `actual`: Any? = definedExternally,
  message: String? = definedExternally,
): Nothing

public external fun assertNoLastError(): Nothing

public external fun assertLastError(expectedError: String): Nothing

public external fun assertThrows(
  self: Any? = definedExternally,
  args: Array<Any>,
  message: Any = definedExternally,
): Promise<Nothing>

/**
 * @param promise The promise to evaluate, which is expected to reject.
 * @param expectedMessage The expected error message from the promise rejection, either as a string
 * or a regular expression.
 * @return A promise that will be resolved once the assertion is complete. The promise is rejected
 * if the passed-in promise resolves unexpectedly or rejects with an unexpected error.
 */
public external fun assertPromiseRejects(promise: Promise<Any>, expectedMessage: Any): Promise<Any>

public external fun callback(expectedError: String? = definedExternally): Promise<Nothing>

public external fun listenOnce(event: Any): Promise<Nothing>

public external fun listenForever(event: Any): Promise<Nothing>

public external fun callbackPass(): Promise<Nothing>

public external fun callbackFail(expectedError: String): Promise<Nothing>

public external fun runTests(tests: Array<Any>): Nothing

public external fun getApiFeatures(): Nothing

public external fun getApiDefinitions(apiNames: Array<String> = definedExternally): Nothing

public external fun isProcessingUserGesture(): Nothing

/**
 * Runs the provided function in the context of a user gesture.
 */
public external fun runWithUserGesture(): Promise<Nothing>

/**
 * Sends a string message one round trip from the renderer to the browser process and back.
 */
public external fun waitForRoundTrip(message: String): Promise<String>

/**
 * Loads a JS script in the current JS context.
 *
 * @return A promise that will be resolved once the script is loaded.
 */
public external fun loadScript(scriptUrl: String): Promise<Any>

/**
 * Sets the function to be called when an exception occurs. By default this is a function which
 * fails the test. This is reset for every test run through $ref:test.runTests.
 */
public external fun setExceptionHandler(): Promise<SetExceptionHandlerReturn>

/**
 * Returns the wake-event-page API function, which can be called to wake up the extension's event
 * page.
 *
 * @return The API function which wakes the extension's event page
 */
public external fun getWakeEventPage(): Promise<Nothing>

/**
 * Used to test sending messages to extensions.
 */
public external val onMessage: Event<OnMessageListener, Any?> = definedExternally
