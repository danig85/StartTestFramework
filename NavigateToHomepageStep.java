package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by daniela.gligan on 26/11/2017.
 */
public class NavigateToHomepageStep {
    @Given("^The application is started$")
    public void theApplicationIsStarted() throws Throwable {
    }

    @When("^Player enters the application URL$")
    public void playerEntersTheApplicationUrl() throws Throwable {
    }

    @Then("^Player navigates to homepage \"([^\"]*)\"$")
    public void playerNavigatesToHomepage(String homepage) throws Throwable {
    }
}
