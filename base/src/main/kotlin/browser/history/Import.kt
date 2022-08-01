@file:JsModule("webextension-polyfill")
@file:JsQualifier("history")

package browser.history

import browser.events.Event
import kotlin.js.Promise

/**
 * Searches the history for the last visit time of each page matching the query.
 */
public external fun search(query: SearchQuery): Promise<Array<HistoryItem>>

/**
 * Retrieves information about visits to a URL.
 */
public external fun getVisits(details: UrlDetails): Promise<Array<VisitItem>>

/**
 * Adds a URL to the history at the current time with a <a href='#transition_types'>transition
 * type</a> of "link".
 */
public external fun addUrl(details: UrlDetails): Promise<Nothing>?

/**
 * Removes all occurrences of the given URL from the history.
 */
public external fun deleteUrl(details: UrlDetails): Promise<Nothing>?

/**
 * Removes all items within the specified date range from the history.  Pages will not be removed
 * from the history unless all visits fall within the range.
 */
public external fun deleteRange(range: DeleteRangeRange): Promise<Nothing>

/**
 * Deletes all items from the history.
 */
public external fun deleteAll(): Promise<Nothing>

/**
 * Fired when a URL is visited, providing the HistoryItem data for that URL.  This event fires
 * before the page has loaded.
 */
public external val onVisited: Event<OnVisitedListener, Unit> = definedExternally

/**
 * Fired when one or more URLs are removed from the history service.  When all visits have been
 * removed the URL is purged from history.
 */
public external val onVisitRemoved: Event<OnVisitRemovedListener, Unit> = definedExternally
