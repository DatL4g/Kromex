package browser.extensionTypes

/**
 * The document lifecycle of the frame.
 */
enum class DocumentLifecycle(private val value: String) {
    prerender("prerender"),
    active("active"),
    cached("cached"),
    pending_deletion("pending_deletion");

    override fun toString(): String = value
}