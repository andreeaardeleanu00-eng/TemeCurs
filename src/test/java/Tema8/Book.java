package Tema8;

public class Book {

    //Exercițiul 1 – Encapsulare (basic)
    //Creează clasa Book:
    //- atribute private: title, author
    //- getter + setter pentru fiecare
    //- în main: creează obiect, setează valori, afișează-le

    private String title;
    private String author;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
