@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.bookmarks

public inline fun BookmarkTreeNode(block: BookmarkTreeNode.() -> Unit): BookmarkTreeNode = (js("{}")
    as BookmarkTreeNode).apply(block)

public inline fun CreateDetails(block: CreateDetails.() -> Unit): CreateDetails = (js("{}") as
    CreateDetails).apply(block)

public inline fun MoveDestination(block: MoveDestination.() -> Unit): MoveDestination = (js("{}") as
    MoveDestination).apply(block)

public inline fun UpdateChanges(block: UpdateChanges.() -> Unit): UpdateChanges = (js("{}") as
    UpdateChanges).apply(block)

public inline fun OnCreatedListener(block: OnCreatedListener.() -> Unit): OnCreatedListener =
    (js("{}") as OnCreatedListener).apply(block)

public inline fun OnRemovedListener(block: OnRemovedListener.() -> Unit): OnRemovedListener =
    (js("{}") as OnRemovedListener).apply(block)

public inline fun OnChangedListener(block: OnChangedListener.() -> Unit): OnChangedListener =
    (js("{}") as OnChangedListener).apply(block)

public inline fun OnMovedListener(block: OnMovedListener.() -> Unit): OnMovedListener = (js("{}") as
    OnMovedListener).apply(block)

public inline fun OnChildrenReorderedListener(block: OnChildrenReorderedListener.() -> Unit):
    OnChildrenReorderedListener = (js("{}") as OnChildrenReorderedListener).apply(block)
