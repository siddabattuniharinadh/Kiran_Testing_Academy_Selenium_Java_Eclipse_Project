# 3. WebElement Interface and Methods

## 1. Definition

`WebElement` represents an HTML element returned after a successful locator match. It supports actions and data retrieval.

## 2. Uses

Use `WebElement` to:

- Enter text or clear a field.
- Click buttons and links.
- Read text or attributes.
- Check whether an element is visible, enabled, or selected.
- Interact with forms and complex controls.

## 3. Syntax

```java
WebElement element = driver.findElement(By.id("username"));

element.sendKeys("admin");
element.clear();
element.click();

String text = element.getText();
String value = element.getAttribute("value");
boolean visible = element.isDisplayed();
boolean enabled = element.isEnabled();
boolean selected = element.isSelected();
```

## 4. Real-Time Example

```java
WebElement username = driver.findElement(By.id("username"));
username.clear();
username.sendKeys("kiran");

WebElement password = driver.findElement(By.id("password"));
password.clear();
password.sendKeys("secret");

WebElement loginButton = driver.findElement(By.id("login"));
loginButton.click();

WebElement welcome = driver.findElement(By.id("welcome"));
System.out.println(welcome.getText());
```

## 5. Commonly Used Methods

| Method | Purpose |
|---|---|
| `click()` | Activates the element |
| `sendKeys(CharSequence...)` | Types text or keys |
| `clear()` | Clears editable text |
| `getText()` | Returns rendered text |
| `getAttribute(name)` | Returns an attribute or DOM property |
| `getDomAttribute(name)` | Returns the HTML attribute |
| `getDomProperty(name)` | Returns the DOM property |
| `getTagName()` | Returns the HTML tag |
| `getCssValue(property)` | Returns computed CSS |
| `isDisplayed()` | Checks rendering and visibility |
| `isEnabled()` | Checks whether interaction is enabled |
| `isSelected()` | Checks checkbox/radio/option state |

## 6. Important Points

- Call `sendKeys(Keys.CONTROL + "a")` to select text, then clear or replace it.
- Use `getAttribute("value")` for input values when appropriate; `getDomProperty("value")` is more explicit for current DOM state.
- Use `submit()` only for elements inside a valid form and only when applicable.
- Selenium does not wait for every element state automatically.

## 7. Interview and Revision Notes

- `isDisplayed()` can be true only when Selenium considers the element visible.
- `isEnabled()` does not guarantee that the element is currently clickable.
- `getText()` may not include text from every visible control.
- The `WebElement` interface is not the HTML DOM; it represents a remote element reference.

## 8. Quick Recap

- `findElement()` locates and returns a `WebElement`.
- Actions: `click`, `sendKeys`, `clear`, `submit`.
- Read values: `getText`, `getAttribute`, `getDomProperty`.
- State checks: `isDisplayed`, `isEnabled`, `isSelected`.