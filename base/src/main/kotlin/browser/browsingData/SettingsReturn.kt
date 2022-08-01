@file:JsModule("webextension-polyfill")
@file:JsQualifier("browsingData")

package browser.browsingData

public external interface SettingsReturn {
  public var options: RemovalOptions

  /**
   * All of the types will be present in the result, with values of <code>true</code> if they are
   * both selected to be removed and permitted to be removed, otherwise <code>false</code>.
   */
  public var dataToRemove: DataTypeSet

  /**
   * All of the types will be present in the result, with values of <code>true</code> if they are
   * permitted to be removed (e.g., by enterprise policy) and <code>false</code> if not.
   */
  public var dataRemovalPermitted: DataTypeSet
}
