/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.addition;

import java.util.Scanner;

/**
 *
 * @author tciab
 */
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
// initialisation

Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre d'entiers à additionner :");
        nb = sc.nextInt();  // lecture du nombre saisi par l'utilisateur

result=0;
ind=1;
while (ind< nb) {
 result=result+ind;
 ind++;
}
// affichage du resultat
System.out.println("la somme des "+ nb + "entiers est:"+result); } 
    }
    
