package testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Test_01 {
	
//	public static void main(String[] args) {
	
		
		@Test
		
		public void openGoogle() {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			System.out.println("Title: "+driver.getTitle());
		
			driver.quit();
			
			
			
			
		}
	

}
//}
