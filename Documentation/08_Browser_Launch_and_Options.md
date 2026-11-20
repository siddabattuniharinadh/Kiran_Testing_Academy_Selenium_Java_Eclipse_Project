# 8. Browser Launch and Configuration

## 1. Definition

Browser configuration creates a browser session with specific options, profiles, preferences, window size, or browser arguments.

## 2. Uses

Configure Chrome, Edge, or Firefox for CI runs, headless execution, downloads, certificates, proxy settings, or device behavior.

## 3. Syntax

```java
ChromeOptions options = new ChromeOptions();
options.addArguments("--start-maximized");

WebDriver driver = new ChromeDriver(options);
```

## 4. Examples

```java
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless=new");
chromeOptions.addArguments("--window-size=1920,1080");
chromeOptions.setAcceptInsecureCerts(true);

WebDriver chrome = new ChromeDriver(chromeOptions);
chrome.get("https://example.com");
chrome.quit();
```

```java
FirefoxOptions firefoxOptions = new FirefoxOptions();
firefoxOptions.addArguments("-private");

EdgeOptions edgeOptions = new EdgeOptions();
edgeOptions.setAcceptInsecureCerts(true);
```

## 5. Important Points

- Selenium Manager can resolve browser drivers, but pinned drivers can improve reproducible CI environments.
- Headless mode should be visually tested as a separate browser mode.
- `acceptInsecureCerts(true)` is useful for controlled test environments, not production risk acceptance.
- Close sessions with `quit()`.

## 6. Interview and Revision Notes

- `close()` closes one window; `quit()` ends the session.
- `ChromeOptions` is preferred over deprecated driver configuration approaches.
- Browser options belong on the constructor or `ChromeDriver(options)`.

## 7. Quick Recap

- Create an options object.
- Add arguments or preferences.
- Pass options to the driver constructor.
- Quit after the test.
