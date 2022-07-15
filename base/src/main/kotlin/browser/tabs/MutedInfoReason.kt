package browser.tabs

/**
 * An event that caused a muted state change.
 *
 * @property user A user input action set the muted state.
 * @property capture Tab capture was started, forcing a muted state change.
 * @property extension An extension, identified by the extensionId field, set the muted state.
 */
enum class MutedInfoReason(private val value: String) {
    user("user"),
    capture("capture"),
    extension("extension");

    override fun toString(): String = value
}