@file:JsModule("webextension-polyfill")
@file:JsQualifier("metricsPrivate")

package browser.metricsPrivate

/**
 * Describes the type of metric that is to be collected.
 */
public external interface MetricType {
  /**
   * A unique name within the extension for the metric.
   */
  public var metricName: String

  public var type: MetricTypeType

  /**
   * The minimum sample value to be recoded.  Must be greater than zero.
   */
  public var min: Int

  /**
   * The maximum sample value to be recoded.
   */
  public var max: Int

  /**
   * The number of buckets to use when separating the recorded values.
   */
  public var buckets: Int
}
