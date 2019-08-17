package cucumber.cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = true,
        plugin = { "pretty","html:target/cucumber", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent.html" },
        features = "src/test/resources/Features",
        glue = {"cucumber.stepDefinitions"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
