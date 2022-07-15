@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.tabs

import browser.tabs.infos.ConnectInfos
import browser.tabs.infos.HighlightInfos
import browser.tabs.infos.QueryInfos
import browser.tabs.options.GroupOptions
import browser.tabs.options.MessageOptions
import browser.tabs.properties.*

inline fun ConnectInfo(block: ConnectInfos.() -> Unit) = (js("{}") as ConnectInfos).apply(block)
inline fun MessageOption(block: MessageOptions.() -> Unit) = (js("{}") as MessageOptions).apply(block)
inline fun CreateProperty(block: CreateProperties.() -> Unit) = (js("{}") as CreateProperties).apply(block)
inline fun QueryInfo(block: QueryInfos.() -> Unit) = (js("{}") as QueryInfos).apply(block)
inline fun HighlightInfo(block: HighlightInfos.() -> Unit) = (js("{}") as HighlightInfos).apply(block)
inline fun UpdateProperty(block: UpdateProperties.() -> Unit) = (js("{}") as UpdateProperties).apply(block)
inline fun MoveProperty(block: MoveProperties.() -> Unit) = (js("{}") as MoveProperties).apply(block)
inline fun ReloadProperty(block: ReloadProperties.() -> Unit) = (js("{}") as ReloadProperties).apply(block)
inline fun GroupOption(block: GroupOptions.() -> Unit) = (js("{}") as GroupOptions).apply(block)
inline fun CreateGroupProperty(block: CreateGroupProperties.() -> Unit) = (js("{}") as CreateGroupProperties).apply(block)
inline fun ZoomSettings(block: ZoomSettings.() -> Unit) = (js("{}") as ZoomSettings).apply(block)