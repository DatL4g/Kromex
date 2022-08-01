@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.runtime

public inline fun OnDisconnectListener(block: OnDisconnectListener.() -> Unit): OnDisconnectListener
    = (js("{}") as OnDisconnectListener).apply(block)

public inline fun OnMessageListener(block: OnMessageListener.() -> Unit): OnMessageListener =
    (js("{}") as OnMessageListener).apply(block)

public inline fun Port(block: Port.() -> Unit): Port = (js("{}") as Port).apply(block)

public inline fun MessageSender(block: MessageSender.() -> Unit): MessageSender = (js("{}") as
    MessageSender).apply(block)

public inline fun PlatformInfo(block: PlatformInfo.() -> Unit): PlatformInfo = (js("{}") as
    PlatformInfo).apply(block)

public inline fun RequestUpdateCheckReturn(block: RequestUpdateCheckReturn.() -> Unit):
    RequestUpdateCheckReturn = (js("{}") as RequestUpdateCheckReturn).apply(block)

public inline fun ConnectConnectInfo(block: ConnectConnectInfo.() -> Unit): ConnectConnectInfo =
    (js("{}") as ConnectConnectInfo).apply(block)

public inline fun SendMessageOptions(block: SendMessageOptions.() -> Unit): SendMessageOptions =
    (js("{}") as SendMessageOptions).apply(block)

public inline fun OnInstalledListener(block: OnInstalledListener.() -> Unit): OnInstalledListener =
    (js("{}") as OnInstalledListener).apply(block)

public inline fun OnUpdateAvailableListener(block: OnUpdateAvailableListener.() -> Unit):
    OnUpdateAvailableListener = (js("{}") as OnUpdateAvailableListener).apply(block)

public inline fun OnConnectListener(block: OnConnectListener.() -> Unit): OnConnectListener =
    (js("{}") as OnConnectListener).apply(block)

public inline fun OnConnectExternalListener(block: OnConnectExternalListener.() -> Unit):
    OnConnectExternalListener = (js("{}") as OnConnectExternalListener).apply(block)

public inline fun OnConnectNativeListener(block: OnConnectNativeListener.() -> Unit):
    OnConnectNativeListener = (js("{}") as OnConnectNativeListener).apply(block)

public inline fun OnMessageExternalListener(block: OnMessageExternalListener.() -> Unit):
    OnMessageExternalListener = (js("{}") as OnMessageExternalListener).apply(block)

public inline fun OnRestartRequiredListener(block: OnRestartRequiredListener.() -> Unit):
    OnRestartRequiredListener = (js("{}") as OnRestartRequiredListener).apply(block)
