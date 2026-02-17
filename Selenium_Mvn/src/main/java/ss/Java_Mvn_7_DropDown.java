package ss;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Mvn_7_DropDown {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Thread.sleep(2000);

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        
        dropdown.selectByVisibleText("Option 2");

        System.out.println("Dropdown selected");
    }
}