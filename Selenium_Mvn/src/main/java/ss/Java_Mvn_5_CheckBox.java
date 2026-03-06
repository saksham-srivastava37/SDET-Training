package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Mvn_5_CheckBox {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");

        System.out.println("Title: " + driver.getTitle());

        driver.manage().window().maximize();

        Thread.sleep(2000);

       
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000);

     
        driver.findElement(By.id("a-autoid-1-announce")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.id("a-autoid-2-announce")).click();
        Thread.sleep(3000);

      
        driver.findElement(By.id("a-autoid-3-announce")).click();
        Thread.sleep(3000);

        
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(3000);

      
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[1]/div[1]/span/div/label/span")).click();
        Thread.sleep(2000);

      
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        Thread.sleep(3000);

     
        driver.findElement(By.id("ap_email_login")).sendKeys("7008367075");
        Thread.sleep(1000);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("Saksham$00");
        Thread.sleep(1000);

        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(3000);

    
        driver.findElement(By.id("nav-logo-sprites")).click();

        System.out.println("Automation Completed");
    }
}
