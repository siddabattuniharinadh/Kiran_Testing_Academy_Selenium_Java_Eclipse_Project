# 15. Web Tables

## 1. Definition

A web table represents tabular HTML data using `<table>`, `<thead>`, `<tbody>`, `<tr>`, `<th>`, and `<td>` elements.

## 2. Uses

Used for product lists, order records, user grids, reports, and dynamic pagination.

## 3. Syntax

```java
List<WebElement> rows =
    driver.findElements(By.cssSelector("table tbody tr"));

for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
}
```

## 4. Example

```java
WebElement table =
    driver.findElement(By.id("orders"));

List<WebElement> rows =
    table.findElements(By.cssSelector("tbody tr"));

for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));

    if (!cells.isEmpty() && cells.get(1).getText().equals("Paid")) {
        cells.get(0).findElement(By.tagName("a")).click();
        break;
    }
}
```

## 5. Important Points

- Search within the table rather than the entire document.
- CSS or XPath can identify a row by cell text.
- Dynamic sorting and pagination change row position.
- Header names are more understandable than column indexes.
- Re-locate rows after sorting or filtering.

## 6. Interview and Revision Notes

- `<tr>` defines rows.
- `<td>` defines data cells.
- `<th>` defines header or heading cells.
- XPath can find a row containing specific text.

## 7. Quick Recap

- Locate the table.
- Find body rows.
- Find cells inside each row.
- Match values before acting.
