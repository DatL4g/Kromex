@file:JsModule("webextension-polyfill")
@file:JsQualifier("commandLinePrivate")

package browser.commandLinePrivate

import kotlin.js.Promise

/**
 * Returns whether a switch is specified on the command line when launching Chrome.
 *
 * @param name The name of a command line switch, without leading "--", such as
 * "enable-experimental-extension-apis".
 */
public external fun hasSwitch(name: String): Promise<Boolean>
