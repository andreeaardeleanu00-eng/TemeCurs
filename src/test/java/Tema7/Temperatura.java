package Tema7;

public class Temperatura {

    //3. Creează clasa Temperature:
    //Atribute:
    //●	celsius
    //Metode:
    //●	toFahrenheit() → returnează conversia
    //●	toKelvin() → returnează conversia
    //Formule:
    //●	F = C * 9/5 + 32
    //●	K = C + 273.15
    //În main:
    //●	creează obiect și afișează valorile

    double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }

    public double tokelvin() {
        return celsius + 273.15;
    }
}
