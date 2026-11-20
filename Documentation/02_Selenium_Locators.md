# 2. Selenium Locators

## 1. Definition

A **locator** identifies an element in the DOM so Selenium can perform actions or read element data.

## 2. Uses

Locators are used before every element action, for example:

```java
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("kiran");
```

They are needed for buttons, fields, links, checkboxes, tables, menus, and dynamic UI components.

## 3. Syntax

```java
By.id("login");
By.name("username");
By.className("primary");
By.tagName("button");
By.linkText("Forgot password?");
By.partialLinkText("Forgot");
By.xpath("//input[@id='username']");
By.cssSelector("#username");
```

## 4. Examples

```java
WebElement loginButton = driver.findElement(By.id("login"));
loginButton.click();

List<WebElement> textFields = driver.findElements(By.tagName("input"));

WebElement forgotPassword = driver.findElement(
    By.partialLinkText("Forgot")
);
forgotPassword.click();
```

## 5. Locator Priority

Use the most stable locator available:

1. Unique `id`
2. Unique `name`
3. Meaningful CSS selectors
4. Accessible attributes or text
5. XPath

Prefer `data-testid`, `aria-*`, labels, or unique semantic attributes when test owners control the application markup.

## 6. Important Differences

| Locator | Strength | Common Risk |
|---|---|---|
| `id` | Fast and usually unique | Duplicate IDs make it unsuitable |
| `name` | Useful for form fields | Duplicate names are possible |
| `className` | Simple | Often reused by many elements |
| `CSS` | Fast and concise | Complex selectors can be difficult to read |
| `XPath` | Powerful and flexible | Long or index-based XPath is brittle |

## 7. Common Mistakes

- Using generated CSS classes or XPath indexes.
- Mixing up `findElement()` and `findElements()`.
- Selecting a hidden or disabled element by locator alone.
- Assuming an identifier is unique without inspecting the DOM.

## 8. Interview and Revision Notes

- `findElement()` returns the first match or throws `NoSuchElementException`.
- `findElements()` returns an empty list when no matches exist.
- Link text matches the complete visible link text.
- Partial link text matches part of the visible link text.

## 9. Quick Recap

- Start with stable semantic attributes.
- Avoid brittle absolute XPath.
- Test uniqueness in the browser console or DevTools.
- Use `findElements()` when elements may be absent.