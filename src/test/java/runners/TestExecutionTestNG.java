package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/features/SwagScenariooutline.feature",
	    glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)

public class TestExecutionTestNG extends AbstractTestNGCucumberTests{

}
