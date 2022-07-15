package browser.runtime

/**
 * he machine's processor architecture.
 */
enum class PlatformArch(private val value: String) {
    arm("arm"),
    arm64("arm64"),
    x86_32("x86-32"),
    x86_64("x86-64"),
    mips("mips"),
    mips64("mips64");

    override fun toString(): String = value
}