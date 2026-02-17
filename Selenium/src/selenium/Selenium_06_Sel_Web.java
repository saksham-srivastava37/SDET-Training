package selenium;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class Selenium_06_Sel_Web {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       
        driver.get("https://www.selenium.dev");
        
        System.out.println("Page Title: " + driver.getTitle());
        
        System.out.println("Site Opened");
        
        Actions actions = new Actions(driver);
        
        Thread.sleep(2000);
        
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(4000);
        
        
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(4000);

//        Thread.sleep(2000);

       
        driver.navigate().to("https://www.selenium.dev/documentation/");
        
        System.out.println("Redirected to Documentation Page");


        Thread.sleep(2000);

       
        driver.navigate().back();
        System.out.println("Redirected to Previous Page");
        Thread.sleep(2000);

       
        driver.navigate().to("https://www.selenium.dev/downloads/");
        System.out.println("Redirected to Downloads Page");
        Thread.sleep(2000);
        
        
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Redirected to Previous Page");
        
        

//        driver.quit();
    }
}
