@file:JsModule("webextension-polyfill")
@file:JsQualifier("accessibilityFeatures")

package browser.accessibilityFeatures

import browser.types.ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Spoken feedback (text-to-speech). The value indicates
 * whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var spokenFeedback: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Enlarged cursor. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external var largeCursor: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Sticky modifier keys (like shift or alt). The value
 * indicates whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var stickyKeys: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>High contrast rendering mode. The value indicates
 * whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var highContrast: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Full screen magnification. The value indicates whether
 * the feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var screenMagnifier: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Auto mouse click after mouse stops moving. The value
 * indicates whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var autoclick: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Virtual on-screen keyboard. The value indicates whether
 * the feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var virtualKeyboard: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Caret highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var caretHighlight: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Cursor highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var cursorHighlight: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Cursor color. The value indicates whether the feature is
 * enabled or not, doesn't indicate the color of it. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var cursorColor: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Docked magnifier. The value indicates whether docked
 * magnifier feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var dockedMagnifier: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Focus highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external var focusHighlight: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Select-to-speak. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external var selectToSpeak: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Switch Access. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external var switchAccess: ChromeSetting

/**
 * <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.
 */
public external var animationPolicy: ChromeSetting

/**
 * <p><strong>ChromeOS only.</strong></p><p>Dictation. The value indicates whether the feature is
 * enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external var dictation: ChromeSetting
