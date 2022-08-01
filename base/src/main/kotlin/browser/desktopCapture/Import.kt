@file:JsModule("webextension-polyfill")
@file:JsQualifier("desktopCapture")

package browser.desktopCapture

import browser.tabs.Tab
import kotlin.js.Promise

/**
 * Shows desktop media picker UI with the specified set of sources.
 *
 * @param sources Set of sources that should be shown to the user. The sources order in the set
 * decides the tab order in the picker.
 * @param targetTab Optional tab for which the stream is created. If not specified then the
 * resulting stream can be used only by the calling extension. The stream can only be used by frames in
 * the given tab whose security origin matches <code>tab.url</code>. The tab's origin must be a secure
 * origin, e.g. HTTPS.
 * @param options Mirrors members of <a
 * href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints">DisplayMediaStreamConstraints</a>
 * which need to be applied before the user makes their selection, and must therefore be provided to
 * chooseDesktopMedia() rather than be deferred to getUserMedia().
 * @return An id that can be passed to cancelChooseDesktopMedia() in case the prompt need to be
 * canceled.
 */
public external fun chooseDesktopMedia(
  sources: Array<DesktopCaptureSourceType>,
  targetTab: Tab? = definedExternally,
  options: ChooseDesktopMediaOptions? = definedExternally,
): Promise<Int>

/**
 * Hides desktop media picker dialog shown by chooseDesktopMedia().
 *
 * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
 */
public external fun cancelChooseDesktopMedia(desktopMediaRequestId: Int): Nothing
