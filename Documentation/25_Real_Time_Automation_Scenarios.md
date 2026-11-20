# 25. Real-Time Automation Scenarios

## 1. Definition

Real-time automation scenarios show how Selenium concepts combine to automate common user journeys.

## 2. Login Scenario

```java
WebDriverWait wait =
    new WebDriverWait(driver, Duration.ofSeconds(10));

driver.get("https://example.com/login");
driver.findElement(By.id("username")).sendKeys("kiran");
driver.findElement(By.id("password")).sendKeys("Secret123");
driver.findElement(By.id("login")).click();

wait.until(ExpectedConditions.urlContains("/dashboard"));
Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
```

## 3. Search and Filter Scenario

```java
driver.findElement(By.id("search")).sendKeys("Laptop");
driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

Select priceRange = new Select(driver.findElement(By.id("price")));
priceRange.selectByVisibleText("$500-$1000");

List<WebElement> products =
    driver.findElements(By.cssSelector(".product-card"));
Assert.assertFalse(products.isEmpty());
```

## 4. Checkout Scenario

```mermaid
flowchart LR
    A[Login] --> B[Search Product]
    B --> C[Add to Cart]
    C --> D[Review Cart]
    D --> E[Enter Address]
    E --> F[Choose Payment]
    F --> G[Place Order]
    G --> H[Verify Confirmation]
```

## 5. File Upload Scenario

```java
WebElement upload =
    driver.findElement(By.id("resume"));
upload.sendKeys("C:\\test-data\\resume.pdf");
```

## 6. Important Points

- Use the shortest stable validation that proves the journey.
- Synchronize after navigation and asynchronous updates.
- Keep test data valid and isolated.
- Verify the result, not only that an action did not throw an exception.

## 7. Interview and Revision Notes

- Login tests should verify protected-page access or a welcome state.
- Search tests should verify that returned results match filters.
- Checkout tests must isolate cart and account state.
- Upload tests require valid file paths and an appropriate input element.

## 8. Quick Recap

- Follow real user flow.
- Synchronize each state change.
- Assert the final outcome.
