@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandler")

package browser.fileBrowserHandler

import browser.events.Event
import kotlin.js.Promise

/**
 * Prompts user to select file path under which file should be saved. When the file is selected,
 * file access permission required to use the file (read, write and create) are granted to the caller.
 * The file will not actually get created during the function call, so function caller must ensure its
 * existence before using it. The function has to be invoked with a user gesture.
 *
 * @param selectionParams Parameters that will be used while selecting the file.
 * @return Function called upon completion.
 */
public external fun selectFile(selectionParams: SelectFileSelectionParams):
    Promise<SelectFileReturn>

/**
 * Fired when file system action is executed from ChromeOS file browser.
 */
public external val onExecute: Event<OnExecuteListener, Unit> = definedExternally
