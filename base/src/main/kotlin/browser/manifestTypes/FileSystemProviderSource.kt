package browser.manifestTypes

import kotlin.String

/**
 * For <code>"file"</code> the source is a file passed via <code>onLaunched</code> event. For
 * <code>"device"</code> contents are fetched from an external device (eg. plugged via USB), without
 * using <code>file_handlers</code>. Finally, for <code>"network"</code> source, contents should be
 * fetched via network.
 */
public enum class FileSystemProviderSource(
  private val `value`: String,
) {
  `file`("file"),
  device("device"),
  network("network"),
  ;

  public override fun toString(): String = value
}
