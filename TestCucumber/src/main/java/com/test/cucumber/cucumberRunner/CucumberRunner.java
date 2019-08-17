package com.test.cucumber.cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = true,
        plugin = { "pretty","html:target/cucumber" },
        features = "src/main/resources/Features",
        glue = {"com.test.cucumber.stepDefinitions"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
