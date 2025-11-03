/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_ciabrini;

/**
 *
 * @author tciab
 */
public class Convertisseur {
    
    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double celsiusVersKelvin(double c) {
        nbConversions++;
        return c + 273.15;
    }

    public double kelvinVersCelsius(double k) {
        nbConversions++;
        return k - 273.15;
    }

    public double celsiusVersFahrenheit(double c) {
        nbConversions++;
        return c * 9.0 / 5.0 + 32.0;
    }

    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }

}
