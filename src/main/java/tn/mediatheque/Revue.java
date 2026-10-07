package tn.mediatheque;



public class Revue extends Document {

    private final int numero;

    // Une Revue n'est pas Empruntable

    public Revue(String titre, int annee, int numero) {
        super(titre, annee);
        this.numero = numero;
    }

    @Override
    public String descriptionCourte() {
        return "[Revue] " + titre + " (" + annee + "), numéro " + numero;
    }

    @Override
    public void emprunter() {

    }

    @Override
    public void rendre() {

    }

    @Override
    public boolean estDisponible() {
        return false;
    }
}


