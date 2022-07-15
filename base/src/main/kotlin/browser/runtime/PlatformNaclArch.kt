package browser.runtime

/**
 * The native client architecture.
 * This may be different from arch on some platforms.
 */
enum class PlatformNaclArch(private val value: String) {
    arm("arm"),
    x86_32("x86-32"),
    x86_64("x86-64"),
    mips("mips"),
    mips64("mips64");

    override fun toString(): String = value
}