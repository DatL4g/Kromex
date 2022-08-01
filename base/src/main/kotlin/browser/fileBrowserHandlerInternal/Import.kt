@file:JsModule("webextension-polyfill")
@file:JsQualifier("fileBrowserHandlerInternal")

package browser.fileBrowserHandlerInternal

import kotlin.js.Promise

/**
 * Prompts user to select file path under which a new file will be created. If the user selects
 * file, the file gets created or, if it already exists, truncated. The function has to be called with
 * user gesture.
 *
 * @param selectionParams Parameters that will be used to create new file.
 * @return Function called upon completion.
 */
public external fun selectFile(selectionParams: SelectFileSelectionParams):
    Promise<SelectFileReturn>
