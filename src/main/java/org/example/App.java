package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client = new Client("Saber");
        Ecurie ecurie = new Ecurie("Ferrari");

        Agence agence = new Agence();

        agence.inscrireClient(client,"CHAINES A NEIGE POLAIRE GRIP 90");

        agence.inscrireClient(ecurie,"Amortisseur Arrière Ferrari F430 Coupe / Spider");


        Agence agencegroup = new Agence();

        agencegroup.inscrireClient(agence,"");


        //agence.desinscrireClient(client,"CHAINES A NEIGE POLAIRE GRIP 90");



        Agence agence2 = new Agence();

        Ecurie ecurieNadjet = new Ecurie("RedBull");

        agence2.inscrireClient(ecurieNadjet,"Amortisseur Arrière Ferrari F430 Coupe / Spider");

        agence.inscrireClient(agence2, "");


        agencegroup.nouvellePieceDisponible("CHAINES A NEIGE POLAIRE GRIP 90");

        agencegroup.nouvellePieceDisponible("Amortisseur Arrière Ferrari F430 Coupe / Spider");








         
    }
}
