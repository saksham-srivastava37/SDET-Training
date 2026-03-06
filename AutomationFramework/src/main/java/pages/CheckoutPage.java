package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id="first-name")
    WebElement firstName;

    @FindBy(id="last-name")
    WebElement lastName;

    @FindBy(id="postal-code")
    WebElement postalCode;

    @FindBy(id="continue")
    WebElement continueBtn;

    @FindBy(id="finish")
    WebElement finishBtn;

    public CheckoutPage enterDetails() {

        wait.until(ExpectedConditions.visibilityOf(firstName));

        firstName.sendKeys("Saksham");
        lastName.sendKeys("Srivastava");
        postalCode.sendKeys("834001");

        return this;
    }

    public void finishOrder() {

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(finishBtn)).click();
    }
}