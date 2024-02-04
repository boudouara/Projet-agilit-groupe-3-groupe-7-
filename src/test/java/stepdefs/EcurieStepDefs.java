package stepdefs;

import org.example.Pilote;
import org.example.Ecurie;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class EcurieStepDefs {

    private Ecurie ecurie;
    private Pilote currentPilote;
    private String teamName;

    @Given("a racing team with the name {string}")
    public void aRacingTeamWithTheName(String teamName) {
        this.teamName = teamName;
        ecurie = new Ecurie();
        ecurie.setNom(teamName);
    }

    @And("a driver with the name {string}")
    public void aDriverWithTheName(String driverName) {
        currentPilote = new Pilote();
        currentPilote.setNom(driverName);
    }

    @When("I add the driver to the team")
    public void iAddTheDriverToTheTeam() {
        ecurie.ajoutPilote(currentPilote);
    }


    @Then("the driver {string} is associated with the team {string}")
    public void theDriverIsAssociatedWithTheTeam(String driverName, String teamName) {
        Pilote piloteToCheck = new Pilote();
        piloteToCheck.setNom(driverName);

        ArrayList<Pilote> pilotes = ecurie.getPilotes();
        boolean isPiloteInTeam = pilotes.stream().anyMatch(p -> p.getNom().equals(driverName));

        assertTrue(isPiloteInTeam);
    }

    @And("the number of drivers in the team {string} is {int}")
    public void theNumberOfDriversInTheTeamIs(String teamName, int expectedCount) {
        ArrayList<Pilote> pilotes = ecurie.getPilotes();
        int actualCount = pilotes.size();
        assertEquals(expectedCount, actualCount);
    }
}
