@file:JsModule("webextension-polyfill")
@file:JsQualifier("metricsPrivate")

package browser.metricsPrivate

public external interface HistogramBucket {
  /**
   * Minimum sample value that can be stored in this bucket (i.e. inclusive).
   */
  public var min: Int

  /**
   * Exclusive maximum value for samples stored this bucket.
   */
  public var max: Int

  /**
   * Number of samples stored in this bucket.
   */
  public var count: Int
}
