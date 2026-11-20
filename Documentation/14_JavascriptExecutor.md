# 14. JavaScriptExecutor

## 1. Definition

`JavascriptExecutor` executes JavaScript in the browser context through Selenium.

## 2. Uses

Use it for scrolling, reading DOM values, dispatching events, or working around a UI limitation. Normal WebDriver interactions should remain the default.

## 3. Syntax

```java
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, 500);");

Object title = js.executeScript("return document.title;");
```

## 4. Examples

```java
JavascriptExecutor js = (JavascriptExecutor) driver;

WebElement footer =
    driver.findElement(By.id("footer"));
js.executeScript("arguments[0].scrollIntoView({block: 'center'});", footer);

js.executeScript("arguments[0].click();", footer);

String inputValue = (String) js.executeScript(
    "return arguments[0].value;", 
    driver.findElement(By.id("username"))
);
```

## 5. Important Points

- JavaScript clicks bypass normal WebDriver clickability checks.
- Browser JavaScript should not be used to hide synchronization problems.
- `executeAsyncScript` is available for asynchronous JavaScript.
- Test application behavior through the UI as often as practical.
- Returning `WebElement` and collection types can vary between JavaScript and Java.

## 6. Interview and Revision Notes

- Selenium interfaces include `JavascriptExecutor`.
- `executeScript` accepts arguments, including `WebElement`.
- `arguments[0]` represents the first JavaScript argument.
- Prefer this interface for scrolling or DOM-specific diagnostics.

## 7. Quick Recap

- Cast the WebDriver to `JavascriptExecutor`.
- Use scripts for exceptional browser operations.
- Prefer WebDriver APIs for normal actions.
