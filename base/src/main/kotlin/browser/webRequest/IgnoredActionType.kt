package browser.webRequest

enum class IgnoredActionType(private val value: String) {
    redirect("redirect"),
    request_headers("request_headers"),
    response_headers("response_headers"),
    auth_credentials("auth_credentials");

    override fun toString(): String = value
}