package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_10_LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(dataProvider = "dbData")
    public void loginTest(String Username, String Password) throws InterruptedException{

        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("submit")).click();
        
        Thread.sleep(2000);
        
        

        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("logged-in-successfully")) {
            System.out.println("Logged in successfully: " + Username);
        } else {
            System.out.println("Login failed: " + Username);
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dbData")
    public Object[][] getDBData() throws Exception {
        return Test_09_DBUtils.getDBData();
    }
}
