package Tema7;

public class Main {

    public static void main(String [] args) {

        //EXERCITIU 1

        Dog dog1 = new Dog("Luna", 5);
        Dog dog2 = new Dog("Pufi", 2);

        dog1.bark();
        System.out.println(dog1.name + " are " + dog1.getAgeInHumanYears());

        dog2.bark();
        System.out.println(dog2.name + " are " + dog2.getAgeInHumanYears());


        //EXERCITIUL 2

        BankAccount cont = new BankAccount("Andreea Ardeleanu", 500);
        cont.displauBalance();
        cont.deposit(500);
        cont.deposit(300);
        cont.withdraw(200);
        cont.displauBalance();


        //EXERCITIUL 3

        Temperatura temp = new Temperatura(50);
        System.out.println("Temperatura in Fahrenheit " + temp.toFahrenheit() );
        System.out.println("Temperatura in Kelvin " + temp.tokelvin());


        //EXERCITIU 4

        Emplyee emp1 = new Emplyee("Andreea", 4000);
        Emplyee emp2 = new Emplyee("Andrei", 5000);

        emp1.increaseSalary(10);

        System.out.println(emp1.name + " are salariul " + emp1.getSalary() );
        System.out.println(emp2.name + " are salariul " + emp2.getSalary() );


        //EXERCITIUL 5

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(100);
        cart.addProduct(200);
        cart.addProduct(50);
        cart.removeProduct(200);

        System.out.println("Total final " + cart.getTotalPrice() + " lei ");
    }
}
