package browser.webRequest.options

enum class OnErrorOccurredOptions(private val value: String) {
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}