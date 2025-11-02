/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.helloworld;

import java.util.Scanner;

/**
 * CE PROGRAMME AFFICHE UN MESSAGE
 * 20/10/2025 premier TP - TP0
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ;
        System.out.println( " ciao le s  " ) ;
        
        String prenom ;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prenom ?");
        prenom = sc.nextLine(); 
        
        System.out.println("Bonjour " + prenom + " !");
        /**
         * j'ajoute la derniere ligne pour faire apparaitre la variable prenom 
         * et qu'elle ne soit pas souligner en jaune avec ecrit que elle n'est jamais
         * fin exercice1
         */
   
    }
    
}