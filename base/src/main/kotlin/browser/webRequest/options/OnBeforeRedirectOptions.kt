package browser.webRequest.options

enum class OnBeforeRedirectOptions(private val value: String) {
    responseHeaders("responseHeaders"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}