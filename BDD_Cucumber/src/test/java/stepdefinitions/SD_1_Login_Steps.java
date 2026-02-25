package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SD_1_Login_Steps {

    WebDriver driver = new ChromeDriver();

    @Given("I launch the browser")
    public void i_launch_the_browser() {

        driver.manage().window().maximize();
    }

    
    @Given("I open the login page")
    public void i_open_the_login_page() {

        driver.get("https://www.saucedemo.com/");
    }
    

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
       
    }

    
    @When("I click on login button")
    public void i_click_on_login_button() {

        driver.findElement(By.id("login-button")).click();
    }

    
    @Then("I should be redirected to the products page")
    public void i_should_be_redirected_to_the_products_page() {

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        if(currentUrl.contains("inventory.html")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}