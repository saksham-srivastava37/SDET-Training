package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_19_Assertion_2 {

    WebDriver driver = new ChromeDriver();


    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com");

        System.out.println("Browser Launched and Google Opened");
    }

    
    @Test
    public void verifyTitle() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        System.out.println("Actual Title: " + actualTitle);

       
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
    }

    
    @AfterClass
    public void teardown() {

        driver.quit();
        System.out.println("Browser Closed");
    }
}