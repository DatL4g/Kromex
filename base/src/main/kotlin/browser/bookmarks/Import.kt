@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

import browser.events.Event
import kotlin.js.Promise

@Deprecated(
  message = "Bookmark write operations are no longer limited by Chrome.",
  level = DeprecationLevel.WARNING,
)
public external var MAX_WRITE_OPERATIONS_PER_HOUR: Any

@Deprecated(
  message = "Bookmark write operations are no longer limited by Chrome.",
  level = DeprecationLevel.WARNING,
)
public external var MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: Any

/**
 * Retrieves the specified BookmarkTreeNode(s).
 *
 * @param idOrIdList A single string-valued id, or an array of string-valued ids
 */
public external fun `get`(idOrIdList: Any): Promise<Array<BookmarkTreeNode>>

/**
 * Retrieves the children of the specified BookmarkTreeNode id.
 */
public external fun getChildren(id: String): Promise<Array<BookmarkTreeNode>>

/**
 * Retrieves the recently added bookmarks.
 *
 * @param numberOfItems The maximum number of items to return.
 */
public external fun getRecent(numberOfItems: Int): Promise<Array<BookmarkTreeNode>>

/**
 * Retrieves the entire Bookmarks hierarchy.
 */
public external fun getTree(): Promise<Array<BookmarkTreeNode>>

/**
 * Retrieves part of the Bookmarks hierarchy, starting at the specified node.
 *
 * @param id The ID of the root of the subtree to retrieve.
 */
public external fun getSubTree(id: String): Promise<Array<BookmarkTreeNode>>

/**
 * Searches for BookmarkTreeNodes matching the given query. Queries specified with an object produce
 * BookmarkTreeNodes matching all specified properties.
 *
 * @param query Either a string of words and quoted phrases that are matched against bookmark URLs
 * and titles, or an object. If an object, the properties <code>query</code>, <code>url</code>, and
 * <code>title</code> may be specified and bookmarks matching all specified properties will be
 * produced.
 */
public external fun search(query: Any): Promise<Array<BookmarkTreeNode>>

/**
 * Creates a bookmark or folder under the specified parentId.  If url is NULL or missing, it will be
 * a folder.
 */
public external fun create(bookmark: CreateDetails): Promise<BookmarkTreeNode>?

/**
 * Moves the specified BookmarkTreeNode to the provided location.
 */
public external fun move(id: String, destination: MoveDestination): Promise<BookmarkTreeNode>?

/**
 * Updates the properties of a bookmark or folder. Specify only the properties that you want to
 * change; unspecified properties will be left unchanged.  <b>Note:</b> Currently, only 'title' and
 * 'url' are supported.
 */
public external fun update(id: String, changes: UpdateChanges): Promise<BookmarkTreeNode>?

/**
 * Removes a bookmark or an empty bookmark folder.
 */
public external fun remove(id: String): Promise<Nothing>?

/**
 * Recursively removes a bookmark folder.
 */
public external fun removeTree(id: String): Promise<Nothing>?

/**
 * Imports bookmarks from a Chrome html bookmark file
 */
public external fun `import`(): Promise<Nothing>?

/**
 * Exports bookmarks to a Chrome html bookmark file
 */
public external fun export(): Promise<Nothing>?

/**
 * Fired when a bookmark or folder is created.
 */
public external val onCreated: Event<OnCreatedListener, Unit> = definedExternally

/**
 * Fired when a bookmark or folder is removed.  When a folder is removed recursively, a single
 * notification is fired for the folder, and none for its contents.
 */
public external val onRemoved: Event<OnRemovedListener, Unit> = definedExternally

/**
 * Fired when a bookmark or folder changes.  <b>Note:</b> Currently, only title and url changes
 * trigger this.
 */
public external val onChanged: Event<OnChangedListener, Unit> = definedExternally

/**
 * Fired when a bookmark or folder is moved to a different parent folder.
 */
public external val onMoved: Event<OnMovedListener, Unit> = definedExternally

/**
 * Fired when the children of a folder have changed their order due to the order being sorted in the
 * UI.  This is not called as a result of a move().
 */
public external val onChildrenReordered: Event<OnChildrenReorderedListener, Unit> =
    definedExternally

/**
 * Fired when a bookmark import session is begun.  Expensive observers should ignore onCreated
 * updates until onImportEnded is fired.  Observers should still handle other notifications
 * immediately.
 */
public external val onImportBegan: Event<Nothing, Unit> = definedExternally

/**
 * Fired when a bookmark import session is ended.
 */
public external val onImportEnded: Event<Nothing, Unit> = definedExternally
