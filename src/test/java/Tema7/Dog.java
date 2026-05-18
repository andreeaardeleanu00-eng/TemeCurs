package Tema7;

public class Dog {

    //1. Creează clasa Dog:
    //Atribute:
    //●	name
    //●	age
    //Metode:
    //●	bark() → afișează: „Câinele <name> latră”
    //●	getAgeInHumanYears() → returnează age * 7
    //În main:
    //●	creează 2 obiecte
    //●	apelează metodele


    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Cainele " + name + " latra");
    }

    public int getAgeInHumanYears() {
        return age * 7;
    }
}
