package browser.bookmarks

import kotlin.String

/**
 * Indicates the reason why this node is unmodifiable. The <var>managed</var> value indicates that
 * this node was configured by the system administrator. Omitted if the node can be modified by the
 * user and the extension (default).
 */
public enum class BookmarkTreeNodeUnmodifiable(
  private val `value`: String,
) {
  managed("managed"),
  ;

  public override fun toString(): String = value
}
