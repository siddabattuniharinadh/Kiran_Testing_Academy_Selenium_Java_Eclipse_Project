# 5. CSS Selectors

## 1. Definition

CSS selectors identify elements using HTML tags, attributes, classes, IDs, and relationships. Selenium accepts CSS selectors through `By.cssSelector(...)`.

## 2. Uses

Use CSS selectors for fast, concise element identification, especially in modern web applications.

## 3. Syntax

```java
By.cssSelector("tag")
By.cssSelector("#id")
By.cssSelector(".class")
By.cssSelector("tag.class")
By.cssSelector("[attribute='value']")
By.cssSelector("parent > child")
By.cssSelector("parent child")
```

## 4. Examples

```java
driver.findElement(By.cssSelector("#username")).sendKeys("kiran");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret");
driver.findElement(By.cssSelector("button.primary")).click();

List<WebElement> rows =
    driver.findElements(By.cssSelector("table#orders tbody tr"));
```

## 5. Common Patterns

| CSS Pattern | Example | Meaning |
|---|---|---|
| `#id` | `#login` | Element with that ID |
| `.class` | `.primary` | Element with that class |
| `tag.class` | `button.primary` | Button with that class |
| `[name='x']` | `[name='email']` | Attribute exact match |
| `[name^='x']` | `[name^='user']` | Attribute starts with |
| `[name$='x']` | `[name$='name']` | Attribute ends with |
| `[name*='x']` | `[name*='name']` | Attribute contains |
| `parent > child` | `form > input` | Direct child |
| `A + B` | `label + input` | Adjacent sibling |

## 6. Important Points

- Selenium CSS selectors may differ from XPath in relationship and text capabilities.
- Standard CSS cannot directly select by exact visible text.
- Use stable application-specific attributes.
- Avoid overly generic selectors such as `div > input`.
- Do not rely on dynamically generated classes.

## 7. Interview and Revision Notes

- CSS selectors are generally concise and supported as WebDriver locators.
- XPath can traverse parent and text relationships more directly.
- An empty result from `findElements()` is not an exception.
- Always verify selector uniqueness before using it.

## 8. Quick Recap

- `#id`, `.class`, `[attribute='value']` are common patterns.
- Use direct child or sibling selectors for structure.
- Use XPath if text or parent traversal is essential.