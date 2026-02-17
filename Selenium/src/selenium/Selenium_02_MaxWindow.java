package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_02_MaxWindow {
	public static void main(String[] args)  {
		
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


	        WebDriver driver = new ChromeDriver(); 
	        
	        driver.manage().window().maximize(); //max window
	        
	        driver.get("https://www.amazon.com");
	        
	        
	        try {
	            Thread.sleep(5000); 
	        } 
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
//	        Thread.sleep(5000); //wait

	        System.out.println("Title: "+driver.getTitle());

	        driver.quit(); 
	        
	       
}
}
