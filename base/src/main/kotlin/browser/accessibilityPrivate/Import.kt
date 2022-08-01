@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityPrivate")

package browser.accessibilityPrivate

import browser.events.Event
import kotlin.js.Promise

/**
 * Property to indicate whether event source should default to touch.
 */
public external val IS_DEFAULT_EVENT_SOURCE_TOUCH: Int = definedExternally

/**
 * Called to translate localeCodeToTranslate into human-readable string in the locale specified by
 * displayLocaleCode
 *
 * @return The human-readable locale string in the provided locale.
 */
public external fun getDisplayNameForLocale(localeCodeToTranslate: String,
    displayLocaleCode: String): String

/**
 * Called to request battery status from Chrome OS system.
 *
 * @return Returns battery description as a string.
 */
public external fun getBatteryDescription(): Promise<String>

/**
 * Called to request an install of the Pumpkin semantic parser for Dictation.
 *
 * @return Runs when Pumpkin download finishes.
 */
public external fun installPumpkinForDictation(): Promise<Boolean>

/**
 * Enables or disables native accessibility support. Once disabled, it is up to the calling
 * extension to provide accessibility for web contents.
 *
 * @param enabled True if native accessibility support should be enabled.
 */
public external fun setNativeAccessibilityEnabled(enabled: Boolean): Nothing

/**
 * Sets the given accessibility focus rings for this extension.
 *
 * @param focusRings Array of focus rings to draw.
 */
public external fun setFocusRings(focusRings: Array<FocusRingInfo>): Nothing

/**
 * Sets the bounds of the accessibility highlight.
 *
 * @param rects Array of rectangles to draw the highlight around.
 * @param color CSS-style hex color string beginning with # like #FF9982 or #EEE.
 */
public external fun setHighlights(rects: Array<ScreenRect>, color: String): Nothing

/**
 * Sets the calling extension as a listener of all keyboard events optionally allowing the calling
 * extension to capture/swallow the key event via DOM apis. Returns false via callback when unable to
 * set the listener.
 *
 * @param enabled True if the caller wants to listen to key events; false to stop listening to
 * events. Note that there is only ever one extension listening to key events.
 * @param capture True if key events should be swallowed natively and not propagated if
 * preventDefault() gets called by the extension's background page.
 */
public external fun setKeyboardListener(enabled: Boolean, capture: Boolean): Nothing

/**
 * Darkens or undarkens the screen.
 *
 * @param enabled True to darken screen; false to undarken screen.
 */
public external fun darkenScreen(enabled: Boolean): Nothing

/**
 * When enabled, forwards key events to the Switch Access extension
 */
public external fun forwardKeyEventsToSwitchAccess(shouldForward: Boolean): Nothing

/**
 * Shows the Switch Access menu next to the specified rectangle and with the given actions
 *
 * @param bubble Which bubble to show/hide
 * @param show True if the bubble should be shown, false otherwise
 * @param anchor A rectangle indicating the bounds of the object the menu should be displayed next
 * to.
 * @param actions The actions to be shown in the menu.
 */
public external fun updateSwitchAccessBubble(
  bubble: SwitchAccessBubble,
  show: Boolean,
  anchor: ScreenRect? = definedExternally,
  actions: Array<SwitchAccessMenuAction> = definedExternally,
): Nothing

/**
 * Sets point scanning state Switch Access.
 *
 * @param state The point scanning state to set.
 */
public external fun setPointScanState(state: PointScanState): Nothing

/**
 * Sets current ARC app to use native ARC support.
 *
 * @param enabled True for ChromeVox (native), false for TalkBack.
 */
public external fun setNativeChromeVoxArcSupportForCurrentApp(enabled: Boolean):
    Promise<SetNativeChromeVoxResponse>

/**
 * Sends a fabricated key event.
 *
 * @param keyEvent The event to send.
 */
public external fun sendSyntheticKeyEvent(keyEvent: SyntheticKeyboardEvent): Nothing

/**
 * Enables or disables mouse events in accessibility extensions
 *
 * @param enabled True if accessibility component extensions should receive mouse events.
 */
public external fun enableMouseEvents(enabled: Boolean): Nothing

/**
 * Sends a fabricated mouse event.
 *
 * @param mouseEvent The event to send.
 */
public external fun sendSyntheticMouseEvent(mouseEvent: SyntheticMouseEvent): Nothing

/**
 * Called by the Select-to-Speak extension when Select-to-Speak has changed states, between
 * selecting with the mouse, speaking, and inactive.
 */
public external fun setSelectToSpeakState(state: SelectToSpeakState): Nothing

/**
 * Called by the Accessibility Common extension when onScrollableBoundsForPointRequested has found a
 * scrolling container. |rect| will be the bounds of the nearest scrollable ancestor of the node at the
 * point requested using onScrollableBoundsForPointRequested.
 */
public external fun handleScrollableBoundsForPointFound(rect: ScreenRect): Nothing

/**
 * Called by the Accessibility Common extension to move |rect| within the magnifier viewport (e.g.
 * when focus has changed). If |rect| is already completely within the viewport, magnifier doesn't
 * move. If any edge of |rect| is outside the viewport (e.g. if rect is larger than or extends
 * partially beyond the viewport), magnifier will center the overflowing dimensions of the viewport on
 * center of |rect| (e.g. center viewport vertically if |rect| extends beyond bottom of screen).
 *
 * @param rect Rect to ensure visible in the magnified viewport.
 */
public external fun moveMagnifierToRect(rect: ScreenRect): Nothing

/**
 * Called by the Accessibility Common extension to center magnifier at |point|.
 */
public external fun magnifierCenterOnPoint(point: ScreenPoint): Nothing

/**
 * Toggles dictation between active and inactive states.
 */
public external fun toggleDictation(): Nothing

/**
 * Shows or hides the virtual keyboard.
 */
public external fun setVirtualKeyboardVisible(isVisible: Boolean): Nothing

/**
 * Opens a specified settings subpage. To open a page with url
 * chrome://settings/manageAccessibility/tts, pass in the substring 'manageAccessibility/tts'.
 */
public external fun openSettingsSubpage(subpage: String): Nothing

/**
 * Performs an accelerator action.
 */
public external fun performAcceleratorAction(acceleratorAction: AcceleratorAction): Nothing

/**
 * Checks to see if an accessibility feature is enabled.
 *
 * @return Returns whether feature is enabled.
 */
public external fun isFeatureEnabled(feature: AccessibilityFeature): Promise<Boolean>

/**
 * Updates properties of the Select-to-speak panel.
 *
 * @param show True to show panel, false to hide it
 * @param anchor A rectangle indicating the bounds of the object the panel should be displayed next
 * to.
 * @param isPaused True if Select-to-speak playback is paused.
 * @param speed Current reading speed (TTS speech rate).
 */
public external fun updateSelectToSpeakPanel(
  show: Boolean,
  anchor: ScreenRect? = definedExternally,
  isPaused: Boolean? = definedExternally,
  speed: Number? = definedExternally,
): Nothing

/**
 * Shows a confirmation dialog.
 *
 * @param title The title of the confirmation dialog.
 * @param description The description to show within the confirmation dialog.
 * @return Called when the dialog is confirmed or cancelled.
 */
public external fun showConfirmationDialog(title: String, description: String): Promise<Boolean>

/**
 * Gets the DOM key string for the given key code, taking into account the current input method
 * locale, and assuming the key code is for U.S. input. For example, the key code for '/' would return
 * the string '!' if the current input method is French.
 *
 * @return Called with the resulting Dom key string.
 */
public external fun getLocalizedDomKeyStringForKeyCode(keyCode: Int): Promise<String>

/**
 * Updates Dictation's bubble UI.
 *
 * @param properties Properties for the updated Dictation bubble UI.
 */
public external fun updateDictationBubble(properties: DictationBubbleProperties): Nothing

/**
 * Fired whenever ChromeVox should output introduction.
 */
public external val onIntroduceChromeVox: Event<Nothing, Unit> = definedExternally

/**
 * Fired when an accessibility gesture is detected by the touch exploration controller.
 */
public external val onAccessibilityGesture: Event<OnAccessibilityGestureListener, Unit> =
    definedExternally

/**
 * Fired when we first detect two fingers are held down, which can be used to toggle spoken feedback
 * on some touch-only devices.
 */
public external val onTwoFingerTouchStart: Event<Nothing, Unit> = definedExternally

/**
 * Fired when the user is no longer holding down two fingers (including releasing one, holding down
 * three, or moving them).
 */
public external val onTwoFingerTouchStop: Event<Nothing, Unit> = definedExternally

/**
 * Fired when Chrome OS wants to change the Select-to-Speak state, between selecting with the mouse,
 * speaking, and inactive.
 */
public external val onSelectToSpeakStateChangeRequested: Event<Nothing, Unit> = definedExternally

/**
 * Fired when an action is performed in the Select-to-speak panel.
 */
public external val onSelectToSpeakPanelAction: Event<OnSelectToSpeakPanelActionListener, Unit> =
    definedExternally

/**
 * Fired when Chrome OS has received a key event corresponding to a Switch Access command.
 */
public external val onSwitchAccessCommand: Event<OnSwitchAccessCommandListener, Unit> =
    definedExternally

/**
 * Fired when Chrome OS has received the final point of point scanning.
 */
public external val onPointScanSet: Event<OnPointScanSetListener, Unit> = definedExternally

/**
 * Fired when Chrome OS has received a key event corresponding to a Magnifier command.
 */
public external val onMagnifierCommand: Event<OnMagnifierCommandListener, Unit> = definedExternally

/**
 * Fired when an internal component within accessibility wants to force speech output for an
 * accessibility extension. Do not use without approval from accessibility owners.
 */
public external val onAnnounceForAccessibility: Event<OnAnnounceForAccessibilityListener, Unit> =
    definedExternally

/**
 * Fired when an internal component within accessibility wants to find the nearest scrolling
 * container at a given screen coordinate. Used in Automatic Clicks.
 */
public external val onScrollableBoundsForPointRequested:
    Event<OnScrollableBoundsForPointRequestedListener, Unit> = definedExternally

/**
 * Fired when Chrome OS magnifier bounds are updated.
 */
public external val onMagnifierBoundsChanged: Event<OnMagnifierBoundsChangedListener, Unit> =
    definedExternally

/**
 * Fired when a custom spoken feedback on the active window gets enabled or disabled. Called from
 * ARC++ accessibility.
 */
public external val onCustomSpokenFeedbackToggled:
    Event<OnCustomSpokenFeedbackToggledListener, Unit> = definedExternally

/**
 * Fired when ChromeVox should show its tutorial.
 */
public external val onShowChromeVoxTutorial: Event<Nothing, Unit> = definedExternally

/**
 * Fired when Dictation is activated or deactivated using a keyboard shortcut, the button in the
 * tray, or after a call from accessibilityPrivate.toggleDictation
 */
public external val onToggleDictation: Event<OnToggleDictationListener, Unit> = definedExternally
