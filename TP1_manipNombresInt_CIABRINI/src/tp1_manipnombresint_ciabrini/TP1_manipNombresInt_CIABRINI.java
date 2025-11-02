/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_ciabrini;

/**
 *
 * @author tciab
 */
import java.util.Scanner;

public class TP1_manipNombresInt_CIABRINI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le second entier : ");
        int b = sc.nextInt();

        System.out.println("Somme        : " + (a + b));
        System.out.println("Difference   : " + (a - b));
        System.out.println("Produit      : " + (a * b));

        // Division entière et reste (euclidienne)
        System.out.println("Quotient int : " + (a / b));
        System.out.println("Reste        : " + (a % b));

        // Division exacte en double (point cours)
        System.out.println("Division réelle : " + (a / (b * 1.0)));
    }
}

// je ne sais pas pourquoi les "é" ne s'affichent pas 
/*
donc les triangles avec des points d'interogations sont des é
*/
