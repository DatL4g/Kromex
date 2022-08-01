@file:JsModule("webextension-polyfill")
@file:JsQualifier("fontSettings")

package browser.fontSettings

import browser.events.Event
import kotlin.js.Promise

/**
 * Clears the font set by this extension, if any.
 */
public external fun clearFont(details: ClearFontDetails): Promise<Nothing>?

/**
 * Gets the font for a given script and generic font family.
 */
public external fun getFont(details: GetFontDetails): Promise<GetFontReturn>?

/**
 * Sets the font for a given script and generic font family.
 */
public external fun setFont(details: SetFontDetails): Promise<Nothing>?

/**
 * Gets a list of fonts on the system.
 */
public external fun getFontList(): Promise<Array<FontName>>

/**
 * Clears the default font size set by this extension, if any.
 *
 * @param details This parameter is currently unused.
 */
public external fun clearDefaultFontSize(details: Any? = definedExternally): Promise<Nothing>?

/**
 * Gets the default font size.
 *
 * @param details This parameter is currently unused.
 */
public external fun getDefaultFontSize(details: Any? = definedExternally):
    Promise<GetDefaultFontSizeReturn>?

/**
 * Sets the default font size.
 */
public external fun setDefaultFontSize(details: SetDefaultFontSizeDetails): Promise<Nothing>?

/**
 * Clears the default fixed font size set by this extension, if any.
 *
 * @param details This parameter is currently unused.
 */
public external fun clearDefaultFixedFontSize(details: Any? = definedExternally): Promise<Nothing>?

/**
 * Gets the default size for fixed width fonts.
 *
 * @param details This parameter is currently unused.
 */
public external fun getDefaultFixedFontSize(details: Any? = definedExternally):
    Promise<GetDefaultFixedFontSizeReturn>?

/**
 * Sets the default size for fixed width fonts.
 */
public external fun setDefaultFixedFontSize(details: SetDefaultFixedFontSizeDetails):
    Promise<Nothing>?

/**
 * Clears the minimum font size set by this extension, if any.
 *
 * @param details This parameter is currently unused.
 */
public external fun clearMinimumFontSize(details: Any? = definedExternally): Promise<Nothing>?

/**
 * Gets the minimum font size.
 *
 * @param details This parameter is currently unused.
 */
public external fun getMinimumFontSize(details: Any? = definedExternally):
    Promise<GetMinimumFontSizeReturn>?

/**
 * Sets the minimum font size.
 */
public external fun setMinimumFontSize(details: SetMinimumFontSizeDetails): Promise<Nothing>?

/**
 * Fired when a font setting changes.
 */
public external val onFontChanged: Event<OnFontChangedListener, Unit> = definedExternally

/**
 * Fired when the default font size setting changes.
 */
public external val onDefaultFontSizeChanged: Event<OnDefaultFontSizeChangedListener, Unit> =
    definedExternally

/**
 * Fired when the default fixed font size setting changes.
 */
public external val onDefaultFixedFontSizeChanged:
    Event<OnDefaultFixedFontSizeChangedListener, Unit> = definedExternally

/**
 * Fired when the minimum font size setting changes.
 */
public external val onMinimumFontSizeChanged: Event<OnMinimumFontSizeChangedListener, Unit> =
    definedExternally
