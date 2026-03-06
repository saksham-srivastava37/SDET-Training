package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01 {
public static void main(String[] args) {
	
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


	        WebDriver driver = new ChromeDriver(); //runtime poly.
	        
	        driver.get("https://www.google.com");

	        System.out.println("Title: "+driver.getTitle());

	        driver.quit(); // closes window
	        
//	        driver.close(); // closes only current tab
	    }
	

}

