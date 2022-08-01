package browser.management

import kotlin.String

/**
 * How the extension was installed. One of<br><var>admin</var>: The extension was installed because
 * of an administrative policy,<br><var>development</var>: The extension was loaded unpacked in
 * developer mode,<br><var>normal</var>: The extension was installed normally via a .crx
 * file,<br><var>sideload</var>: The extension was installed by other software on the
 * machine,<br><var>other</var>: The extension was installed by other means.
 */
public enum class ExtensionInstallType(
  private val `value`: String,
) {
  admin("admin"),
  development("development"),
  normal("normal"),
  sideload("sideload"),
  other("other"),
  ;

  public override fun toString(): String = value
}
