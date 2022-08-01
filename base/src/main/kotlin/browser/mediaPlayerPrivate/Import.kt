@file:JsModule("webextension-polyfill")
@file:JsQualifier("mediaPlayerPrivate")

package browser.mediaPlayerPrivate

import browser.events.Event

/**
 * Notifies that the next track was requested.
 */
public external val onNextTrack: Event<Nothing, Unit> = definedExternally

/**
 * Notifies that the previous tack was requested.
 */
public external val onPrevTrack: Event<Nothing, Unit> = definedExternally

/**
 * Notifies that a play/pause toggle was requested.
 */
public external val onTogglePlayState: Event<Nothing, Unit> = definedExternally
