@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.commands

public inline fun Command(block: Command.() -> Unit): Command = (js("{}") as Command).apply(block)

public inline fun OnCommandListener(block: OnCommandListener.() -> Unit): OnCommandListener =
    (js("{}") as OnCommandListener).apply(block)
