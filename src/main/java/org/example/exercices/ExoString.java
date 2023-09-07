package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class ExoString {

    static Scanner scanner = new Scanner(System.in);

    public static void exerciceComptageDeMot() {

        System.out.println("Ecrivez une phrase");
        String phrase = scanner.nextLine();

        int mot = 0;

        String segments[] = phrase.split(" ");

        for (int i = 0; i < segments.length; i++) {
            mot += 1;
        }

        System.out.println("Dans la phrase, il y a " + mot);
    }

    public static void exerciceComptageOccurrence() {

        System.out.println("Ecrivez un mot");
        String mot = scanner.next();

        System.out.println("Ecrivez la lettre que vous souhaitez compter");
        String lettre = scanner.next();
        char letter = lettre.charAt(0);

        char motArr[] = mot.toCharArray();

        int count = 0;

        for (char c : motArr) {
            if (c == letter) {
                count++;
            }

            System.out.println("Il y a " + count + " fois la lettre " + lettre + " dans le mot " + mot + ".");
        }
    }

    public static void exerciceAnagramme(String mot1, String mot2) {

        // On vérifie s'ils ont le meme nombre de lettre
        if ( mot1.length() < mot2.length() || mot1.length() > mot2.length()){
            System.out.println("Ces mots n'ont pas le meme nombre de lettres, ils ne peuvent pas être des anagrammes !");
        }

        // On créé un tableau de chaque caractére pour chaque mot
        String mot1Arr[] = mot1.split("");
        String mot2Arr[] = mot2.split("");


        int verifyAnagramme = mot1Arr.length;

        // On vérifie si chaque lettre du mot 1 existe dans le mot 2
        // On remplace la lettre pour etre certain de ne pas l'avoir 2x fois
        // On décremente Verify Anagramme

        for (int i = 0; i < mot2Arr.length; i++) {
            for (int j = 0; j < mot2Arr.length; j++) {
                if (mot1Arr[i].equals(mot2Arr[j])) {
                    mot2Arr[j] = "$";
                    verifyAnagramme--;
                }
            }
        }

        // On affiche selon la logique du programme
        // Si toutes les lettres sont ok, alors verifyAnagramme = 0, sinon verifyAnagramme > 0

        if (verifyAnagramme == 0)
        {
            System.out.println(mot1+ " et " + mot2 + " sont des anagrammes");
        } else {
            System.out.println(mot1+ " et " + mot2 + " ne sont pas des anagrammes");
        }

    }


    public static void exercicePalindrome(String mot1, String mot2) {

        // On vérifie s'ils ont le meme nombre de lettre
        if ( mot1.length() < mot2.length() || mot1.length() > mot2.length()){
            System.out.println("Ces mots n'ont pas le meme nombre de lettres, ils ne peuvent pas être des palindromes !");
        }


        // On créé un tableau de chaque caractére pour chaque mot
        String mot1Arr[] = mot1.split("");
        String mot2Arr[] = mot2.split("");

        // On créé un element C qui nous servira de comparaison
        String motComparaisonArr[] = new String[mot1Arr.length];

        // Logique : on inverse mot1Arr et motComparaisonArr
        // Si motComparaisonArr == mot2Arr alors ils sont des palindromes
        // Pour se faire, on passe par le compteur verifyPalindrome
        for (int i = 0; i < mot1Arr.length; i++) {
            motComparaisonArr[i] = mot1Arr[((mot1Arr.length -1) - i)];
        }

        int verifyPalindrome = 0;

        for (int i = 0; i < mot1Arr.length; i++) {
            if ( motComparaisonArr[i].equals(mot2Arr[i])) {
                verifyPalindrome++;
            }
        }

        // On affiche le résultat
        // Meme logique que l'exercice Anagramme
        if (verifyPalindrome == mot1Arr.length)
        {
            System.out.println(mot1 + " et "+ mot2 + " est un palindrome");
        } else {
            System.out.println(mot1 + " et "+ mot2 + " n'est pas un palindrome");
        }
    }

    public static void exercicePyramide() {

        System.out.println("Entrez la hauteur de la pyramide");
        int hauteurPyramide = scanner.nextInt();

        for (int i = 0; i < hauteurPyramide; i++) {

            int j = 0;

            while (j < i) {
            System.out.print("*");
            j++;
            };

            System.out.println("*");
        }

        for (int i = (hauteurPyramide -1); i > 0 ; i--) {

            int j = 1;

            while (j < i) {
                System.out.print("*");
                j++;
            };

            System.out.println("*");

        }

    }
}