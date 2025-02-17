package by.bogdanova.L03_02_2025;

public class Book {
    private String title;
    private Author author;

    public int getYear() {
        return year;
    }

    private int year;

    Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title + " (" + year + ") " + author.toString();
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
