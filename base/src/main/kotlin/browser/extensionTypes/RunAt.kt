package browser.extensionTypes

/**
 * The soonest that the JavaScript or CSS will be injected into the tab.
 */
enum class RunAt(private val value: String) {
    document_start("document_start"),
    document_end("documeent_end"),
    document_idle("document_idle");

    override fun toString(): String = value
}