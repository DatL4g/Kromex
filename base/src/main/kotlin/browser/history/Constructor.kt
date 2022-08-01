@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.history

public inline fun HistoryItem(block: HistoryItem.() -> Unit): HistoryItem = (js("{}") as
    HistoryItem).apply(block)

public inline fun VisitItem(block: VisitItem.() -> Unit): VisitItem = (js("{}") as
    VisitItem).apply(block)

public inline fun UrlDetails(block: UrlDetails.() -> Unit): UrlDetails = (js("{}") as
    UrlDetails).apply(block)

public inline fun SearchQuery(block: SearchQuery.() -> Unit): SearchQuery = (js("{}") as
    SearchQuery).apply(block)

public inline fun DeleteRangeRange(block: DeleteRangeRange.() -> Unit): DeleteRangeRange = (js("{}")
    as DeleteRangeRange).apply(block)

public inline fun OnVisitedListener(block: OnVisitedListener.() -> Unit): OnVisitedListener =
    (js("{}") as OnVisitedListener).apply(block)

public inline fun OnVisitRemovedListener(block: OnVisitRemovedListener.() -> Unit):
    OnVisitRemovedListener = (js("{}") as OnVisitRemovedListener).apply(block)
