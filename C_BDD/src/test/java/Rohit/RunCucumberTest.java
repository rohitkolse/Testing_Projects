package Rohit;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login2.feature",
        glue = "stepdefinations",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)

public class RunCucumberTest {
}
