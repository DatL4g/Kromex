@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.bookmarkManagerPrivate

public inline fun BookmarkNodeDataElement(block: BookmarkNodeDataElement.() -> Unit):
    BookmarkNodeDataElement = (js("{}") as BookmarkNodeDataElement).apply(block)

public inline fun BookmarkNodeData(block: BookmarkNodeData.() -> Unit): BookmarkNodeData = (js("{}")
    as BookmarkNodeData).apply(block)

public inline fun OnDragEnterListener(block: OnDragEnterListener.() -> Unit): OnDragEnterListener =
    (js("{}") as OnDragEnterListener).apply(block)

public inline fun OnDragLeaveListener(block: OnDragLeaveListener.() -> Unit): OnDragLeaveListener =
    (js("{}") as OnDragLeaveListener).apply(block)

public inline fun OnDropListener(block: OnDropListener.() -> Unit): OnDropListener = (js("{}") as
    OnDropListener).apply(block)
