@file:JsModule("webextension-polyfill")
@file:JsQualifier("idle")

package browser.idle

import browser.events.Event
import kotlin.js.Promise

/**
 * Returns "locked" if the system is locked, "idle" if the user has not generated any input for a
 * specified number of seconds, or "active" otherwise.
 *
 * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds
 * seconds have elapsed since the last user input detected.
 */
public external fun queryState(detectionIntervalInSeconds: Int): Promise<IdleState>

/**
 * Sets the interval, in seconds, used to determine when the system is in an idle state for
 * onStateChanged events. The default interval is 60 seconds.
 *
 * @param intervalInSeconds Threshold, in seconds, used to determine when the system is in an idle
 * state.
 */
public external fun setDetectionInterval(intervalInSeconds: Int): Nothing

/**
 * Gets the time, in seconds, it takes until the screen is locked automatically while idle. Returns
 * a zero duration if the screen is never locked automatically. Currently supported on Chrome OS only.
 */
public external fun getAutoLockDelay(): Promise<Int>

/**
 * Fired when the system changes to an active, idle or locked state. The event fires with "locked"
 * if the screen is locked or the screensaver activates, "idle" if the system is unlocked and the user
 * has not generated any input for a specified number of seconds, and "active" when the user generates
 * input on an idle system.
 */
public external val onStateChanged: Event<OnStateChangedListener, Unit> = definedExternally
