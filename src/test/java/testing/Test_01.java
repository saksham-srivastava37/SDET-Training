//package testing;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//
//public class Test_01 {	
//		
//		@Test
//		
//		public void openGoogle() {
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://www.google.com");
//			
//			System.out.println("Title: "+driver.getTitle());
//		
//			driver.quit();
//			
//			
//			
//			
//		}
//	
//
//}


package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_01 {

    @Test
    public void openGoogle() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // important for Jenkins
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}

