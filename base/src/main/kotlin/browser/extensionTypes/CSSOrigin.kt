package browser.extensionTypes

/**
 * The origin of injected CSS.
 *
 * @see <a href=\"https://www.w3.org/TR/css3-cascade/#cascading-origins\">origin</a>
 */
enum class CSSOrigin(private val value: String) {
    author("author"),
    user("user");

    override fun toString(): String = value
}