/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_ciabrini;

public class TP2_manip_CIABRINI {

    public static void main(String[] args) {

        // 4. Création de deux tartiflettes avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // On rajoute l’instruction suivante
        Tartiflette assiette3 = assiette2;

        // Affichage du nombre de calories de assiette2 et assiette3
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // On incrémente seulement les calories d’une tartiflette (assiette2)
        assiette2.nbCalories += 100;

        System.out.println("Après modification :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // 5. Inverser les objets référencés par assiette1 et assiette2
        Tartiflette tmp = assiette1;
        assiette1 = assiette2;
        assiette2 = tmp;

        System.out.println("Après échange des assiettes 1 et 2 :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

        // 6. Ces lignes sont FAUSSES (types incompatibles), on les laisse en commentaire :
        // Moussaka assiette666 = assiette1;         // impossible : Tartiflette != Moussaka
        // Moussaka assiette667 = new Tartiflette(); // impossible : le type déclaré est Moussaka

        // 7. Tableau de 10 références de Moussaka + création de 10 objets
        Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(700 + 10 * i); // valeurs au pif pour tester
        }

        // Petit affichage pour vérifier
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
}

