@file:JsModule("webextension-polyfill")
@file:JsQualifier("contentSettings")

package browser.contentSettings

/**
 * Whether to allow cookies and other local data to be set by websites. One of<br><var>allow</var>:
 * Accept cookies,<br><var>block</var>: Block cookies,<br><var>session_only</var>: Accept cookies only
 * for the current session. <br>Default is <var>allow</var>.<br>The primary URL is the URL representing
 * the cookie origin. The secondary URL is the URL of the top-level frame.
 */
public external var cookies: ContentSetting

/**
 * Whether to show images. One of<br><var>allow</var>: Show images,<br><var>block</var>: Don't show
 * images. <br>Default is <var>allow</var>.<br>The primary URL is the URL of the top-level frame. The
 * secondary URL is the URL of the image.
 */
public external var images: ContentSetting

/**
 * Whether to run JavaScript. One of<br><var>allow</var>: Run JavaScript,<br><var>block</var>: Don't
 * run JavaScript. <br>Default is <var>allow</var>.<br>The primary URL is the URL of the top-level
 * frame. The secondary URL is not used.
 */
public external var javascript: ContentSetting

/**
 * Whether to allow Geolocation. One of <br><var>allow</var>: Allow sites to track your physical
 * location,<br><var>block</var>: Don't allow sites to track your physical location,<br><var>ask</var>:
 * Ask before allowing sites to track your physical location. <br>Default is <var>ask</var>.<br>The
 * primary URL is the URL of the document which requested location data. The secondary URL is the URL
 * of the top-level frame (which may or may not differ from the requesting URL).
 */
public external var location: ContentSetting

/**
 * <i>Deprecated.</i> With Flash support removed in Chrome 88, this permission no longer has any
 * effect. Value is always <var>block</var>. Calls to <code>set()</code> and <code>clear()</code> will
 * be ignored.
 */
public external var plugins: ContentSetting

/**
 * Whether to allow sites to show pop-ups. One of<br><var>allow</var>: Allow sites to show
 * pop-ups,<br><var>block</var>: Don't allow sites to show pop-ups. <br>Default is
 * <var>block</var>.<br>The primary URL is the URL of the top-level frame. The secondary URL is not
 * used.
 */
public external var popups: ContentSetting

/**
 * Whether to allow sites to show desktop notifications. One of<br><var>allow</var>: Allow sites to
 * show desktop notifications,<br><var>block</var>: Don't allow sites to show desktop
 * notifications,<br><var>ask</var>: Ask when a site wants to show desktop notifications. <br>Default
 * is <var>ask</var>.<br>The primary URL is the URL of the document which wants to show the
 * notification. The secondary URL is not used.
 */
public external var notifications: ContentSetting

/**
 * <i>Deprecated.</i> No longer has any effect. Fullscreen permission is now automatically granted
 * for all sites. Value is always <var>allow</var>.
 */
public external var fullscreen: ContentSetting

/**
 * <i>Deprecated.</i> No longer has any effect. Mouse lock permission is now automatically granted
 * for all sites. Value is always <var>allow</var>.
 */
public external var mouselock: ContentSetting

/**
 * Whether to allow sites to access the microphone. One of <br><var>allow</var>: Allow sites to
 * access the microphone,<br><var>block</var>: Don't allow sites to access the
 * microphone,<br><var>ask</var>: Ask when a site wants to access the microphone. <br>Default is
 * <var>ask</var>.<br>The primary URL is the URL of the document which requested microphone access. The
 * secondary URL is not used.<br>NOTE: The 'allow' setting is not valid if both patterns are
 * '<all_urls>'.
 */
public external var microphone: ContentSetting

/**
 * Whether to allow sites to access the camera. One of <br><var>allow</var>: Allow sites to access
 * the camera,<br><var>block</var>: Don't allow sites to access the camera,<br><var>ask</var>: Ask when
 * a site wants to access the camera. <br>Default is <var>ask</var>.<br>The primary URL is the URL of
 * the document which requested camera access. The secondary URL is not used.<br>NOTE: The 'allow'
 * setting is not valid if both patterns are '<all_urls>'.
 */
public external var camera: ContentSetting

/**
 * Whether to allow sites to run plugins unsandboxed. One of <br><var>allow</var>: Allow sites to
 * run plugins unsandboxed,<br><var>block</var>: Don't allow sites to run plugins
 * unsandboxed,<br><var>ask</var>: Ask when a site wants to run a plugin unsandboxed. <br>Default is
 * <var>ask</var>.<br>The primary URL is the URL of the top-level frame. The secondary URL is not used.
 */
public external var unsandboxedPlugins: ContentSetting

/**
 * Whether to allow sites to download multiple files automatically. One of <br><var>allow</var>:
 * Allow sites to download multiple files automatically,<br><var>block</var>: Don't allow sites to
 * download multiple files automatically,<br><var>ask</var>: Ask when a site wants to download files
 * automatically after the first file. <br>Default is <var>ask</var>.<br>The primary URL is the URL of
 * the top-level frame. The secondary URL is not used.
 */
public external var automaticDownloads: ContentSetting
