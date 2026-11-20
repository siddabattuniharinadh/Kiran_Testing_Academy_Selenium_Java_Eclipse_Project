# 20. PageFactory

## 1. Definition

PageFactory initializes WebElement fields annotated with `@FindBy` and may also support the `@CacheLookup` annotation.

## 2. Uses

Use PageFactory in simple POM designs to declare page elements and initialize them before use.

## 3. Syntax

```java
public class LoginPage {
    private final WebDriver driver;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
```

## 4. Example

```java
public void login(String user, String pass) {
    username.clear();
    username.sendKeys(user);
    password.clear();
    password.sendKeys(pass);
    loginButton.click();
}
```

## 5. Important Points

- `PageFactory.initElements(driver, this)` initializes fields.
- By default, elements may be resolved lazily through proxies.
- Modern POM may use plain `By` locators and explicit finds.
- `@CacheLookup` can reduce lookup calls but increases stale-element risk after DOM replacement.

## 6. Interview and Revision Notes

- PageFactory is an enhancement to POM, not a replacement.
- `@FindBy` supports `id`, `name`, `css`, `xpath`, `tagName`, `className`, link text, and partial link text.
- Plain locators are often easier to inspect and reuse.

## 7. Quick Recap

- Annotate fields.
- Initialize through PageFactory.
- Use fields in page methods.
