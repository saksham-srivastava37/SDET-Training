package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ConfirmationPage {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="complete-header")
    WebElement confirmationText;

    public String getConfirmationMessage(){
        return confirmationText.getText();
    }
}