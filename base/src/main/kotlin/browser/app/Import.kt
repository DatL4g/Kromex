@file:JsModule("webextension-polyfill")
@file:JsQualifier("app")

package browser.app

import kotlin.js.Promise

/**
 * TODO
 *
 * @return TODO
 */
public external fun getIsInstalled(): Boolean

/**
 * TODO
 */
public external fun installState(): Promise<InstallState>

/**
 * TODO
 */
public external fun runningState(): RunningState

/**
 * TODO
 *
 * @return TODO
 */
public external fun getDetails(): Details?
