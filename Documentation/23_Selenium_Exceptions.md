# 23. Selenium Exceptions

## 1. Definition

Selenium exceptions describe failures during WebDriver command execution.

## 2. Uses

Use exception knowledge to diagnose locator problems, synchronization issues, stale DOM references, and invalid window or frame contexts.

## 3. Common Exception Table

| Exception | Meaning | Common Fix |
|---|---|---|
| `NoSuchElementException` | Locator did not find an element | Wait and correct locator |
| `TimeoutException` | Explicit wait condition was not met | Verify condition and timeout |
| `StaleElementReferenceException` | DOM node or element reference changed | Re-locate element |
| `ElementClickInterceptedException` | Another element blocked the click | Wait, scroll, close overlay |
| `ElementNotInteractableException` | Element cannot receive interaction | Wait, visibility, enablement |
| `NoSuchFrameException` | Frame context was invalid | Correct frame switch |
| `NoSuchWindowException` | Window handle was invalid or closed | Verify handles |
| `NoAlertPresentException` | Alert context was unavailable | Wait for alert |
| `InvalidSelectorException` | Locator syntax was invalid | Correct XPath/CSS |
| `SessionNotCreatedException` | Browser session could not start | Check browser, driver, and options |

## 4. Example: Recovering a Stale Element

```java
WebElement searchResult =
    wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("search-result")
    ));

searchResult.click();
```

After a DOM replacement, reacquire:

```java
WebElement refreshedResult =
    wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("search-result")
    ));
refreshedResult.click();
```

## 5. Exception Handling

```java
try {
    driver.findElement(By.id("missing")).click();
} catch (NoSuchElementException exception) {
    System.out.println("Expected element was not found.");
    throw exception;
}
```

Do not catch exceptions only to hide failures; log the relevant context and rethrow or convert them into a meaningful test failure.

## 6. Important Points

- Most Selenium exceptions indicate an application state or locator issue.
- Synchronization is usually the root fix, not broad exception swallowing.
- Capture screenshots and DOM/context details at failure.
- Re-locate stale elements after page updates.

## 7. Interview and Revision Notes

- `NoSuchElementException` differs from an empty `findElements()` list.
- `TimeoutException` is raised after an explicit wait timeout.
- Stale elements require re-location.

## 8. Quick Recap

- Identify the exception.
- Verify locator and browser state.
- Synchronize or re-locate.
- Report with context.
