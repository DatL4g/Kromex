@file:JsModule("webextension-polyfill")
@file:JsQualifier("bookmarks")

package browser.bookmarks

/**
 * A node (either a bookmark or a folder) in the bookmark tree.  Child nodes are ordered within
 * their parent folder.
 */
public external interface BookmarkTreeNode {
  /**
   * The unique identifier for the node. IDs are unique within the current profile, and they remain
   * valid even after the browser is restarted.
   */
  public var id: String

  /**
   * The <code>id</code> of the parent folder.  Omitted for the root node.
   */
  public var parentId: String?

  /**
   * The 0-based position of this node within its parent folder.
   */
  public var index: Int?

  /**
   * The URL navigated to when a user clicks the bookmark. Omitted for folders.
   */
  public var url: String?

  /**
   * The text displayed for the node.
   */
  public var title: String

  /**
   * When this node was created, in milliseconds since the epoch (<code>new Date(dateAdded)</code>).
   */
  public var dateAdded: Number?

  /**
   * When the contents of this folder last changed, in milliseconds since the epoch.
   */
  public var dateGroupModified: Number?

  /**
   * Indicates the reason why this node is unmodifiable. The <var>managed</var> value indicates that
   * this node was configured by the system administrator or by the custodian of a supervised user.
   * Omitted if the node can be modified by the user and the extension (default).
   */
  public var unmodifiable: BookmarkTreeNodeUnmodifiable?

  /**
   * An ordered list of children of this node.
   */
  public var children: Array<BookmarkTreeNode>?
}
