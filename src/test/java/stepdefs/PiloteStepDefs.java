package stepdefs;

import org.example.Pilote;

import static junit.framework.Assert.assertEquals;

public class PiloteStepDefs {

    private Pilote pilote;

    @io.cucumber.java.en.Given("a pilote with number {int} and {int} points")
    public void aPiloteWithNumberAndPoints(int piloteNumber, int points) {
        pilote = new Pilote();
        pilote.setNumero(piloteNumber);
        pilote.setPoints(points);
    }

    @io.cucumber.java.en.When("the pilote wins a race")
    public void thePiloteWinsARace() {
        pilote.ajoutPointsVainqueur();
    }

    @io.cucumber.java.en.Then("the pilote should have {int} points")
    public void thePiloteShouldHavePoints(int expectedPoints) {
        assertEquals(expectedPoints, pilote.getPoints());
    }
}
