package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_08_Login {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Test(dataProvider = "csvData")
    public void loginTest(String Username, String Password) {

        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(Password);
        driver.findElement(By.id("submit")).click();

        String currentURL = driver.getCurrentUrl();

        if (currentURL.contains("logged-in-successfully")) {
            System.out.println("Login Success for : " + Username);
        } else {
            System.out.println("Login Failed for : " + Username);
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "csvData")
    public Object[][] getCSVData() throws Exception {



        return Test_07_CSVUtils.getCSVData("C:\\Users\\KIIT\\Selenium_TestNG_Mvn\\TestData\\loginData.csv");
    }
}
