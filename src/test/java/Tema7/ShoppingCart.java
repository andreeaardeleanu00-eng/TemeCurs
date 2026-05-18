package Tema7;

public class ShoppingCart {

    //5. Creează clasa ShoppingCart:
    //Atribute:
    //●	totalPrice
    //Metode:
    //●	addProduct(double price)
    //●	removeProduct(double price)
    //●	getTotal()
    //Reguli:
    //●	totalPrice nu poate deveni negativ
    //În main:
    //●	adaugă 3 produse
    //●	șterge unul
    //●	afișează totalul

    double totalPrice;

    public void addProduct(double price) {

        totalPrice += price;

    }

    public void removeProduct(double price) {
        if (totalPrice >= price) {
            totalPrice -= price;
        } else {
            System.out.println("Totalul nu poate fi negativ");
        }
    }

        public double getTotalPrice() {
            return totalPrice;
        }
    }

