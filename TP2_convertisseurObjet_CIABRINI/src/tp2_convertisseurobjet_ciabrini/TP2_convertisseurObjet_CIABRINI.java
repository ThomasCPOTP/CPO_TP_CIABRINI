/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_ciabrini;

/**
 *
 * @author tciab
 */
public class TP2_convertisseurObjet_CIABRINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programme principal
        Convertisseur conv = new Convertisseur();

        System.out.println("0C = " + conv.celsiusVersKelvin(0) + "K");
        System.out.println("273.15K = " + conv.kelvinVersCelsius(273.15) + "C");
        System.out.println("100C = " + conv.celsiusVersFahrenheit(100) + "F");

        System.out.println(conv);
    }
    }
    

