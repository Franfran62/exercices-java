package org.example.exercices;

import java.util.Scanner;

public class Exo2 {

    static Scanner scanner = new Scanner(System.in);

    public static void exercice1() {

        System.out.println("Saisissez votre âge");
        int age = scanner.nextInt();

        switch (age) {

            case 6, 7:
                System.out.println("Poussin");
                break;

            case 8,9:
                System.out.println("Pupille");
                break;

            case 10,11:
                System.out.println("Minime");
                break;

            default:
                if (age >= 12) {
                    System.out.println("Cadet");
                } else {
                    System.out.println("Vous êtes trop jeune");
                }
        }
    }

    public static void exercice2() {

        System.out.println("Entrez un nombre");
        int nombre = scanner.nextInt();

        if (nombre%3 == 0) {
            System.out.println( nombre+ " est divisible par 3, son diviseur est : "+ (nombre / 3));
        } else {
            System.out.println(nombre+" n'est pas divisible par 3");
        }


    }

    public static void exercice3() {

        float lowPrice = 0.05F;
        float mediumPrice = 0.10F;
        float highPrice = 0.15F;

        System.out.println("Combien de photocopies voulez-vous faire ?");
        int NbDePhotocopies = scanner.nextInt();

        if ( NbDePhotocopies < 10) {
            System.out.println(" Le prix est de : "+( highPrice * NbDePhotocopies+" euros." ));
        } else if (NbDePhotocopies < 20) {
            System.out.println(" Le prix est de : "+( mediumPrice * NbDePhotocopies+" euros." ));
        } else {
            System.out.println(" Le prix est de : "+( lowPrice * NbDePhotocopies+" euros." ));
        }
    }

    public static void exercice4() {

        System.out.println("Entrez un nombre entre 1 et 3");
        int nombre = scanner.nextInt();

         while ( nombre < 1 || nombre > 3) {
             System.out.println("ERREUR : veuillez recommencer");
             System.out.println("Entrez un nombre entre 1 et 3");
             nombre = scanner.nextInt();
        }
    }

    public static void exercice5() {

        System.out.println("Entrez le nombre de votre choix");
        int nombre = scanner.nextInt();

        System.out.println("Table de "+ nombre + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre +" x "+ i +" = "+ nombre*i);
        }
    }

    public static void exercice6() {

        System.out.println("Choisissez votre nombre de départ");
        int nombre = scanner.nextInt();

        int resultat = 0;

        for (int i = 0; i <= nombre; i++) {
            resultat = resultat + i;
        }
        System.out.println(" Le résultat selon votre nombre de départ est : " + resultat);
    }

    public static void exercices510() {

        System.out.println("Quel est le prix de l'article HT ?");
        int prixHT = scanner.nextInt();

        System.out.println("Combien avez-vous d'articles ? ");
        int nbArticles = scanner.nextInt();

        System.out.println("Quel est le taux de TVA ?");
        int tauxTVA = scanner.nextInt();


        int prixTTC = (prixHT + (prixHT * tauxTVA / 100)) * nbArticles;

        System.out.println(" Le prix TTC est de : " + prixTTC);

        System.out.println("Combien payez-vous ?");
        float argent = scanner.nextFloat();

        float differenceMonnaie = argent - prixTTC;

        while (differenceMonnaie < 0) {
            System.out.println("Vous n'avez pas donné assez d'argent");
            System.out.println("Combien payez-vous ?");

            argent = scanner.nextFloat();

            differenceMonnaie = argent - prixTTC;
        }

        float[] currency = {500, 200, 100, 50, 20, 10, 2, 1, 0.5F, 0.2F, 0.1F, 0.05F, 0.02F, 0.01F };

        if (differenceMonnaie == 0) {

            System.out.println("Il n'y a pas de monnaie à rendre");

        } else {

            System.out.println("Il faut rendre "+ differenceMonnaie + " euros.");

            for (float valeurCurrency : currency) {

                int quantiteARendre = (int) (differenceMonnaie / valeurCurrency);

                if (quantiteARendre > 0) {

                    differenceMonnaie = differenceMonnaie - (quantiteARendre * valeurCurrency);

                    if (valeurCurrency > 2) {
                        System.out.println(" Il faut rendre " + quantiteARendre + " billets de " + valeurCurrency + " euros.");
                    } else {
                        System.out.println(" Il faut rendre " + quantiteARendre + " pièces de " + valeurCurrency + " euros.");
                    }
                }
            }
        }
    }
}
