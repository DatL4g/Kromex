package browser.tabs

/**
 * The tab's loading status.
 */
enum class TabStatus(private val value: String) {
    unloaded("unloaded"),
    loading("loading"),
    complete("complete");

    override fun toString(): String = value
}