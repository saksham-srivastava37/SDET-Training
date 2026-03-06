//package testing;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//import org.testng.ITestResult;
//import org.openqa.selenium.io.FileHandler;
//import java.io.File;
//import java.io.IOException;
//import org.openqa.selenium.OutputType;
//
//
//public class Test_20_Use_Case {
//	
//	WebDriver driver = new ChromeDriver();
//	
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Execution Started");
//	}
//	
//	
//	@BeforeMethod
//	public void setup() {
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	}
//	
//	@DataProvider(name = "loginData")
//	public Object[][] loginDataProvider(){
//		return new Object[][] {
//			{"standard_user","secret_sauce","LOGIN SUCCESS"},
//			{"standard_user","pass_1","ERROR"},
//			{"user_1","secret_sauce","ERROR"},
//			{"","","INVALID INPUT"}
//		};
//		
//	}
//	
//	@Test(dataProvider = "loginData")
//	public void testLogin(String username, String password, String expectedResult) {
//		
//		driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("login-button")).click();
//		
//        if (expectedResult.equals("LOGIN SUCCESS")) {
//
//            Assert.assertEquals(
//                    driver.getCurrentUrl(),
//                    "https://www.saucedemo.com/inventory.html"
//            );
//
//            System.out.println("Login Success");
//
//        } else if (expectedResult.equals("ERROR")) {
//
//            Assert.assertTrue(
//                    driver.findElement(By.xpath("//h3[@data-test='error']"))
//                            .getText()
//                            .contains("do not match")
//            );
//
//        } else if (expectedResult.equals("INVALID INPUT")) {
//
//            Assert.assertTrue(
//                    driver.findElement(By.xpath("//h3[@data-test='error']"))
//                            .getText()
//                            .contains("Username is required")
//            );
//			
//			System.out.println("Empty Field Validation");
//					
//		}
//	}
//	
//	 @AfterMethod
//	    public void tearDown(ITestResult result) {
//
//	        if (ITestResult.FAILURE == result.getStatus()) {
//
//	            TakesScreenshot ts = (TakesScreenshot) driver;
//	            File source = ts.getScreenshotAs(OutputType.FILE);
//
//	            String timestamp = String.valueOf(System.currentTimeMillis());
//	            File destination = new File("screenshots/" 
//	                    + result.getName() + "_" + timestamp + ".png");
//
//	            destination.getParentFile().mkdirs();
//
//	            try {
//	                FileHandler.copy(source, destination);
//	                System.out.println("Screenshot saved: " 
//	                        + destination.getAbsolutePath());
//	            } catch (IOException e) {
//	                e.printStackTrace();
//	            }
//	        }
//
//	        driver.quit();
//	    }
//	
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Execution Completed");
//	}
//	
//}






package testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class Test_20_Use_Case {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Execution Started");
    }

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "SUCCESS"},
                {"standard_user", "pass1", "ERROR"},
                {"user1", "secret_sauce", "ERROR"},
                {"", "", "INVALID"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expected) {

        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();

        if (expected.equals("SUCCESS")) {

            Assert.assertEquals(
                    driver.getCurrentUrl(),
                    "https://www.saucedemo.com/inventory.html",
                    "Login success URL mismatch"
            );

            System.out.println("Login Success");

        } else if (expected.equals("ERROR")) {

            String actualError =
                    driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

            Assert.assertEquals(
                    actualError,
                    "Epic sadface: Username and password do not match any user in this service",
                    "Error message mismatch"
            );

            captureScreenshot("Invalid_Credentials");

            System.out.println("Username or Password mismatch");

        } else {

            String actualError =
                    driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

            Assert.assertEquals(
                    actualError,
                    "Epic sadface: Username is required",
                    "Validation message mismatch"
            );

            captureScreenshot("Empty_Field");

            System.out.println("Empty Field");
        }
    }

  
    public void captureScreenshot(String scenarioName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = String.valueOf(System.currentTimeMillis());

        File destination = new File(
                "screenshots/" + scenarioName + "_" + timestamp + ".png"
        );

        destination.getParentFile().mkdirs();

        try {
            FileHandler.copy(source, destination);
            System.out.println("Screenshot captured: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    @AfterMethod
    public void tearDown(ITestResult result) {

        
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot("FAILED_" + result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }
    

    @AfterClass
    public void afterClass() {
        System.out.println("Execution Completed");
    }
}































