package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Test_06_LoginTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	@Test(dataProvider="excelData")
	public void loginTest(String Username, String Password)
	{
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("submit")).click();
		
		String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("logged-in-successfully")) {
            System.out.println("Login success for user: " + Username);
        } 
        else {
            System.out.println("Login failed for user: " + Username);
        }
    }
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="excelData")
	public Object[][] getExcelData() throws Exception{
		
		return Test_05_ExcelUtils.getExcelData("C:\\Users\\KIIT\\Selenium_TestNG_Mvn\\TestData\\LoginData.xlsx","Sheet1");
		
	
	}
 
 
}