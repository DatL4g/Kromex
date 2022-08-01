@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.webNavigation

public inline fun GetFrameReturn(block: GetFrameReturn.() -> Unit): GetFrameReturn = (js("{}") as
    GetFrameReturn).apply(block)

public inline fun GetFrameDetails(block: GetFrameDetails.() -> Unit): GetFrameDetails = (js("{}") as
    GetFrameDetails).apply(block)

public inline fun GetAllFramesDetails(block: GetAllFramesDetails.() -> Unit): GetAllFramesDetails =
    (js("{}") as GetAllFramesDetails).apply(block)

public inline fun OnBeforeNavigateListener(block: OnBeforeNavigateListener.() -> Unit):
    OnBeforeNavigateListener = (js("{}") as OnBeforeNavigateListener).apply(block)

public inline fun OnCommittedListener(block: OnCommittedListener.() -> Unit): OnCommittedListener =
    (js("{}") as OnCommittedListener).apply(block)

public inline fun OnDOMContentLoadedListener(block: OnDOMContentLoadedListener.() -> Unit):
    OnDOMContentLoadedListener = (js("{}") as OnDOMContentLoadedListener).apply(block)

public inline fun OnCompletedListener(block: OnCompletedListener.() -> Unit): OnCompletedListener =
    (js("{}") as OnCompletedListener).apply(block)

public inline fun OnErrorOccurredListener(block: OnErrorOccurredListener.() -> Unit):
    OnErrorOccurredListener = (js("{}") as OnErrorOccurredListener).apply(block)

public inline
    fun OnCreatedNavigationTargetListener(block: OnCreatedNavigationTargetListener.() -> Unit):
    OnCreatedNavigationTargetListener = (js("{}") as OnCreatedNavigationTargetListener).apply(block)

public inline
    fun OnReferenceFragmentUpdatedListener(block: OnReferenceFragmentUpdatedListener.() -> Unit):
    OnReferenceFragmentUpdatedListener = (js("{}") as
    OnReferenceFragmentUpdatedListener).apply(block)

public inline fun OnTabReplacedListener(block: OnTabReplacedListener.() -> Unit):
    OnTabReplacedListener = (js("{}") as OnTabReplacedListener).apply(block)

public inline fun OnHistoryStateUpdatedListener(block: OnHistoryStateUpdatedListener.() -> Unit):
    OnHistoryStateUpdatedListener = (js("{}") as OnHistoryStateUpdatedListener).apply(block)
