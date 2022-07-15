package browser.extensionTypes

/**
 * The type of frame.
 */
enum class FrameType(private val value: String) {
    outermost_frame("outermost_frame"),
    fenced_frame("fenced_frame"),
    sub_frame("sub_frame");

    override fun toString(): String = value
}