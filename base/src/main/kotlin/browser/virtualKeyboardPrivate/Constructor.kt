@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.virtualKeyboardPrivate

public inline fun VirtualKeyboardEvent(block: VirtualKeyboardEvent.() -> Unit): VirtualKeyboardEvent
    = (js("{}") as VirtualKeyboardEvent).apply(block)

public inline fun Bounds(block: Bounds.() -> Unit): Bounds = (js("{}") as Bounds).apply(block)

public inline fun KeyboardConfig(block: KeyboardConfig.() -> Unit): KeyboardConfig = (js("{}") as
    KeyboardConfig).apply(block)

public inline fun ContainerBehaviorOptions(block: ContainerBehaviorOptions.() -> Unit):
    ContainerBehaviorOptions = (js("{}") as ContainerBehaviorOptions).apply(block)

public inline fun ClipboardItem(block: ClipboardItem.() -> Unit): ClipboardItem = (js("{}") as
    ClipboardItem).apply(block)

public inline fun GetClipboardHistoryOptions(block: GetClipboardHistoryOptions.() -> Unit):
    GetClipboardHistoryOptions = (js("{}") as GetClipboardHistoryOptions).apply(block)

public inline fun OnBoundsChangedListener(block: OnBoundsChangedListener.() -> Unit):
    OnBoundsChangedListener = (js("{}") as OnBoundsChangedListener).apply(block)

public inline
    fun OnKeyboardConfigChangedListener(block: OnKeyboardConfigChangedListener.() -> Unit):
    OnKeyboardConfigChangedListener = (js("{}") as OnKeyboardConfigChangedListener).apply(block)

public inline
    fun OnClipboardHistoryChangedListener(block: OnClipboardHistoryChangedListener.() -> Unit):
    OnClipboardHistoryChangedListener = (js("{}") as OnClipboardHistoryChangedListener).apply(block)

public inline fun OnClipboardItemUpdatedListener(block: OnClipboardItemUpdatedListener.() -> Unit):
    OnClipboardItemUpdatedListener = (js("{}") as OnClipboardItemUpdatedListener).apply(block)
