/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_ciabrini;

/**
 *
 * @author tciab
 */
public class TP2_Bieres_CIABRINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0, "Dubuisson");
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");

        uneBiere.lireEtiquette();
        autreBiere.lireEtiquette();

        System.out.println(uneBiere);
        uneBiere.decapsuler();
        System.out.println(uneBiere);
        uneBiere.decapsuler(); // teste la condition d’erreur
    }
    }
    

