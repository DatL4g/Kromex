package browser.windows

/**
 * The state of this browser window.
 * In some circumstances a window may not be assigned a state property; for example, when querying closed windows from the sessions API.
 */
enum class WindowState(private val value: String) {
    normal("normal"),
    minimized("minimized"),
    maximized("maximized"),
    fullscreen("fullscreen"),
    locked_fullscreen("locked-fullscreen");

    override fun toString(): String = value
}