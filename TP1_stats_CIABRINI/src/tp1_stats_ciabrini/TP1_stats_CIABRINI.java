/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_ciabrini;

/**
 *
 * @author tciab
 */
import java.util.Random;
import java.util.Scanner;

public class TP1_stats_CIABRINI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        int[] faces = new int[6]; // indices 0..5 → faces 1..6
        System.out.print("Nombre de lancers m : ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int tir = rng.nextInt(6); // 0..5
            faces[tir]++;
        }

        System.out.println("Occurrences par face :");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i]);
        }

        System.out.println("Pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pct = 100.0 * faces[i] / m;
            System.out.printf("Face %d : %.2f%%%n", (i + 1), pct);
        }
    }
}
