package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Java_Mvn_6_RadioButton {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

        System.out.println("Radio button clicked");
    }
}
