# 24. Selenium Best Practices

## 1. Definition

Selenium best practices are engineering techniques that improve test reliability, maintainability, speed, and failure diagnosis.

## 2. Uses

Apply practices across locators, synchronization, page objects, browser setup, teardown, and CI execution.

## 3. Recommended Checklist

```java
WebDriverWait wait =
    new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement login =
    wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
login.click();
```

```java
@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
```

## 4. Important Points

- Prefer stable IDs, semantic attributes, and user-focused locators.
- Use explicit waits for specific conditions.
- Keep tests independent and reproducible.
- One test should validate one primary behavior.
- Use unique test data or cleanup data after each test.
- Quit every WebDriver session.
- Capture screenshot and page URL on failure.
- Run critical smoke tests quickly and broader suites separately.
- Do not place sleeps, secrets, or environment-specific paths in source code.

## 5. Common Mistakes

| Mistake | Better Approach |
|---|---|
| Hard-coded sleep | Explicit or fluent wait |
| Absolute XPath | Relative stable locator |
| Shared mutable state | Independent test data and driver |
| Duplicate locators | POM or component object |
| JavaScript for every click | Normal WebDriver action |
| `close()` for cleanup | `quit()` |
| Catching all exceptions | Meaningful failure handling |

## 6. Quick Recap

- Independent tests.
- Stable locators.
- Condition-based waits.
- Clean setup and teardown.
- Test data isolation.
- Observable and actionable failure evidence.
