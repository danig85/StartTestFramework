package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by daniela.gligan on 26/11/2017.
 */
public class LoginStep {
    private String username;
    private String password;

    @Given("^Player navigates to login page$")
    public void playerNavigatesToLoginPage() throws Throwable {
    }

    @When("^Player enters credentials ([^\"]*) and ([^\"]*) to Login$")
    public void playerEntersCredentialsUsernameUsernameAndPasswordPasswordToLogin(String username, String password) throws Throwable {
        this.username = username;
        this.password = password;
    }

    @And("^Player clicks the login button$")
    public void playerClicksTheLoginButton() throws Throwable {
    }

    @Then("^Player should be logged in$")
    public void playerShouldBeLoggedIn() throws Throwable {
    }

}


class Player {

    public String UserName;
    public String Password;

    public Player(String userName, String password) {

        UserName = userName;
        Password = password;

    }

}

