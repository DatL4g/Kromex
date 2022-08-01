@file:JsModule("webextension-polyfill")
@file:JsQualifier("terminalPrivate")

package browser.terminalPrivate

import browser.events.Event
import kotlin.js.Promise

/**
 * Starts new process.
 *
 * @param processName Name of the process to open. May be 'crosh' or 'vmshell'.
 * @param args Command line arguments to pass to the process.
 * @return Returns id of the launched process. If no process was launched returns -1.
 */
public external fun openTerminalProcess(processName: String, args: Array<String> =
    definedExternally): Promise<String>

/**
 * Starts new vmshell process.
 *
 * @param args Command line arguments to pass to vmshell.
 * @return Returns id of the launched vmshell process. If no process was launched returns -1.
 */
public external fun openVmshellProcess(args: Array<String> = definedExternally): Promise<String>

/**
 * Closes previously opened process from either openTerminalProcess or openVmshellProcess.
 *
 * @param id Unique id of the process we want to close.
 * @return Function that gets called when close operation is started for the process. Returns
 * success of the function.
 */
public external fun closeTerminalProcess(id: String): Promise<Boolean>?

/**
 * Sends input that will be routed to stdin of the process with the specified id.
 *
 * @param id The id of the process to which we want to send input.
 * @param input Input we are sending to the process.
 * @return Callback that will be called when sendInput method ends. Returns success.
 */
public external fun sendInput(id: String, input: String): Promise<Boolean>?

/**
 * Notify the process with the id id that terminal window size has changed.
 *
 * @param id The id of the process.
 * @param width New window width (as column count).
 * @param height New window height (as row count).
 * @return Callback that will be called when sendInput method ends. Returns success.
 */
public external fun onTerminalResize(
  id: String,
  width: Int,
  height: Int,
): Promise<Boolean>?

/**
 * Called from |onProcessOutput| when the event is dispatched to terminal extension. Observing the
 * terminal process output will be paused after |onProcessOutput| is dispatched until this method is
 * called.
 *
 * @param id The id of the process to which |onProcessOutput| was dispatched.
 */
public external fun ackOutput(id: String): Nothing

/**
 * Open a Terminal app window/tab
 */
public external fun openWindow(`data`: OpenWindowData? = definedExternally): Nothing

/**
 * Open the Terminal Settings page.
 *
 * @return Callback that will be called when complete.
 */
public external fun openOptionsPage(): Promise<Nothing>

/**
 * Open the System Settings at the specified subpage.
 *
 * @param subpage Name of subpage to open.  Currently only 'crostini' supported.
 * @return Callback that will be called when complete.
 */
public external fun openSettingsSubpage(subpage: String): Promise<Nothing>

/**
 * Returns an object containing info about ChromeOS settings that affect the Terminal, e.g. which
 * feature flags are enabled.
 *
 * @return Callback that will be called with the info object.
 */
public external fun getOSInfo(): Promise<GetOSInfoReturn>

/**
 * Returns specified pref values, ignoring any not in allowlist.
 *
 * @param paths Paths of prefs to fetch.
 * @return Callback that will be called with prefs.
 */
public external fun getPrefs(paths: Array<String>): Promise<Any>

/**
 * Sets specified prefs, ignoring any not in allowlist.
 *
 * @param prefs Prefs to update keyed by paths.
 * @return Callback that will be called when complete.
 */
public external fun setPrefs(prefs: Any): Promise<Nothing>

/**
 * Fired when an opened process writes something to its output. Observing further process output
 * will be blocked until |ackOutput| for the terminal is called. Internally, first event argument will
 * be ID of the tab that contains terminal instance for which this event is intended. This argument
 * will be stripped before passing the event to the extension.
 */
public external val onProcessOutput: Event<OnProcessOutputListener, Unit> = definedExternally

/**
 * Fired when pref changes.
 */
public external val onPrefChanged: Event<OnPrefChangedListener, Unit> = definedExternally
