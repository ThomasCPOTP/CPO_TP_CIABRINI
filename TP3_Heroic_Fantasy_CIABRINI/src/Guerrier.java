/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tciab
 */
public class Guerrier extends Personnage {

    private boolean aCheval;

    public Guerrier(String nom, int vie, boolean aCheval){
        super(nom, vie);
        this.aCheval = aCheval;
        nbGuerriers++;
    }

    @Override
    public void attaquer(Personnage p){

        int degats = 0;

        if (armeEnMain != null) {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof Epee) {
                degats *= ((Epee) armeEnMain).getFinesse();
            }

            if (aCheval) {
                degats /= 2;
            }

            seFatiguer();
        }

        p.estAttaque(degats);
    }
}
