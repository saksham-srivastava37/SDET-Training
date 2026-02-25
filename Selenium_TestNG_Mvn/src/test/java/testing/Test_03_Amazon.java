package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Test_03_Amazon {

    WebDriver driver;

   
    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

   
    @BeforeMethod
    public void openAmazon() {

        driver.get("https://www.amazon.in");
        System.out.println("Amazon opened");
    }

    
    @Test(priority = 0)
    public void verifyTitle() {
        System.out.println("Title: " +driver.getTitle());
    }
    
    @Test(priority = 1)
    public void login() throws InterruptedException {
    	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("ap_email_login")).sendKeys("7008367075");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/span/form/span/span/input")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("ap_password")).sendKeys("Saksham$00");
    	Thread.sleep(2000);
    	driver.findElement(By.id("signInSubmit")).click();
    	
    }
   
    @Test(priority = 2)
    public void searchProduct() throws InterruptedException {
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
    }

     
    @Test(priority = 3)
    public void addToCart() throws InterruptedException {
         Thread.sleep(2000);
         driver.findElement(By.id("a-autoid-3-announce")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("a-autoid-4-announce")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("a-autoid-5-announce")).click();
         Thread.sleep(3000);
 }
   
    
    @Test(priority = 4)
    public void openCart() throws InterruptedException {
         driver.findElement(By.id("nav-cart-count")).click();
    }
    
    @Test(priority = 5)
    public void checkBox() throws InterruptedException {
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[5]/div/b/div/div[1]/div/form/ul/div[5]/div[4]/div/div[1]/label/i")).click();
        Thread.sleep(2000);
    }
    
    @Test(priority = 6)
    public void checkout() throws InterruptedException {
    	driver.findElement(By.name("proceedToRetailCheckout")).click();
    	Thread.sleep(5000);
    }
    
    @Test(priority = 7)
    public void logout() throws InterruptedException{
    	driver.findElement(By.id("nav-logo-sprites")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[3]/div[2]/div[2]/div/div[3]/ul/li[2]/a")).click();
    }
    

 
    @AfterMethod
    public void afterTest() {
        System.out.println("Tests finished");
    }

  
//    @AfterClass
//    public void closeBrowser() {
//        driver.quit();
//        System.out.println("Browser closed");
//    }
}
