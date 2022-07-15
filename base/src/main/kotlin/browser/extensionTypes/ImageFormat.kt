package browser.extensionTypes

/**
 * The format of an image.
 */
enum class ImageFormat(private val value: String) {
    jpeg("jpeg"),
    png("png");

    override fun toString(): String = value
}