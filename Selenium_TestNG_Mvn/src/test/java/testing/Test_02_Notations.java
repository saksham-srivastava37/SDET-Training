package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test_02_Notations {

    WebDriver driver;
    
    

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite - Runs once before entire suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest - Runs before <test> in XML");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass - Launch browser");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void beforeMethod() {
    	
    	driver.manage().window().maximize();
    	
        System.out.println("BeforeMethod - Runs before each test");
        
        driver.get("https://google.com");
    }

    @Test
    public void sampleTest1() {
        System.out.println("Test 1 executed");
    }

    @Test
    public void sampleTest2() {
        System.out.println("Test 2 executed");
        
        driver.quit();
        System.out.println("Exit success");
    }
    
   
}
