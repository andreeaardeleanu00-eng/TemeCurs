package Tema7;

public class BankAccount {

    //2. Creează clasa BankAccount:
    //Atribute:
    //●	ownerName
    //●	balance
    //Metode:
    //●	deposit(double amount)
    //●	withdraw(double amount)
    //●	displayBalance()
    //Reguli:
    //●	nu permite retragere dacă balance < amount
    //În main:
    //●	creează un cont
    //●	fă 2 depuneri și 1 retragere

    String ownerName;
    double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("S-au depus " + amount + " lei");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("S-au retras " + amount + " lei");
        } else {
            System.out.println("Fonduri insuficiente");
        }
    }

    public void displauBalance() {
        System.out.println( "Sold curelt:" + balance + " lei");
    }
}
