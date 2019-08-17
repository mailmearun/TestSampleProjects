package cucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    @Given("^Launch Google\\.com$")
    public void launch_Google_com() throws Throwable {
        System.out.println("Step 1");
    }

    @When("^Enter valid Search keyword$")
    public void enter_valid_Search_keyword() throws Throwable {
        System.out.println("Step 2");
    }

    @Then("^Search Displayed$")
    public void search_Displayed() throws Throwable {
        System.out.println("Step 3");
    }

}
