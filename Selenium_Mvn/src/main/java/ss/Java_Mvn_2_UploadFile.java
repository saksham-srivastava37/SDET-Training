package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Java_Mvn_2_UploadFile {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		System.out.println("Title: " +driver.getTitle());
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\KIIT\\Downloads\\project-assessment-report-1-16-2026 (1).pdf");
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[2]")).click();
        
        System.out.println("File uploaded successfully");

	}

}
