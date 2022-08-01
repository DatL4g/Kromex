package browser.metricsPrivate

import kotlin.String

/**
 * The type of metric, such as 'histogram-log' or 'histogram-linear'.
 */
public enum class MetricTypeType(
  private val `value`: String,
) {
  histogram_log("histogram-log"),
  histogram_linear("histogram-linear"),
  ;

  public override fun toString(): String = value
}
