package browser.runtime

/**
 * The operating system Chrome is running on.
 */
enum class PlatformOs(private val value: String) {
    mac("mac"),
    win("win"),
    android("android"),
    cros("cros"),
    linux("linux"),
    openbsd("openbsd"),
    fuchsia("fuchsia");

    override fun toString(): String = value
}