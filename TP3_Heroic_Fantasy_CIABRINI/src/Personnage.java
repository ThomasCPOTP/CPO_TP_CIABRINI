/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tciab
 */
import java.util.ArrayList;

public abstract class Personnage {

    protected String nom;
    protected int vie;
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;

    public static int nbPersonnages = 0;
    public static int nbMagiciens = 0;
    public static int nbGuerriers = 0;

    public Personnage(String nom, int vie){
        this.nom = nom;
        this.vie = vie;
        nbPersonnages++;
    }

    public void ajouterArme(Arme a){
        if (inventaire.size() < 5){
            inventaire.add(a);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes !");
        }
    }

    public void equiper(String nomArme){
        for (Arme a : inventaire){
            if (a.getNom().equals(nomArme)){
                armeEnMain = a;
                System.out.println(nom + " équipe " + nomArme);
                return;
            }
        }
        System.out.println("Arme introuvable !");
    }

    public void seFatiguer(){
        vie -= 10;
    }

    public boolean estVivant(){
        return vie > 0;
    }

    public void estAttaque(int points){
        vie -= points;
    }

    public abstract void attaquer(Personnage p);

    @Override
    public String toString(){
        return nom + " (" + vie + " PV) | Arme : " +
                (armeEnMain == null ? "Aucune" : armeEnMain.toString());
    }
}

