@file:JsModule("webextension-polyfill")
@file:JsQualifier("types")

package browser.types

import browser.events.Event
import kotlin.js.Promise

/**
 * An interface that allows access to a Chrome browser setting. See $(ref:accessibilityFeatures) for
 * an example.
 */
public external interface ChromeSetting {
  /**
   * Fired after the setting changes.
   */
  public val onChange: Event<OnChangeListener, Unit>

  /**
   * Gets the value of a setting.
   *
   * @param details Which setting to consider.
   */
  public fun `get`(details: GetDetails): Promise<GetReturn>

  /**
   * Sets the value of a setting.
   *
   * @param details Which setting to change.
   * @return Called at the completion of the set operation.
   */
  public fun `set`(details: SetDetails): Promise<Nothing>?

  /**
   * Clears the setting, restoring any default value.
   *
   * @param details Which setting to clear.
   * @return Called at the completion of the clear operation.
   */
  public fun clear(details: ClearDetails): Promise<Nothing>?
}
