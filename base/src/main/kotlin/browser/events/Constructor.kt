@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.events

inline fun <C, A> Rule(block: Rule<C, A>.() -> Unit) = (js("{}") as Rule<C, A>).apply(block)
inline fun UrlFilter(block: UrlFilter.() -> Unit) = (js("{}") as UrlFilter).apply(block)