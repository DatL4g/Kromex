@file:JsModule("webextension-polyfill")
@file:JsQualifier("activityLogPrivate")

package browser.activityLogPrivate

import browser.events.Event
import kotlin.js.Promise

/**
 * Retrieves activity from the ActivityLog that matches the specified filter.
 *
 * @param filter Fill out the fields that you want to search for in the database.
 */
public external fun getExtensionActivities(filter: Filter): Promise<ActivityResultSet>

/**
 * Deletes activities in the ActivityLog database specified in the array of activity IDs.
 *
 * @param activityIds Erases only the activities which IDs are listed in the array.
 */
public external fun deleteActivities(activityIds: Array<String>): Promise<Nothing>?

/**
 * Deletes activities in the ActivityLog database specified by the extension ID.
 *
 * @param extensionId The ID of the extension to delete activities for.
 */
public external fun deleteActivitiesByExtension(extensionId: String): Promise<Nothing>?

/**
 * Deletes the entire ActivityLog database.
 */
public external fun deleteDatabase(): Nothing

/**
 * Delete URLs in the ActivityLog database.
 *
 * @param urls Erases only the URLs listed; if empty, erases all URLs.
 */
public external fun deleteUrls(urls: Array<String>): Nothing

/**
 * Fired when a given extension performs another activity.
 */
public external val onExtensionActivity: Event<OnExtensionActivityListener, Unit> =
    definedExternally
