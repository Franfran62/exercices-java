package org.example.exercices;

import java.util.*;

public class Exo1 {

    static Scanner scanner = new Scanner(System.in);

    public static void exercice1() {

        System.out.println("Entrez un nombre : ");
        int int1 = scanner.nextInt();

        int int2 = int1 * int1;
        System.out.println(" Le carré est : " + int2);
    }

    public static void exercice2() {

        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.next();

        System.out.println("Bonjour, " + prenom + " !");

    }

    public static void exercices3() {

        System.out.println("Quel est le prix de l'article HT ?");
        int prixHT = scanner.nextInt();

        System.out.println("Combien avez-vous d'articles ? ");
        int nbArticles = scanner.nextInt();

        System.out.println("Quel est le taux de TVA ?");
        int tauxTVA = scanner.nextInt();


        int prixTTC = (prixHT + (prixHT * tauxTVA / 100)) * nbArticles;

        System.out.println(" Le prix TTC est de : " + prixTTC);
    }

    public static void exercice4And7() {

        System.out.println("Entrez un nombre");
        int nombre = scanner.nextInt();

        if (nombre > 0) {
            System.out.println("Le nombre entré est positif");
        } else if (nombre == 0) {
            System.out.println("Le nombre entré est zéro");
        } else {
            System.out.println("Le nombre entré est négatif");
        }
    }

    public static void exercice5() {

        System.out.println("Entrez un premier nombre ");
        int premier = scanner.nextInt();
        System.out.println("Entré un deuxième nombre ");
        int second = scanner.nextInt();

        if ((premier > 0 && second > 0) || (premier < 0 && second < 0)) {
            System.out.println("Le résultat de la multiplication entre " + premier + " et " + second + " est positif");
        } else {
            System.out.println("Le résultat de la multiplication entre " + premier + " et " + second + " est négatif");
        }
    }

    public static void exercice6() {

        System.out.println("Entrez un mot");
        String mot1 = scanner.next();
        System.out.println("Puis un autre mot");
        String mot2 = scanner.next();
        System.out.println("Enfin un dernier mot");
        String mot3 = scanner.next();

        if (mot1.compareTo(mot2) < 0 && mot2.compareTo(mot3) < 0) {
            System.out.println("Les mots saisis sont classés par odre alphabétique");
        } else {
            System.out.println(" Les mots ne sont pas classés par ordre alphabétique");

        }
    }

    public static void exercice8() {
        System.out.println("Entrez un nombre entre 1 et 3");
        int smallInt = scanner.nextInt();

        if (smallInt < 1 || smallInt > 3) {
            System.out.println("ERREUR : Le nombre saisi n'est pas compris entre 1 et 3");
            System.out.println("Veuillez recommencer s'il vous plait");
            exercice8();
        }
    }
}
