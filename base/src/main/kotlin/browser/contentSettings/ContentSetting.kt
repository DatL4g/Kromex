@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

import kotlin.js.Promise

public external interface ContentSetting {
  /**
   * Clear all content setting rules set by this extension.
   */
  public fun clear(details: ClearDetails): Promise<Nothing>?

  /**
   * Gets the current content setting for a given pair of URLs.
   */
  public fun `get`(details: GetDetails): Promise<GetReturn>

  /**
   * Applies a new content setting rule.
   */
  public fun `set`(details: SetDetails): Promise<Nothing>?

  public fun getResourceIdentifiers(): Promise<Array<ResourceIdentifier>>
}
