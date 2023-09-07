package org.example.exercices.TpClasseChaise;

public class Chaise {
    private int NbPieds;
    private String Couleur;
    private String Materiaux;

    public Chaise() {
    }

    public Chaise(int nbPieds, String couleur, String materiaux) {
        NbPieds = nbPieds;
        Couleur = couleur;
        Materiaux = materiaux;
    }

    @Override
    public String toString() {
        return "Je suis une Chaise, avec "
                + NbPieds + " pieds en "
                + Materiaux + " et de couleur "
                + Couleur;
    }
}
