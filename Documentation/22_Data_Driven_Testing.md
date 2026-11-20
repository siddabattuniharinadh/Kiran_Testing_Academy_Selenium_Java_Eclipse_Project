# 22. Data-Driven Testing

## 1. Definition

Data-driven testing separates test input values from test logic and executes the same behavior with multiple data sets.

## 2. Uses

Use it for login matrices, form validation, search cases, registration, pricing rules, and API/browser combinations.

## 3. TestNG Syntax

```java
@DataProvider(name = "users")
public Object[][] users() {
    return new Object[][] {
        {"admin", "Admin123", true},
        {"guest", "Wrong123", false}
    };
}

@Test(dataProvider = "users")
public void loginTest(String username, String password, boolean expected) {
    // Enter credentials and verify the expected result.
}
```

## 4. CSV Example

```java
// Example record:
// username,password,expected
// kiran,Secret123,true
// unknown,Wrong123,false
```

Use a CSV library or standard Java `BufferedReader` and pass each record to TestNG or JUnit parameterized tests.

## 5. Important Points

- Keep test data independent of locators and page behavior.
- Do not use production credentials in source control.
- Use environment-specific configuration for URLs and secrets.
- Separate invalid, boundary, and valid data sets.
- Avoid one large test that obscures individual failures.

## 6. Interview and Revision Notes

- TestNG `@DataProvider` supplies test arguments.
- JUnit parameterized tests use parameter sources.
- Data-driven testing is not the same as property-based or API testing.
- Data sets should remain readable and maintainable.

## 7. Quick Recap

- Externalize or parameterize test inputs.
- Repeat behavior for each record.
- Assert each expected result.
