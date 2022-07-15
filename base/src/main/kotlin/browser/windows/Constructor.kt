@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.windows

import browser.windows.data.CreateData
import browser.windows.infos.UpdateInfos
import browser.windows.options.QueryOptions

inline fun QueryOption(block: QueryOptions.() -> Unit) = (js("{}") as QueryOptions).apply(block)
inline fun CreateData(block: CreateData.() -> Unit) = (js("{}") as CreateData).apply(block)
inline fun UpdateInfo(block: UpdateInfos.() -> Unit) = (js("{}") as UpdateInfos).apply(block)