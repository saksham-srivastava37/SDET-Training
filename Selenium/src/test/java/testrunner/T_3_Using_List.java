package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/F_3_Using_List.feature",
        glue = "stepdefinitions",
        plugin = {"pretty","html:target/cucumber_report_3.html"},
        monochrome = true
)
public class T_3_Using_List {
}