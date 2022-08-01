@file:JsModule("webextension-polyfill")
@file:JsQualifier("browsingData")

package browser.browsingData

import kotlin.js.Promise

/**
 * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. 
 * Note: some of the data types included in this API are not available in the settings UI, and some UI
 * settings control more than one data type listed here.
 */
public external fun settings(): Promise<SettingsReturn>

/**
 * Clears various types of browsing data stored in a user's profile.
 * @param dataToRemove The set of data types to remove.
 *
 * @return Called when deletion has completed.
 */
public external fun remove(options: RemovalOptions, dataToRemove: DataTypeSet): Promise<Nothing>?

/**
 * Clears websites' appcache data.
 *
 * @return Called when websites' appcache data has been cleared.
 */
public external fun removeAppcache(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's cache.
 *
 * @return Called when the browser's cache has been cleared.
 */
public external fun removeCache(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' cache storage data.
 *
 * @return Called when websites' cache storage has been cleared.
 */
public external fun removeCacheStorage(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's cookies and server-bound certificates modified within a particular
 * timeframe.
 *
 * @return Called when the browser's cookies and server-bound certificates have been cleared.
 */
public external fun removeCookies(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's list of downloaded files (<em>not</em> the downloaded files themselves).
 *
 * @return Called when the browser's list of downloaded files has been cleared.
 */
public external fun removeDownloads(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' file system data.
 *
 * @return Called when websites' file systems have been cleared.
 */
public external fun removeFileSystems(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's stored form data (autofill).
 *
 * @return Called when the browser's form data has been cleared.
 */
public external fun removeFormData(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's history.
 *
 * @return Called when the browser's history has cleared.
 */
public external fun removeHistory(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' IndexedDB data.
 *
 * @return Called when websites' IndexedDB data has been cleared.
 */
public external fun removeIndexedDB(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' local storage data.
 *
 * @return Called when websites' local storage has been cleared.
 */
public external fun removeLocalStorage(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears plugins' data.
 *
 * @return Called when plugins' data has been cleared.
 */
public external fun removePluginData(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears the browser's stored passwords.
 *
 * @return Called when the browser's passwords have been cleared.
 */
public external fun removePasswords(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' service workers.
 *
 * @return Called when websites' service workers have been cleared.
 */
public external fun removeServiceWorkers(options: RemovalOptions): Promise<Nothing>?

/**
 * Clears websites' WebSQL data.
 *
 * @return Called when websites' WebSQL databases have been cleared.
 */
public external fun removeWebSQL(options: RemovalOptions): Promise<Nothing>?
