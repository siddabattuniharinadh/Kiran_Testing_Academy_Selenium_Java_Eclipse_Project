# 21. TestNG Integration

## 1. Definition

TestNG is a Java test framework for grouping, ordering, parameterizing, parallelizing, and reporting Selenium tests.

## 2. Uses

Use TestNG for browser setup and teardown, assertions, test suites, data providers, groups, and reporting.

## 3. Syntax

```java
public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void validLoginTest() {
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
```

## 4. Common Annotations

| Annotation | Purpose |
|---|---|
| `@BeforeSuite` | Once before the suite |
| `@BeforeClass` | Before the current class |
| `@BeforeMethod` | Before every test method |
| `@Test` | Marks a test |
| `@AfterMethod` | After every test method |
| `@AfterClass` | After the current class |
| `@AfterSuite` | Once after the suite |
| `@DataProvider` | Supplies test data |

## 5. Example with Data Provider

```java
@DataProvider(name = "loginData")
public Object[][] loginData() {
    return new Object[][] {
        {"validUser", "validPass", true},
        {"invalidUser", "invalidPass", false}
    };
}

@Test(dataProvider = "loginData")
public void loginTest(String user, String pass, boolean shouldLogin) {
    // Perform login and assert the expected result.
}
```

## 6. Important Points

- Create a new WebDriver instance per test unless an intentional shared fixture exists.
- Always quit drivers in `@AfterMethod` or an equivalent teardown.
- Use test groups and Maven profiles carefully.
- Parallel execution requires thread-safe WebDriver and test data.

## 7. Interview and Revision Notes

- `@BeforeMethod` and `@AfterMethod` provide test-level setup.
- Assertions stop or fail a test according to the assertion API.
- `dependsOnMethods` expresses test dependency but should be avoided when independent setup is available.

## 8. Quick Recap

- Use annotations for lifecycle.
- Use `@Test` for test methods.
- Use `@DataProvider` for data sets.
- Quit drivers in teardown.
