package browser.runtime

/**
 * The reason that this event is being dispatched.
 */
enum class OnInstalledReason(private val value: String) {
    install("install"),
    update("update"),
    chrome_update("chrome_update"),
    shared_module_update("shared_module_update");

    override fun toString(): String = value
}