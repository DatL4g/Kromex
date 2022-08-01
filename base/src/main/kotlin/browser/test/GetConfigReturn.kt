@file:JsModule("webextension-polyfill")
@file:JsQualifier("test")

package browser.test

public external interface GetConfigReturn {
  /**
   * Additional string argument to pass to test.
   */
  public var customArg: String?

  /**
   * Details on the FTP server used to mock network responses.  Will be set only if test calls
   * ExtensionApiTest::StartFTPServer().
   */
  public var ftpServer: FtpServerProperty?

  /**
   * Details on the test server used to mock network responses.  Will be set only if test calls
   * ExtensionApiTest::StartEmbeddedTestServer().
   */
  public var testServer: TestServerProperty?

  /**
   * file:/// URL for the API test data directory.
   */
  public var testDataDirectory: String?

  /**
   * The port on which the test WebSocket server is listening.
   */
  public var testWebSocketPort: Int?

  /**
   * The port on which the test WebTransport server is listening.
   */
  public var testWebTransportPort: Int?

  /**
   * Login status.
   */
  public var loginStatus: LoginStatusProperty?
}
