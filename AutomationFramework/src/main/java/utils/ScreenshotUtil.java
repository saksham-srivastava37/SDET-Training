package utils;

import org.openqa.selenium.*;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String path = "screenshots/" + testName + ".png";

        try {

            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            FileHandler.copy(src, new File(path));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}