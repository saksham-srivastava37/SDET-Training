package stepdefinitions;

//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class SD_2_Demo_Login {

    WebDriver driver = new ChromeDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() {

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters credentials")
    public void user_enters_credentials(DataTable table) {

        String username = table.cell(0, 0);
        String password = table.cell(0, 1);

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user validates login")
    public void user_validates_login() {
        System.out.println("Login executed");
    }

//    @After
//    public void close_browser() {
//        driver.quit();
//    }
}