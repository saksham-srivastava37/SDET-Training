package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Mvn_4_Scroll {
	public static void main(String[] args) throws InterruptedException{		
		
		
		 WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				Actions act = new Actions(driver);
				
				driver.get("https://www.saucedemo.com/");
				
				driver.manage().window().maximize();
				
				System.out.println("Title : " +driver.getTitle());
				
				Thread.sleep(1000);
				
				driver.findElement(By.name("user-name")).sendKeys("visual_user");
				
				Thread.sleep(1000);
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				Thread.sleep(2000);
				
				driver.findElement(By.name("login-button")).click();
				
				System.out.println("Logged in Successfully");
				
				Thread.sleep(3000);
				
				WebElement element_1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
				 
				act.moveToElement(element_1).perform();
				
				Thread.sleep(2000);

				driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
				
				
				
				Thread.sleep(3000);
				
				
				
				WebElement element_2 = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
				
				act.moveToElement(element_2).perform();
				
				Thread.sleep(2000);
				
				driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
				
				
				
				Thread.sleep(2000);
				
				
				WebElement element_3 = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
				
				act.moveToElement(element_3).perform();
				
				Thread.sleep(2000);

				driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
				
				
				
				Thread.sleep(2000);
				
				act.sendKeys(Keys.HOME).perform();	
				
				Thread.sleep(2000);


				
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				
				Thread.sleep(2000);
				
				act.sendKeys(Keys.END).perform();
				
				Thread.sleep(2000);
				
				act.sendKeys(Keys.HOME).perform();
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("checkout")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Saksham");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Srivastava");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("834001");
				
				Thread.sleep(1000);
				
				WebElement element_4 = driver.findElement(By.id("continue"));

				act.moveToElement(element_4).perform();
				
//				act.sendKeys(Keys.END).perform();
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("continue")).click();
				
				Thread.sleep(2000);
				
				act.sendKeys(Keys.HOME).perform();
				
				Thread.sleep(1000);
				
				act.sendKeys(Keys.END).perform();
				
				Thread.sleep(2000);				
				
				driver.findElement(By.id("finish")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/button")).click();
				
				System.out.println("Checkout Completed");

				
			

	}

}
