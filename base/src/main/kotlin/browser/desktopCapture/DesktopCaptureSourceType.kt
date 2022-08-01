package browser.desktopCapture

import kotlin.String

/**
 * Enum used to define set of desktop media sources used in chooseDesktopMedia().
 */
public enum class DesktopCaptureSourceType(
  private val `value`: String,
) {
  screen("screen"),
  window("window"),
  tab("tab"),
  audio("audio"),
  ;

  public override fun toString(): String = value
}
