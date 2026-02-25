package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/F_2_DemoLogin.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber_report_2.html"},
        monochrome = true
)
public class T_2_Demo_Login {
}