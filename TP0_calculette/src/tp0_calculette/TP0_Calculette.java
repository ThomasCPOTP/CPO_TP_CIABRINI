/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;


/**
 *
 * @author tciab
 */
import java.util.Scanner; // j'ai fais ça au lieu de cliquer sur l'ampoule jaune je sais pas pourquoi ça marchait pas

public class TP0_Calculette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        
        int operateur = sc.nextInt();

       
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide !");
        } else {
         
            System.out.println("Please enter the first number:");
            int operande1 = sc.nextInt();

            System.out.println("Please enter the second number:");
            int operande2 = sc.nextInt();

            int resultat = 0; 
            boolean erreur = false; // pour gérer la division par zéro

            
            switch (operateur) {
                case 1: // addition
                    resultat = operande1 + operande2;
                    break;
                case 2: // soustraction
                    resultat = operande1 - operande2;
                    break;
                case 3: // multiplication
                    resultat = operande1 * operande2;
                    break;
                case 4: // division
                    if (operande2 == 0) {
                        System.out.println("Erreur : division par zéro impossible !");
                        erreur = true;
                    } else {
                        resultat = operande1 / operande2;
                    }
                    break;
                case 5: // modulo
                    if (operande2 == 0) {
                        System.out.println("Erreur : modulo par zéro impossible !");
                        erreur = true;
                    } else {
                        resultat = operande1 % operande2;
                    }
                    break;
            }

            // resulata
            if (!erreur) {
                System.out.println("The result is : " + resultat);
            }
        }
    }
}
