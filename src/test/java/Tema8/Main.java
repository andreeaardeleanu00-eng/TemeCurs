package Tema8;


public class Main {

    public static void main(String [] args) {

        //EXERCITIU 1

        Book book = new Book();

        book.setTitle("Amintiri din copilarie");
        book.setAuthor(("Ion Creanga"));

        System.out.println("Titlu: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());



        //EXERCITIU 2



        Product product1 = new Product();

        //valori valide

        product1.setName("Laptop");
        product1.setPrice(3000);

        System.out.println("Produsul este: " + product1.getName() + " si costa " + product1.getPrice());


        //valoare invalida


        product1.setPrice(-100);

        System.out.println(" Produsul este: " + product1.getName() + "si costa " + product1.getPrice());


        //EXERCITIU 4


        Phone phone1 = new Phone();

        phone1.powerOn();
        phone1.call();


        //EXERCIITU 5

        AdminAccount admin = new AdminAccount();

        admin.setUsername("Andreea2402");
        admin.login();
        admin.deleteUser();




    }
}
