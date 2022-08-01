@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.proxy

public inline fun ProxyServer(block: ProxyServer.() -> Unit): ProxyServer = (js("{}") as
    ProxyServer).apply(block)

public inline fun ProxyRules(block: ProxyRules.() -> Unit): ProxyRules = (js("{}") as
    ProxyRules).apply(block)

public inline fun PacScript(block: PacScript.() -> Unit): PacScript = (js("{}") as
    PacScript).apply(block)

public inline fun ProxyConfig(block: ProxyConfig.() -> Unit): ProxyConfig = (js("{}") as
    ProxyConfig).apply(block)

public inline fun OnProxyErrorListener(block: OnProxyErrorListener.() -> Unit): OnProxyErrorListener
    = (js("{}") as OnProxyErrorListener).apply(block)
