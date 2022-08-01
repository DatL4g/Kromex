@file:JsModule("webextension-polyfill")
@file:JsQualifier("metricsPrivate")

package browser.metricsPrivate

import kotlin.js.Promise

/**
 * Get details about a histogram displayed at chrome://histogram.
 *
 * @param name Histogram name, e.g. 'Accessibility.CrosAutoclick'.
 * @return Invoked with details.
 */
public external fun getHistogram(name: String): Promise<Histogram>

/**
 * Returns true if the user opted in to sending crash reports.
 */
public external fun getIsCrashReportingEnabled(): Promise<Boolean>

/**
 * Returns the group name chosen for the named trial, or the empty string if the trial does not
 * exist or is not enabled.
 */
public external fun getFieldTrial(name: String): Promise<String>

/**
 * Returns variation parameters for the named trial if available, or undefined otherwise.
 */
public external fun getVariationParams(name: String): Promise<String?>

/**
 * Records an action performed by the user.
 */
public external fun recordUserAction(name: String): Nothing

/**
 * Records a percentage value from 1 to 100.
 */
public external fun recordPercentage(metricName: String, `value`: Int): Nothing

/**
 * Records a value than can range from 1 to 1,000,000.
 */
public external fun recordCount(metricName: String, `value`: Int): Nothing

/**
 * Records a value than can range from 1 to 100.
 */
public external fun recordSmallCount(metricName: String, `value`: Int): Nothing

/**
 * Records a value than can range from 1 to 10,000.
 */
public external fun recordMediumCount(metricName: String, `value`: Int): Nothing

/**
 * Records an elapsed time of no more than 10 seconds.  The sample value is specified in
 * milliseconds.
 */
public external fun recordTime(metricName: String, `value`: Int): Nothing

/**
 * Records an elapsed time of no more than 3 minutes.  The sample value is specified in
 * milliseconds.
 */
public external fun recordMediumTime(metricName: String, `value`: Int): Nothing

/**
 * Records an elapsed time of no more than 1 hour.  The sample value is specified in milliseconds.
 */
public external fun recordLongTime(metricName: String, `value`: Int): Nothing

/**
 * Increments the count associated with the hash of |value| in the sparse histogram defined by the
 * |metricName| using base::PersistentHash(value). Prefer recordSparseValueWithPersistentHash.
 */
public external fun recordSparseHashable(metricName: String, `value`: String): Nothing

/**
 * Increments the count associated with the hash of |value| in the sparse histogram defined by the
 * |metricName| using base::HashMetricName(value).
 */
public external fun recordSparseValueWithHashMetricName(metricName: String, `value`: String):
    Nothing

/**
 * Increments the count associated with the hash of |value| in the sparse histogram defined by the
 * |metricName| using base::PersistentHash(value).
 */
public external fun recordSparseValueWithPersistentHash(metricName: String, `value`: String):
    Nothing

/**
 * Increments the count associated with |value| in the sparse histogram defined by the |metricName|.
 */
public external fun recordSparseValue(metricName: String, `value`: Int): Nothing

/**
 * Adds a value to the given metric.
 */
public external fun recordValue(metric: MetricType, `value`: Int): Nothing

/**
 * Records a boolean value to the given metric. Analogous to base::UmaHistogramBoolean().
 */
public external fun recordBoolean(metricName: String, `value`: Boolean): Nothing

/**
 * Records an enumeration value to the given metric. Analogous to base::UmaHistogramEnumeration().
 * Use recordSparseValue for sparse enums or enums not starting at 0.
 */
public external fun recordEnumerationValue(
  metricName: String,
  `value`: Int,
  enumSize: Int,
): Nothing
