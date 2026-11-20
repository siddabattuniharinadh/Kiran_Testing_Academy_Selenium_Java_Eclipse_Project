# 12. Windows and Tabs

## 1. Definition

Selenium uses browser window handles to track tabs or windows and switches context through `switchTo().window(handle)`.

## 2. Uses

Used for links that open in a new tab, pop-up windows, OAuth redirects, invoice downloads, and payment providers.

## 3. Syntax

```java
String originalWindow = driver.getWindowHandle();

Set<String> handles = driver.getWindowHandles();

for (String handle : handles) {
    if (!handle.equals(originalWindow)) {
        driver.switchTo().window(handle);
        break;
    }
}

driver.close();
driver.switchTo().window(originalWindow);
```

## 4. Example

```java
String originalWindow = driver.getWindowHandle();
driver.findElement(By.linkText("Terms")).click();

WebDriverWait wait =
    new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(d -> d.getWindowHandles().size() > 1);

for (String handle : driver.getWindowHandles()) {
    if (!handle.equals(originalWindow)) {
        driver.switchTo().window(handle);
        break;
    }
}

System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(originalWindow);
```

## 5. Important Points

- A handle is not a browser tab title or URL.
- Capture the original handle before opening a new window.
- Wait for the new handle before switching.
- `close()` closes only the active window.
- `quit()` ends the session and closes all windows.

## 6. Interview and Revision Notes

- `getWindowHandle()` returns the active window handle.
- `getWindowHandles()` returns all handles in the session.
- Use unique URL or title checks for more complex handle selection.
- `NoSuchWindowException` occurs after switching to an invalid or closed handle.

## 7. Quick Recap

- Store original handle.
- Wait for new handles.
- Switch to the target.
- Close the target and return to the original.
