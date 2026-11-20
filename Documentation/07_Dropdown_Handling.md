# 7. Dropdown Handling

## 1. Definition

An HTML dropdown is commonly implemented with the standard `<select>` element. Selenium provides the `Select` class for such controls.

## 2. Uses

Use dropdown handling for country, state, title, category, date, shipping method, and role selection.

## 3. Syntax

```java
Select dropdown = new Select(
    driver.findElement(By.id("country"))
);

dropdown.selectByVisibleText("India");
dropdown.selectByValue("IN");
dropdown.selectByIndex(2);
```

## 4. Example

```java
WebElement categoryElement =
    driver.findElement(By.id("category"));
Select category = new Select(categoryElement);

category.selectByVisibleText("Books");

System.out.println(category.getFirstSelectedOption().getText());

for (WebElement option : category.getOptions()) {
    System.out.println(option.getText());
}
```

## 5. Multi-Select Dropdown

```java
Select skills = new Select(driver.findElement(By.id("skills")));

if (skills.isMultiple()) {
    skills.selectByVisibleText("Java");
    skills.selectByValue("selenium");
    skills.deselectByValue("selenium");
    skills.deselectAll();
}
```

## 6. Important Methods

| Method | Purpose |
|---|---|
| `selectByIndex(int)` | Select by option index |
| `selectByValue(String)` | Match the option `value` attribute |
| `selectByVisibleText(String)` | Match rendered option text |
| `deselectByVisibleText(String)` | Remove a selected text match |
| `deselectByValue(String)` | Remove a selected value match |
| `deselectAll()` | Clear a multi-select |
| `getOptions()` | Return all options |
| `getAllSelectedOptions()` | Return selected options |
| `getFirstSelectedOption()` | Return first selected option |
| `isMultiple()` | Checks multi-select support |

## 7. Important Points

- Use `Select` only for native `<select>` elements.
- Custom React, Angular, or JavaScript dropdowns are regular `WebElement`s; interact through clicks and options.
- Select by visible text when text is stable and user-focused.
- Select by value when the value is stable and unique.
- Indexes are more brittle than text or value.

## 8. Interview and Revision Notes

- `UnsupportedOperationException` can occur when trying to deselect a single-select dropdown.
- Verify `isMultiple()` before using multi-select operations.
- `<select>` options can be identified by text, value, or index.

## 9. Quick Recap

- Native dropdown: create `new Select(element)`.
- Select: `selectByVisibleText`, `selectByValue`, or `selectByIndex`.
- Custom dropdown: click and select as normal elements.