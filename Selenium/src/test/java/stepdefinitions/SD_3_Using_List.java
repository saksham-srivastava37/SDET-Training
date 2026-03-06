package stepdefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class SD_3_Using_List {

    WebDriver driver = new ChromeDriver();

    @Given("user on login page")
    public void user_is_on_login_page() {
 
        driver.manage().window().maximize();
  
        driver.get("https://www.saucedemo.com/");
    }

    
    @When("user enters usernames")
    public void user_enters_usernames(List<String> usernames) {

        for (String username : usernames) {

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("password")).clear();

            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            driver.get("https://www.saucedemo.com/");
            
//            driver.navigate().back();
        }
    }

    @Then("user validation")
    public void user_validation() {
        System.out.println("List Data Driven executed");
    }

    @After
    public void close_browser() {
        driver.quit();
   }
}