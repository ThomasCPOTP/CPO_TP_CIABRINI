/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tciab
 */
public class Magicien extends Personnage {

    private boolean confirme;

    public Magicien(String nom, int vie, boolean confirme){
        super(nom, vie);
        this.confirme = confirme;
        nbMagiciens++;
    }

    @Override
    public void attaquer(Personnage p){

        int degats = 0;

        if (armeEnMain != null) {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof Baton) {
                degats *= ((Baton) armeEnMain).getAge();
            }

            if (confirme) {
                degats /= 2;
            }

            seFatiguer();
        }

        p.estAttaque(degats);
    }
}
