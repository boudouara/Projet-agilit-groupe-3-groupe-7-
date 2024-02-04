package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Agence implements Observateur{
    private HashMap<Observateur, String> observateurs = new HashMap<Observateur, String>();
    private List<String> pieces;

    public Agence(){
        pieces = new ArrayList<>();
    }

    public void inscrireClient(Observateur client, String piece) {
        observateurs.put(client, piece);
    }

    public void desinscrireClient(Observateur client, String piece) {
        observateurs.remove(client, piece);
    }

    public void setObservateurs(HashMap<Observateur, String> observateurs) {
        this.observateurs = observateurs;
    }

    public void setPieces(List<String> pieces) {
        this.pieces = pieces;
    }

    @Override
    public void alertPiece(String piece) {
        for (Entry<Observateur, String> entry : observateurs.entrySet()){
            if(entry.getKey().typeClient().equals("Agence")){
                entry.getKey().alertPiece(piece);
            }else if (entry.getValue().equals(piece)) {
                 entry.getKey().alertPiece(piece);
                break;
            }
        }
    }

    public void nouvellePieceDisponible(String piece){
        alertPiece(piece);
        this.pieces.add(piece);
    }


    @Override
    public String typeClient(){
        return "Agence";
    }


    public HashMap<Observateur, String> getObservateurs() {
        return observateurs;
    }

    public List<String> getPieces() {
        return pieces;
    }
}
