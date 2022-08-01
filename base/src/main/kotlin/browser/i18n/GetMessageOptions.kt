@file:JsModule("webextension-polyfill")
@file:JsQualifier("i18n")

package browser.i18n

public external interface GetMessageOptions {
  /**
   * Escape <code>&lt;</code> in translation to <code>&amp;lt;</code>. This applies only to the
   * message itself, not to the placeholders. Developers might want to use this if the translation is
   * used in an HTML context. Closure Templates used with Closure Compiler generate this automatically.
   */
  public var escapeLt: Boolean?
}
