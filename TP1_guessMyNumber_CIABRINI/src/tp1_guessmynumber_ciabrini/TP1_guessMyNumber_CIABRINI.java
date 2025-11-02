/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_ciabrini;

/**
 *
 * @author tciab
 */
import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_CIABRINI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        // Démo : 5 nombres aléatoires
        for (int i = 0; i < 5; i++) {
            int n = rng.nextInt(101); // 0..100 inclus
            System.out.println("Demo random: " + n);
        }

        // Choix difficulté
        System.out.println("""
                Choisissez la difficulté :
                1) Facile   (0..50, 12 essais)
                2) Normal   (0..100, 10 essais)
                3) Difficile(0..500, 9 essais)
                """);
        int diff = sc.nextInt();

        int max = switch (diff) { case 1 -> 50; case 3 -> 500; default -> 100; };
        int essaisMax = switch (diff) { case 1 -> 12; case 3 -> 9; default -> 10; };

        int secret = rng.nextInt(max + 1);
        int essais = 0;
        boolean gagne = false;

        System.out.println("Devine un nombre entre 0 et " + max + " (" + essaisMax + " essais).");

        while (essais < essaisMax && !gagne) {
            System.out.print("Propose : ");
            int x = sc.nextInt();
            essais++;

            if (x == secret) {
                gagne = true;
            } else if (x < secret) {
                System.out.println("Trop petit.");
            } else {
                System.out.println("Trop grand.");
            }
        }

        if (gagne) {
            System.out.println("Gagné en " + essais + " tentative(s) !");
        } else {
            System.out.println("Perdu. Le nombre était " + secret + ".");
        }
    }
}

