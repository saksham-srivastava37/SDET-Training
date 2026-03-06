package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_17_Demo {

    WebDriver driver = new ChromeDriver();  

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();                 
        
        driver.manage().window().maximize();  
        
        driver.get("https://www.google.com");    

        System.out.println("Browser Launched and Google Opened");
    }
    

    @Test
    public void openGoogle() {

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }
    

    @AfterClass
    public void teardown() {

        driver.quit();  
        System.out.println("Browser Closed");
    }
}