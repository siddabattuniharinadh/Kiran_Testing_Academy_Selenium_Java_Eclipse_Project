# 17. Navigation Commands

## 1. Definition

WebDriver navigation methods control browser history and URL loading.

## 2. Uses

Used for page redirects, back/forward flow, refresh, and direct navigation.

## 3. Syntax

```java
driver.get("https://example.com/login");
driver.navigate().to("https://example.com/products");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
```

## 4. Example

```java
WebDriver driver = new ChromeDriver();
driver.get("https://example.com");

driver.findElement(By.linkText("Products")).click();
String productsUrl = driver.getCurrentUrl();

driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

System.out.println(productsUrl);
driver.quit();
```

## 5. Important Points

- `get(String)` and `navigate().to(String)` load URLs.
- `navigate().refresh()` reloads the current page.
- Browser history availability depends on prior navigation.
- Synchronize after each navigation.

## 6. Interview and Revision Notes

- `navigate().to(URL)` overload supports `java.net.URL`.
- `get(String)` is a common direct-navigation method.
- Navigation does not guarantee application readiness.

## 7. Quick Recap

- `get()` opens a URL.
- `back()`, `forward()`, and `refresh()` control browser history.
