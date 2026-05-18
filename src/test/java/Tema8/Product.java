package Tema8;

public class Product {

    //Exercițiul 2 – Encapsulare cu validare
    //Creează clasa Product:
    //- private name, price
    //- în setter pentru price: nu permite valori <= 0
    //- testează valori valide și invalide

    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Pret invalid. Trebuie sa fie mai mare decat 0");
        }
    }

    public double getPrice() {
        return price;
    }
}
