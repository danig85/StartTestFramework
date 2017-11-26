package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by daniela.gligan on 26/11/2017.
 */
public class BetOnAFootballEventStep {
    @When("^Player clicks on first football event$")
    public void playerClicksOnFirsFootballEvent() throws Throwable {
    }

    @Then("^Player bets on the event$")
    public void playerBetsOnTheEvent() throws Throwable {
    }

    @And("^Player confirms the purchase$")
    public void playerConfirmsThePurchase() throws Throwable {
    }

    @And("^Player receives betslip with bet amount$")
    public void playerReceivesBetSlipWithBetAmount() throws Throwable {
    }
}

//I would need to crate a type of sports stake transaction
//TODO parameterize the betslip to accept any amount
