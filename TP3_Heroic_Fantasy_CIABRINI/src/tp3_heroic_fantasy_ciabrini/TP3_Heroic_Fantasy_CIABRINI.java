/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_ciabrini;

/**
 *
 * @author tciab
 */
public class TP3_Heroic_Fantasy_CIABRINI {

    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

        conan.ajouterArme(excalibur);
        conan.ajouterArme(charme);

        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(durandal);

        conan.equiper("Excalibur");
        gandalf.equiper("Chêne");

        gandalf.attaquer(conan);
        conan.attaquer(gandalf);

        System.out.println("\n--- PERSONNAGES ---");
        System.out.println(gandalf);
        System.out.println(conan);
    }
}
