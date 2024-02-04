package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.example.*;

public class AgenceTest {

    @Test
    public void testInscrireEtDesinscrireClient() {
        Agence agence = new Agence();
        Observateur client1 = new Client("John Doe");
        Observateur client2 = new Client("Jane Doe");

        agence.inscrireClient(client1, "PieceA");
        agence.inscrireClient(client2, "PieceB");

        assertTrue(agence.getObservateurs().containsKey(client1));
        assertTrue(agence.getObservateurs().containsKey(client2));

        agence.desinscrireClient(client1, "PieceA");

        assertFalse(agence.getObservateurs().containsKey(client1));
        assertTrue(agence.getObservateurs().containsKey(client2));
    }

    @Test
    public void testAlertPiece() {
        Agence agence = new Agence();
        Observateur client1 = new Client("John Doe");
        Observateur client2 = new Client("Jane Doe");

        agence.inscrireClient(client1, "PieceA");
        agence.inscrireClient(client2, "PieceB");

        agence.nouvellePieceDisponible("PieceA");
        agence.nouvellePieceDisponible("PieceC");

        // Assurez-vous que les clients appropriés ont reçu l'alerte
        //assertTrue(((Client) client1).isPieceAlerteReceived());
        //assertFalse(((Client) client2).isPieceAlerteReceived());
    }
}