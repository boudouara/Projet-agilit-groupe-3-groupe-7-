package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgenceStepDefs {

    @Given("an agence")
    public void anAgence() {
    }

    @When("a new piece is available")
    public void aNewPieceIsAvailable() {
    }

    @Then("the agence should notify the clients")
    public void theAgenceShouldNotifyTheClients() {
    }

    @And("a client named {string} is registered for piece {string}")
    public void aClientNamedIsRegisteredForPiece(String arg0, String arg1) {
    }

    @When("the client {string} is unregistered for piece {string}")
    public void theClientIsUnregisteredForPiece(String arg0, String arg1) {
    }

    @Then("the agence should not notify the unregistered client about new pieces")
    public void theAgenceShouldNotNotifyTheUnregisteredClientAboutNewPieces() {
    }
}
