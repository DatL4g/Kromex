@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.action

import browser.action.details.*

inline fun BadgeBackgroundDetails(block: BadgeBackgroundDetails.() -> Unit) = (js("{}") as BadgeBackgroundDetails).apply(block)
inline fun BadgeDetails(block: BadgeDetails.() -> Unit) = (js("{}") as BadgeDetails).apply(block)
inline fun IconDetails(block: IconDetails.() -> Unit) = (js("{}") as IconDetails).apply(block)
inline fun PopupDetails(block: PopupDetails.() -> Unit) = (js("{}") as PopupDetails).apply(block)
inline fun TabDetails(block: TabDetails.() -> Unit) = (js("{}") as TabDetails).apply(block)
inline fun TitleDetails(block: TitleDetails.() -> Unit) = (js("{}") as TitleDetails).apply(block)