@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

public external interface SetDetails {
  /**
   * The pattern for the primary URL. For details on the format of a pattern, see <a
   * href='contentSettings#patterns'>Content Setting Patterns</a>.
   */
  public var primaryPattern: String

  /**
   * The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of
   * a pattern, see <a href='contentSettings#patterns'>Content Setting Patterns</a>.
   */
  public var secondaryPattern: String?

  /**
   * The resource identifier for the content type.
   */
  public var resourceIdentifier: ResourceIdentifier?

  /**
   * The setting applied by this rule. See the description of the individual ContentSetting objects
   * for the possible values.
   */
  public var setting: Any

  /**
   * Where to set the setting (default: regular).
   */
  public var scope: Scope?
}
