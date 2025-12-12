/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tciab
 */
public class CadenasJeu {

    public enum Difficulte {
    FACILE(15),
    NORMAL(10),
    IMPOSSIBLE(5);

    private final int maxEssais;

    Difficulte(int maxEssais) {
        this.maxEssais = maxEssais;
    }

    public int getMaxEssais() {
        return maxEssais;
    }
}

    private int[] codeSecret = new int[4];
    private int tentatives = 0;
    private Difficulte difficulte = Difficulte.NORMAL;
    private int tentativesMax = difficulte.getMaxEssais();



    public CadenasJeu() {
        genererCode();
    }

    public void genererCode() {
        tentatives = 0;
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < 4; i++) {
            codeSecret[i] = r.nextInt(10);
        }
        tentatives = 0;
    }

    public int getTentatives() {
        return tentatives;
    }
    
    public int getTentativesMax() {
    return tentativesMax;
}

    
    public void setDifficulte(Difficulte d) {
    this.difficulte = d;
    this.tentativesMax = d.getMaxEssais();
    genererCode(); // reset partie + remet tentatives à 0
}

public Difficulte getDifficulte() {
    return difficulte;
}


    /**
     * Compare la combinaison proposée
     * @return tableau [chiffresExacts, tropHaut, tropBas]
     */
    public int[] tester(int[] entree) {

        tentatives++;

        int exact = 0;
        int haut = 0;
        int bas = 0;

        for (int i = 0; i < 4; i++) {
            if (entree[i] == codeSecret[i]) {
                exact++;
            } else if (entree[i] > codeSecret[i]) {
                haut++;
            } else {
                bas++;
            }
        }

        return new int[]{ exact, haut, bas };
    }
//zdzdzdzdzd
   public boolean partieTerminee() {
    return tentatives >= tentativesMax;
}
}