package org.example;

public class Tema1 {

    public static void main(String[] args) {

        int varsta = 22;
        double inaltime = 175;
        boolean prezent = true;

        System.out.println("Studentul are varsta de " + varsta + " ani ");
        System.out.println("Studentul are inaltimea de " + inaltime + " cm ");
        System.out.println("Este prezent studentul la curs? " + prezent);

        int numar1 = 10;
        int numar2 = 20;
        double numar3 = 15.5;

        int suma = numar1 + numar2;
        double media = (numar1 + numar2 + numar3) / 3;

        System.out.println("Suma celor 2 numere este:" + suma);
        System.out.println("Media celor 3 numere este:" + media);


        int varsta2 = 20;

        if (varsta >= 18) {
            System.out.println("Access permis");
        } else {
            System.out.println("Access interzis");
        }

        int suma1 = 0;

        for (int i = 20; i <= 50; i++) {
            suma1 = suma1 + i;
        }

        System.out.println("Suma numerelor este:" + suma1);


        int x = 10;

        while (x >= 1) {
            System.out.println(x);
            x--;
        }

        afisareMesaj();

        int rezultat = sumaNumere(5, 7);
        System.out.println("Suma parametrilor este " + rezultat);

        int rezultatPare = sumaNumerePare() ;
        System.out.println("Suma numerelor pare este " + rezultatPare);

        double rezultatMedia = mediaTreiNumere(4, 8, 10);
        System.out.println("Media celor 3 parametrii este " + rezultatMedia);

    }

    public static void afisareMesaj() {
        System.out.println("Invat Java");

    }

    public static int sumaNumere(int a, int b) {
        return a + b;
    }

    public static int sumaNumerePare() {
        int suma = 0;

        for (int i = 1; i <=50; i++) {
            if (i % 2 ==0) {
                suma = suma + i ;
            }
        }

        return suma;
    }

    public static double mediaTreiNumere(double a, double b, double c) {

        return (a + b + c) / 3.0;
    }

}


