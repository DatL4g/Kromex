@file:JsModule("webextension-polyfill")
@file:JsQualifier("dom")

package browser.dom

import org.w3c.dom.HTMLElement

/**
 * Gets the open shadow root or the closed shadow root hosted by the specified element. If the
 * element doesn't attach the shadow root, it will return null.
 *
 * @return See <a
 * href='https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot'>https://developer.mozilla.org/en-US/docs/Web/API/ShadowRoot</a>
 */
public external fun openOrClosedShadowRoot(element: HTMLElement): Any
