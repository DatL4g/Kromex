package browser.windows

/**
 * The type of window.
 */
enum class WindowType(private val value: String) {
    normal("normal"),
    popup("popup"),
    panel("panel"),
    app("app"),
    devtools("devtools");

    override fun toString(): String = value
}