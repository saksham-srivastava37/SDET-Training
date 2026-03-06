package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.openqa.selenium.WindowType;
 
public class TestNG_3_MultiCred {
 
	@Test (dataProvider="loginData")
	public void loginTest(String username, String password) throws InterruptedException{
		WebDriver driver= new ChromeDriver();
		
//		 driver.switchTo().newWindow(WindowType.TAB);
		 
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("submit")).click();
		
		
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
//		
//		driver.findElement(By.cssSelector("button#submit"));		
	    
	
		
		
		
		driver.quit();
	}
		@DataProvider(name="loginData")
		public Object[][] getData()
		{
			return new Object[][]
		{
				{"user1", "pass1"},	
				{"user2", "pass2"},	
				{"user3", "pass3"},
				{"student", "Password123"}
 
		};
		
	}
	
	
}