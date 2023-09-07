package org.example;

import org.example.exercices.Exo1;
import org.example.exercices.Exo2;
import org.example.exercices.Exo3;
import org.example.exercices.ExoString;
import org.example.exercices.TpClasseChaise.Chaise;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        System.out.println("Exercice 1");
//        Exo1.exercice1();
//
//        System.out.println("Exercice 2");
//        Exo1.exercice2();
//
//        System.out.println("Exercice 3");
//        Exo1.exercices3();
//
//        System.out.println("Exercice 4 et 7");
//        Exo1.exercice4And7();
//
//        System.out.println("Exercice 5");
//        Exo1.exercice5();
//
//        System.out.println("Exercice 6");
//        Exo1.exercice6();
//
//        System.out.println("Exercice 8");
//        Exo1.exercice8();

// --------------------------------------------------------------------------
    System.out.println("----------------------Exo2---------------------");

//        System.out.println("Exercice 1");
//        Exo2.exercice1();
//
//        System.out.println("Exercice 2");
//        Exo2.exercice2();
//
//        System.out.println("Exercice 3");
//        Exo2.exercice3();
//
//        System.out.println("Exercice 4");
//        Exo2.exercice4();
//
//        System.out.println("Exercice 5");
//        Exo2.exercice5();
//
//        System.out.println("Exercice 6");
//        Exo2.exercice6();
//
//        System.out.println("Exercice 5.10");
//        Exo2.exercices510();

// --------------------------------------------------------------------------
     System.out.println("----------------------Exo3---------------------");

//        System.out.println("Exercice 1");
//        Exo3.exercice1();
//
//          System.out.println("Exercice 3");
//          Exo3.exercice3();


// --------------------------------------------------------------------------
    System.out.println("----------------------Exo-String---------------------");

//        System.out.println("Exercice Comptage de mot");
//         ExoString.exerciceComptageDeMot();
//
//        System.out.println("Exercice Occurrence");
//        ExoString.exerciceComptageOccurrence();
//
//        System.out.println("Exercice Anagramme");
//         ExoString.exerciceAnagramme("chien","niche");
//
//        System.out.println("Exercice Palindrome");
//        ExoString.exercicePalindrome("kayak", "kayak");
//
//        System.out.println("Exercice Pyramide");
//        ExoString.exercicePyramide();

// --------------------------------------------------------------------------
    System.out.println("----------------------Exo-TpClasseChaise---------------------");

        Chaise chaise1 = new Chaise(4, "Bleu" ,"Bois");
        Chaise chaise2 = new Chaise(4, "Blanche" ,"métal");
        Chaise chaise3 = new Chaise(1, "Transparente" ,"Pléxiglass");

        System.out.println("----- Affichage d'un nouvel objet------");
        System.out.println(chaise1);
        System.out.println("---------------------------------------");
        System.out.println("----- Affichage d'un nouvel objet------");
        System.out.println(chaise2);
        System.out.println("---------------------------------------");
        System.out.println("----- Affichage d'un nouvel objet------");
        System.out.println(chaise3);
        System.out.println("---------------------------------------");
    }
}
