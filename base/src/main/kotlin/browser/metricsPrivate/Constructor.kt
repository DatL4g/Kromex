@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package browser.metricsPrivate

public inline fun MetricType(block: MetricType.() -> Unit): MetricType = (js("{}") as
    MetricType).apply(block)

public inline fun HistogramBucket(block: HistogramBucket.() -> Unit): HistogramBucket = (js("{}") as
    HistogramBucket).apply(block)

public inline fun Histogram(block: Histogram.() -> Unit): Histogram = (js("{}") as
    Histogram).apply(block)
