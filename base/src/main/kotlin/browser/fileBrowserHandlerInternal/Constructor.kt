@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.fileBrowserHandlerInternal

public inline fun FileEntryInfo(block: FileEntryInfo.() -> Unit): FileEntryInfo = (js("{}") as
    FileEntryInfo).apply(block)

public inline fun FileEntryInfoForGetFile(block: FileEntryInfoForGetFile.() -> Unit):
    FileEntryInfoForGetFile = (js("{}") as FileEntryInfoForGetFile).apply(block)

public inline fun SelectFileReturn(block: SelectFileReturn.() -> Unit): SelectFileReturn = (js("{}")
    as SelectFileReturn).apply(block)

public inline fun SelectFileSelectionParams(block: SelectFileSelectionParams.() -> Unit):
    SelectFileSelectionParams = (js("{}") as SelectFileSelectionParams).apply(block)
