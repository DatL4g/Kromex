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
public external val spokenFeedback: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Enlarged cursor. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external val largeCursor: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Sticky modifier keys (like shift or alt). The value
 * indicates whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val stickyKeys: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>High contrast rendering mode. The value indicates
 * whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val highContrast: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Full screen magnification. The value indicates whether
 * the feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val screenMagnifier: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Auto mouse click after mouse stops moving. The value
 * indicates whether the feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val autoclick: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Virtual on-screen keyboard. The value indicates whether
 * the feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val virtualKeyboard: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Caret highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val caretHighlight: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Cursor highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val cursorHighlight: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Cursor color. The value indicates whether the feature is
 * enabled or not, doesn't indicate the color of it. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val cursorColor: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Docked magnifier. The value indicates whether docked
 * magnifier feature is enabled or not. <code>get()</code> requires
 * <code>accessibilityFeatures.read</code> permission. <code>set()</code> and <code>clear()</code>
 * require <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val dockedMagnifier: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Focus highlighting. The value indicates whether the
 * feature is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code>
 * permission. <code>set()</code> and <code>clear()</code> require
 * <code>accessibilityFeatures.modify</code> permission.</p>
 */
public external val focusHighlight: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Select-to-speak. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external val selectToSpeak: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Switch Access. The value indicates whether the feature
 * is enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external val switchAccess: ChromeSetting = definedExternally

/**
 * <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.
 */
public external val animationPolicy: ChromeSetting = definedExternally

/**
 * <p><strong>ChromeOS only.</strong></p><p>Dictation. The value indicates whether the feature is
 * enabled or not. <code>get()</code> requires <code>accessibilityFeatures.read</code> permission.
 * <code>set()</code> and <code>clear()</code> require <code>accessibilityFeatures.modify</code>
 * permission.</p>
 */
public external val dictation: ChromeSetting = definedExternally
