package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class baseTest {

    public static WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}