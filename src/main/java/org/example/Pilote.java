package org.example;
public class Pilote {
    private int numero;
    private int points;

    private String Nom;
    private Ecurie ecurie = new Ecurie();

    public Pilote() {
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getPoints() {
        return this.points;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void ajoutPointsVainqueur() {
        this.points += 25;
    }

    public void conduitPour(Ecurie ecurie) {
        this.ecurie = ecurie;
    }

    public boolean conduitPourEcurie(Ecurie ecurie) {
        return this.ecurie == ecurie;
    }
}

