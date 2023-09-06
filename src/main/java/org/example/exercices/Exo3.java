package org.example.exercices;

public class Exo3 {
    public static void exercice1() {

        int notes[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        float moyenneClasse = 0;
        int noteMin = 20;
        int noteMax = 0;

        System.out.print("Voici les notes de la classes : ");

        for (int i = 0; i < notes.length; i++) {

            // On prépare le calcul de la moyenne
            moyenneClasse += notes[i];

            // On affiche les notes dans le terminal
            if ( i < (notes.length -1))
            {
                System.out.print(notes[i]+", ");
            } else {
                System.out.println(notes[i] + ".");
            }

            // On trouve la note Min
            if (notes[i] < noteMin)
            {
                noteMin = notes[i];
            }

            // On trouve la note Max
            if (notes[i] > noteMax)
            {
                noteMax = notes[i];
            }

        }
        // On termine le calcul de la moyenne
        moyenneClasse /= notes.length;

        System.out.println("La moyenne de la classe est de : " + moyenneClasse);
        System.out.println("La note la plus basse est : " + noteMin);
        System.out.println("La note la plus haute est : " + noteMax);
    }

    public static void exercice3() {

        String[] tabInitial = {"D","E","C","A","L","A","G","E"};
        String[] tabModifié = new String[tabInitial.length];

        tabModifié[(tabInitial.length) -1] = tabInitial[0] ;

        for (int i = 0; i < (tabInitial.length - 1); i++)
        {
            tabModifié[i] = tabInitial[i+1];
        }

        for (String s : tabModifié) {
            System.out.print(s + " ");
        }
    }
}
