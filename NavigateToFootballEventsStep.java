package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

/**
 * Created by daniela.gligan on 26/11/2017.
 */
public class NavigateToFootballEventsStep {

    @And("^Player clicks on Football Event$")
    public void playerClicksOnFootballEvent() throws Throwable {
    }

    @Then("^Player is redirected to Football Events URL \"([^\"]*)\"$")
    public void playerIsRedirectedToFootballEventsURL(String FootballUrl) throws Throwable {
    }

    @Then("^Player is redirected to chosen event URL \"([^\"]*)\"$")
    public void playerIsRedirectedToChosenEventURL(String event) throws Throwable {
    }

    @And("^Player selects a Sports event <footballEvent>$")
    public void playerSelectsASportsEventFootballEvent() throws Throwable {
    }
}

class FootballSport {
    public String FootballEvent;
    public String FootballUrl;

    public FootballSport(String footballEvent, String footballUrl) {
        FootballEvent = footballEvent;
        FootballUrl = footballUrl;
    }

}

class TennisSport {
    public String TennisEvent;
    public String TennisUrl;

    public TennisSport(String tennisEvent, String tennisUrl) {
        TennisEvent = tennisEvent;
        TennisUrl = tennisUrl;

    }


}
