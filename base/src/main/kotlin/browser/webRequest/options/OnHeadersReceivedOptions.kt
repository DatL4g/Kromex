package browser.webRequest.options

enum class OnHeadersReceivedOptions(private val value: String) {
    blocking("blocking"),
    responseHeaders("responseHeaders"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}