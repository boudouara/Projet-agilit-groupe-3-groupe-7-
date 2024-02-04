package org.example;
import java.util.ArrayList;
import java.util.Iterator;

public class Ecurie implements Observateur {
    private String nom;
    private ArrayList<Pilote> pilotes = new ArrayList();
    private int points;

    public Ecurie(String nom) {
        this.nom = nom;
    }
    public Ecurie() {}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setPilotes(ArrayList<Pilote> pilotes) {
        this.pilotes = pilotes;
    }

    public void ajoutPilote(Pilote pilote) {
        if (this.pilotes == null) {
            this.pilotes = new ArrayList();
        }

        this.pilotes.add(pilote);
    }

    public ArrayList getPilotes() {
        return this.pilotes;
    }

    public boolean ecurieComplete() {
        return this.pilotes.size() == 2;
    }

    public boolean avoirPilote(Pilote pilote) {
        return this.pilotes.contains(pilote);
    }

    public int getPointsEcurie() {
        this.points = 0;

        Pilote p;
        for(Iterator var1 = this.pilotes.iterator(); var1.hasNext(); this.points += p.getPoints()) {
            p = (Pilote)var1.next();
        }

        return this.points;
    }

    @Override
    public void alertPiece(String piece) {
        System.out.println("Ecurie " + nom + " " + piece + " Disponible");
    }

    @Override
    public String typeClient(){
        return "Ecurie";
    }


}