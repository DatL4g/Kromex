package browser.extensionTypes

/**
 * The JavaScript world for a script to execute within.
 * Can either be an isolated world, unique to this extension, or the main world of the DOM which is shared with the page's JavaScript.
 */
enum class ExecutionWorld(private val value: String) {
    ISOLATED("ISOLATED"),
    MAIN("MAIN");

    override fun toString(): String = value
}