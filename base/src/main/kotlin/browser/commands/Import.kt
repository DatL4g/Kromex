@file:JsModule("webextension-polyfill")
@file:JsQualifier("commands")

package browser.commands

import browser.events.Event
import kotlin.js.Promise

/**
 * Returns all the registered extension commands for this extension and their shortcut (if active).
 *
 * @return Called to return the registered commands.
 */
public external fun getAll(): Promise<Array<Command>>?

/**
 * Fired when a registered command is activated using a keyboard shortcut.
 */
public external val onCommand: Event<OnCommandListener, Unit> = definedExternally
