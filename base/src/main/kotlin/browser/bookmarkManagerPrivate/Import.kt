@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarkManagerPrivate")

package browser.bookmarkManagerPrivate

import browser.bookmarks.BookmarkTreeNode
import browser.events.Event
import kotlin.js.Promise

/**
 * Copies the given bookmarks into the clipboard.
 *
 * @param idList An array of string-valued ids
 */
public external fun copy(idList: Array<String>): Promise<Nothing>?

/**
 * Cuts the given bookmarks into the clipboard.
 *
 * @param idList An array of string-valued ids
 */
public external fun cut(idList: Array<String>): Promise<Nothing>?

/**
 * Pastes bookmarks from the clipboard into the parent folder after the last selected node.
 * @param selectedIdList An array of string-valued ids for selected bookmarks.
 */
public external fun paste(parentId: String, selectedIdList: Array<String> = definedExternally):
    Promise<Nothing>?

/**
 * Whether there are any bookmarks that can be pasted.
 *
 * @param parentId The ID of the folder to paste into.
 */
public external fun canPaste(parentId: String): Promise<Boolean>

/**
 * Sorts the children of a given folder.
 *
 * @param parentId The ID of the folder to sort the children of.
 */
public external fun sortChildren(parentId: String): Nothing

/**
 * Begins dragging a set of bookmarks.
 *
 * @param idList An array of string-valued ids.
 * @param dragNodeIndex The index of the dragged node in |idList|
 * @param isFromTouch True if the drag was initiated from touch.
 * @param x The clientX of the dragStart event
 * @param y The clientY of the dragStart event
 */
public external fun startDrag(
  idList: Array<String>,
  dragNodeIndex: Int,
  isFromTouch: Boolean,
  x: Int,
  y: Int,
): Nothing

/**
 * Performs the drop action of the drag and drop session.
 *
 * @param parentId The ID of the folder that the drop was made.
 * @param index The index of the position to drop at. If left out the dropped items will be placed
 * at the end of the existing children.
 */
public external fun drop(parentId: String, index: Int? = definedExternally): Promise<Nothing>?

/**
 * Retrieves a bookmark hierarchy from the given node.  If the node id is empty, it is the full
 * tree.  If foldersOnly is true, it will only return folders, not actual bookmarks.
 *
 * @param id ID of the root of the tree to pull.  If empty, the entire tree will be returned.
 * @param foldersOnly Pass true to only return folders.
 */
public external fun getSubtree(id: String, foldersOnly: Boolean): Promise<Array<BookmarkTreeNode>>

/**
 * Recursively removes list of bookmarks nodes.
 *
 * @param idList An array of string-valued ids.
 */
public external fun removeTrees(idList: Array<String>): Promise<Nothing>?

/**
 * Performs an undo of the last change to the bookmark model.
 */
public external fun undo(): Nothing

/**
 * Performs a redo of last undone change to the bookmark model.
 */
public external fun redo(): Nothing

/**
 * Opens the given bookmark in a new tab.
 *
 * @param id One string-valued id.
 * @param active Whether this tab should be active.
 */
public external fun openInNewTab(id: String, active: Boolean): Nothing

/**
 * Opens the given bookmarks in a new window.
 *
 * @param idList An array of string-valued ids.
 * @param incognito Whether the new window should be an incognito window.
 */
public external fun openInNewWindow(idList: Array<String>, incognito: Boolean): Nothing

/**
 * Fired when dragging bookmarks over the document.
 */
public external val onDragEnter: Event<OnDragEnterListener, Unit> = definedExternally

/**
 * Fired when the drag and drop leaves the document.
 */
public external val onDragLeave: Event<OnDragLeaveListener, Unit> = definedExternally

/**
 * Fired when the user drops bookmarks on the document.
 */
public external val onDrop: Event<OnDropListener, Unit> = definedExternally
