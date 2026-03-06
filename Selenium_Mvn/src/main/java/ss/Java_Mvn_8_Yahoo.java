package ss;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Java_Mvn_8_Yahoo {
public static void main(String[] args) throws InterruptedException{
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://login.yahoo.com/");
    
    System.out.println("Title: " +driver.getTitle());
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("login-username")).sendKeys("mesaksham@myyahoo.com");
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("login-signin")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("skip-button")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("login-passwd")).sendKeys("Login#00");
    
    Thread.sleep(2000);
    
    driver.findElement(By.id("login-signin")).click();
    
    System.out.println("Log in Successful");
    
    
 }
}
