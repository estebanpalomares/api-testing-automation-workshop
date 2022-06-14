package training.api.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
                    plugin = {"pretty",
                            "html:target/cucumber/reports/report.html"},
                tags = {"@API_METHODS"},
                strict = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
