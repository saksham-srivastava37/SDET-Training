package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

import io.qameta.allure.*;

public class Test_22_Allure_Report {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    @Description("Verify Google page title")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyTitle() {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Google"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}