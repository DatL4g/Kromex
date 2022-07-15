@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.runtime

import browser.runtime.infos.ConnectInfos

inline fun ConnectInfo(block: ConnectInfos.() -> Unit) = (js("{}") as ConnectInfos).apply(block)