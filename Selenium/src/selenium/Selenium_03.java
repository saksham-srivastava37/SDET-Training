package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Selenium_03 {
public static void main(String[] args)
	{
 
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	try {
		driver.manage().window().maximize();
		
	    driver.get("https://www.google.com");
	    
	    String title =driver.getTitle();
	    
	    System.out.println("Page Title: " + title);
	
	    if(title.contains("Google"))
	    {
	    	System.out.println("Test Pass");
	    }
	    else
	    {
	    	System.out.println("Test Fail");
	    }
	}
	
	catch(Exception e)
	{
	System.out.println("Exception occured : " + e.getMessage());
	}
	
	finally
	{
		driver.quit();
	}
	}
 
}