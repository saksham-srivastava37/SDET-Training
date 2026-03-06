package selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_10_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.amazon.in");

        System.out.println("Title: "+driver.getTitle());
        
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Laptops");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit.addToCart")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("nav-cart-count-container")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[1]/span[1]/span/span/span/input")).click();
	
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("ap_email_login")).sendKeys("7008367075");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.className("a-button-input")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("password")).sendKeys("Saksham$00");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("nav-logo-sprites")).click();
	    
//	    driver.navigate().back();
	}

}
