@file:JsModule("webextension-polyfill")
@file:JsQualifier("metricsPrivate")

package browser.metricsPrivate

public external interface Histogram {
  /**
   * Sum of the all entries.
   */
  public var sum: Number

  /**
   * Buckets containing samples.
   */
  public var buckets: Array<HistogramBucket>
}
