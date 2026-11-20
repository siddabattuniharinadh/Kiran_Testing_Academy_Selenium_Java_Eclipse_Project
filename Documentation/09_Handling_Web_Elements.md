# 9. Handling Web Elements

## 1. Definition

Handling web elements includes waiting, finding, acting on, validating, and safely processing elements in dynamic pages.

## 2. Uses

It is used for login, form input, menus, checkboxes, radio buttons, disabled controls, lists, and repeated elements.

## 3. Syntax

```java
WebElement element = driver.findElement(By.id("field"));
element.clear();
element.sendKeys("value");
element.click();
```

## 4. Examples

```java
WebElement rememberMe = driver.findElement(By.id("remember"));
if (!rememberMe.isSelected()) {
    rememberMe.click();
}

List<WebElement> products =
    driver.findElements(By.cssSelector(".product-card"));

for (WebElement product : products) {
    String name = product.findElement(By.cssSelector(".product-name"))
        .getText();
    System.out.println(name);
}
```

## 5. Important Points

- Use a new locator lookup after navigation or DOM replacement.
- A stale element should trigger re-location, not blind repeated calls.
- Check visibility and enabled state through the actual UI condition.
- JavaScript execution is not a substitute for normal WebDriver clicks.

## 6. Common Mistakes

- Reusing a stale `WebElement`.
- Calling `click()` when the element is off-screen or covered.
- Using an index instead of element text or role.
- Searching the whole page for a child element when a scoped search is available.

## 7. Interview and Revision Notes

- `findElement()` throws `NoSuchElementException` if no match exists.
- `findElements()` returns zero or more elements.
- `StaleElementReferenceException` means the element reference no longer identifies the current DOM node.

## 8. Quick Recap

- Locate only after synchronization.
- Validate state before action.
- Re-locate stale elements.
- Keep searches scoped to the relevant container.
