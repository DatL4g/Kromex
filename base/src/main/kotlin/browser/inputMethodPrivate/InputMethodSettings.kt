@file:JsModule("webextension-polyfill")
@file:JsQualifier("inputMethodPrivate")

package browser.inputMethodPrivate

/**
 * User preference settings for a specific input method. Japanese input methods are not included
 * because they are managed separately by Mozc module.
 */
public external interface InputMethodSettings {
  /**
   * Whether to enable auto completion.
   */
  public var enableCompletion: Boolean?

  /**
   * Whether to auto transform double spaces to type period.
   */
  public var enableDoubleSpacePeriod: Boolean?

  /**
   * Whether to enable gesture typing.
   */
  public var enableGestureTyping: Boolean?

  /**
   * Whether to enable word prediction.
   */
  public var enablePrediction: Boolean?

  /**
   * Whether to enable sound on keypress.
   */
  public var enableSoundOnKeypress: Boolean?

  /**
   * The level of auto correction for physical keyboard (0: Off, 1: Modest, 2: Aggressive).
   */
  public var physicalKeyboardAutoCorrectionLevel: Int?

  /**
   * Whether to enable auto capitalization for physical keyboard.
   */
  public var physicalKeyboardEnableCapitalization: Boolean?

  /**
   * The level of auto correction for virtual keyboard (0: Off, 1: Modest, 2: Aggressive).
   */
  public var virtualKeyboardAutoCorrectionLevel: Int?

  /**
   * Whether enable auto capitalization for virtual keyboard.
   */
  public var virtualKeyboardEnableCapitalization: Boolean?

  /**
   * The xkb keyboard (system provided keyboard) layout.
   */
  public var xkbLayout: String?

  /**
   * Whether input one syllable at a time in korean input method.
   */
  public var koreanEnableSyllableInput: Boolean?

  /**
   * The layout of korean keyboard.
   */
  public var koreanKeyboardLayout: String?

  /**
   * Whether to show hangul candidates in korean input method.
   */
  public var koreanShowHangulCandidate: Boolean?

  /**
   * Whether to use Chinese punctuations in pinyin.
   */
  public var pinyinChinesePunctuation: Boolean?

  /**
   * User can use shortcuts to switch between Chinese and English quickly when using pinyin, this
   * flag indicates whether the default language is Chinese.
   */
  public var pinyinDefaultChinese: Boolean?

  /**
   * Whether to enable fuzzy pinyin.
   */
  public var pinyinEnableFuzzy: Boolean?

  /**
   * Whether to enable using ','/'.' to page up/down the candidates in pinyin.
   */
  public var pinyinEnableLowerPaging: Boolean?

  /**
   * Whether to enable using '-'/'=' to page up/down the candidates in pinyin.
   */
  public var pinyinEnableUpperPaging: Boolean?

  /**
   * Whether to output full width letters and digits in pinyin.
   */
  public var pinyinFullWidthCharacter: Boolean?

  /**
   * The configuration of which fuzzy pairs are enable.
   */
  public var pinyinFuzzyConfig: PinyinFuzzyConfigProperty?

  /**
   * The layout of zhuyin keyboard.
   */
  public var zhuyinKeyboardLayout: String?

  /**
   * The page size of zhuyin candidate page.
   */
  public var zhuyinPageSize: Int?

  /**
   * The keys used to select candidates in zhuyin.
   */
  public var zhuyinSelectKeys: String?
}
