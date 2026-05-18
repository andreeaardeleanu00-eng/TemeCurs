package Tema7;

public class Emplyee {

    //4. Creează clasa Employee:
    //Atribute:
    //●	name
    //●	salary
    //Metode:
    //●	constructor cu parametri
    //●	increaseSalary(double percent)
    //●	getSalary()
    //În main:
    //●	creează 2 angajați
    //●	crește salariul unuia
    //●	afișează rezultatul

    String name;
    double salary;

    Emplyee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public double getSalary() {
        return salary;
    }
}
