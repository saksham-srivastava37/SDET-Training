package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test_21_Extent_Report {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    public void setupReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        test = extent.createTest("Google Title Test");
    }

    @Test
    public void verifyTitle() {
        String actualTitle = driver.getTitle();
        test.info("Fetched page title");

        Assert.assertTrue(actualTitle.contains("Google"));
        test.pass("Title verified successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        extent.flush();
    }
}