package browser.webRequest.options

enum class OnAuthRequiredOptions(private val value: String) {
    responseHeaders("responseHeaders"),
    blocking("blocking"),
    asyncBlocking("asyncBlocking"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}