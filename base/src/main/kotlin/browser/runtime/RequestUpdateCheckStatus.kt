package browser.runtime

/**
 * Result of the update check.
 */
enum class RequestUpdateCheckStatus(private val value: String) {
    throttled("throttled"),
    no_update("no_update"),
    update_available("update_available");

    override fun toString(): String = value
}