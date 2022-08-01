@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * Describes an input Context
 */
public external interface InputContext {
  /**
   * This is used to specify targets of text field operations.  This ID becomes invalid as soon as
   * onBlur is called.
   */
  public var contextID: Int

  /**
   * Type of value this text field edits, (Text, Number, URL, etc)
   */
  public var type: InputContextType

  /**
   * Type of keyboard to show for this field (Text, Number, URL, etc)
   */
  public var mode: InputModeType

  /**
   * Whether the text field wants auto-correct.
   */
  public var autoCorrect: Boolean

  /**
   * Whether the text field wants auto-complete.
   */
  public var autoComplete: Boolean

  /**
   * The auto-capitalize type of the text field.
   */
  public var autoCapitalize: AutoCapitalizeType

  /**
   * Whether the text field wants spell-check.
   */
  public var spellCheck: Boolean

  /**
   * Whether text entered into the text field should be used to improve typing suggestions for the
   * user.
   */
  public var shouldDoLearning: Boolean

  /**
   * How the text field was focused
   */
  public var focusReason: FocusReason

  /**
   * Whether the text field has ever been a password field.
   */
  public var hasBeenPassword: Boolean

  /**
   * Key of the app associated with this text field if any.
   */
  public var appKey: String?
}
