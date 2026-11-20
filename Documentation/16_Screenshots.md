# 16. Screenshots

## 1. Definition

A Selenium screenshot captures the current browser viewport or, in supported use, the page or element image.

## 2. Uses

Use screenshots for failed test evidence, visual diagnostics, responsive UI checks, and defect reporting.

## 3. Syntax

```java
TakesScreenshot screenshot = (TakesScreenshot) driver;
File source = screenshot.getScreenshotAs(OutputType.FILE);
File destination = new File("test-output/failure.png");
FileUtils.copyFile(source, destination);
```

## 4. Example

```java
TakesScreenshot screenshot = (TakesScreenshot) driver;
File source = screenshot.getScreenshotAs(OutputType.FILE);

File destination =
    new File("test-output/login-failure.png");
destination.getParentFile().mkdirs();

org.openqa.selenium.io.FileHandler.copy(source, destination);
```

## 5. Element Screenshot

```java
WebElement chart =
    driver.findElement(By.id("sales-chart"));
File chartImage = chart.getScreenshotAs(OutputType.FILE);
org.openqa.selenium.io.FileHandler.copy(
    chartImage,
    new File("test-output/sales-chart.png")
);
```

## 6. Important Points

- Selenium screenshot APIs require a WebDriver implementing `TakesScreenshot`.
- Capture immediately on failure.
- Add descriptive names and timestamps for reports.
- Screenshot bytes can be attached directly to test frameworks.
- Visual comparison should use dedicated baseline tools.

## 7. Interview and Revision Notes

- `OutputType.FILE`, `BASE64`, and `BYTES` are common output types.
- Page screenshot support can depend on Selenium or browser capabilities.
- An element screenshot can isolate a component.

## 8. Quick Recap

- Cast to `TakesScreenshot`.
- Capture as `FILE`, `BYTES`, or `BASE64`.
- Copy or attach the file.
