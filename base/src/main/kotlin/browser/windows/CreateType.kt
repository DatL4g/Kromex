package browser.windows

/**
 * Specifies what type of browser window to create.
 * 'panel' is deprecated and is available only to existing whitelisted extensions on Chrome OS.
 */
enum class CreateType(private val value: String) {
    normal("normal"),
    popup("popup"),
    panel("panel");

    override fun toString(): String = value
}