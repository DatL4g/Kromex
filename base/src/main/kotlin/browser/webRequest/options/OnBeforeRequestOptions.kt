package browser.webRequest.options

enum class OnBeforeRequestOptions(private val value: String) {
    blocking("blocking"),
    requestBody("requestBody"),
    extraHeaders("extraHeaders");

    override fun toString(): String = value
}