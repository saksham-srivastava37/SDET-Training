package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_09_Upload_File {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        
        driver.manage().window().maximize();
        
        System.out.println("Title: " +driver.getTitle());
        
        Thread.sleep(3000);

        
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\KIIT\\Downloads\\Order Details.pdf");
              
       
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[2]")).click();
        
        System.out.println("File uploaded successfully");

        

    }
}
