package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Selenium_05_Firefox {
public static void main(String[] args)
	{
 
//	System.setProperty("webdriver.edge.driver","C:\\Users\\KIIT\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
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