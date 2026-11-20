# 26. Selenium Interview Questions

## 1. Definition

This section contains concise Selenium revision questions and answers for interviews.

## 2. Core Questions

**What is Selenium?**

Selenium is an open-source browser automation suite consisting of WebDriver, Grid, IDE, and language bindings.

**What is the difference between `close()` and `quit()`?**

`close()` closes the current browser window. `quit()` closes every associated window and ends the WebDriver session.

**What is the difference between `findElement()` and `findElements()`?**

`findElement()` returns the first matching element or throws `NoSuchElementException`. `findElements()` returns a list, possibly empty.

**What is the W3C WebDriver protocol?**

It is the standardized HTTP-based protocol that Selenium clients use to send browser commands through browser drivers.

## 3. Locators

**Which locator should you use first?**

Prefer a unique stable ID or semantic attribute, followed by a concise CSS or accessible XPath.

**Why is XPath with multiple indexes brittle?**

UI structure changes can shift index positions, changing the selected element.

**How do CSS and XPath differ?**

CSS is concise for style and attribute relationships. XPath supports more flexible node traversal and text matching.

## 4. Wait Questions

**What is an explicit wait?**

An explicit wait repeatedly checks a specific condition within a timeout.

**Which wait should replace `Thread.sleep()`?**

Use `WebDriverWait` with `ExpectedConditions` or a custom fluent condition.

**Does `presenceOfElementLocated` mean visible?**

No. It means the element exists in the DOM. Use visibility or clickability conditions for those states.

## 5. Exception Questions

**How do you handle stale elements?**

Re-locate the element after the DOM or page state changes.

**What does `ElementClickInterceptedException` mean?**

Another element, such as an overlay or sticky header, may prevent the intended click.

## 6. Framework and Grid Questions

**What is POM?**

Page Object Model separates locators and page actions from test assertions and execution logic.

**What is TestNG `@DataProvider` used for?**

It supplies multiple argument sets to a TestNG test method.

**What is Selenium Grid used for?**

Remote and parallel browser test execution.

## 7. Scenario Questions

**How would you automate a pop-up window?**

Capture the original handle, wait for another handle, switch to the target, perform actions, close it, and return to the original handle.

**How would you automate an iFrame?**

Locate the frame, switch into it, interact, then switch to parent or default content.

**How would you handle a custom dropdown?**

Use ordinary WebDriver clicks and locators for the custom options; use `Select` only for native `<select>` elements.

## 8. Quick Recap

- Use stable locators.
- Synchronize by condition.
- Quit sessions.
- Re-locate stale elements.
- Use POM and TestNG for maintainability.
- Use Grid for remote and parallel execution.
