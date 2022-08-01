@file:JsModule("webextension-polyfill")
@file:JsQualifier("desktopCapture")

package browser.desktopCapture

/**
 * Mirrors members of <a
 * href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints">DisplayMediaStreamConstraints</a>
 * which need to be applied before the user makes their selection, and must therefore be provided to
 * chooseDesktopMedia() rather than be deferred to getUserMedia().
 */
public external interface ChooseDesktopMediaOptions {
  /**
   * Mirrors <a
   * href="https://w3c.github.io/mediacapture-screen-share/#dom-displaymediastreamconstraints-systemaudio">systemAudio</a>.
   */
  public var systemAudio: SystemAudioPreferenceEnum?
}
