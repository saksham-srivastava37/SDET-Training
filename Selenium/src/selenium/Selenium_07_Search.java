package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_07_Search {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        
        driver.manage().window().maximize();

        
        driver.findElement(By.name("q")).sendKeys("Selenium");
              

        
        driver.findElement(By.name("q")).submit();

        
        Thread.sleep(3000);

        
//        driver.quit();
    }
}
