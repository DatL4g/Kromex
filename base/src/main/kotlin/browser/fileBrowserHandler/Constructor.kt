@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.fileBrowserHandler

public inline fun FileHandlerExecuteEventDetails(block: FileHandlerExecuteEventDetails.() -> Unit):
    FileHandlerExecuteEventDetails = (js("{}") as FileHandlerExecuteEventDetails).apply(block)

public inline fun SelectFileReturn(block: SelectFileReturn.() -> Unit): SelectFileReturn = (js("{}")
    as SelectFileReturn).apply(block)

public inline fun SelectFileSelectionParams(block: SelectFileSelectionParams.() -> Unit):
    SelectFileSelectionParams = (js("{}") as SelectFileSelectionParams).apply(block)

public inline fun OnExecuteListener(block: OnExecuteListener.() -> Unit): OnExecuteListener =
    (js("{}") as OnExecuteListener).apply(block)
