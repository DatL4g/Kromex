package browser.webRequest.options

enum class OnBeforeSendHeaderOptions(private val value: String) {
    requestHeaders("requestHeaders"),
    blocking("blocking"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}