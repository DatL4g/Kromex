package browser.webRequest

enum class ResourceType(private val value: String) {
    main_frame("main_frame"),
    sub_frame("sub_frame"),
    stylesheet("stylesheet"),
    script("script"),
    image("image"),
    font("font"),
    `object`("object"),
    xmlhttprequest("xmlhttprequest"),
    ping("ping"),
    csp_report("csp_report"),
    media("media"),
    websocket("websocket"),
    other("other");

    override fun toString(): String = value
}