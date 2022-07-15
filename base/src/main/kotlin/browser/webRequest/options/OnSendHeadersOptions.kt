package browser.webRequest.options

enum class OnSendHeadersOptions(private val value: String) {
    requestHeaders("requestHeaders"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}