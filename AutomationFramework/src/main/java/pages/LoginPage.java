package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement loginBtn;

    public LoginPage enterUsername(String user) {
        username.sendKeys(user);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        password.sendKeys(pass);
        return this;
    }

    public void clickLogin() {
        loginBtn.click();
    }
}