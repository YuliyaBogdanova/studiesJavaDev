package by.bogdanova.L03_02_2025;

//Добавлять книги.
//Выводить список книг.
//Искать книгу по названию.
//Сортировать книги по году издания (новые идут первыми).
//Сортировать книги по году рождения Автора (новые идут первыми).

import by.bogdanova.L30_01_2025.Wheel;

import java.util.Arrays;

public class Library {
    int size;
    Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void add(Book book) {
        if(size < books.length) {
            books[size++] = book;
        }
        else {
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;
        }
    }

    public void printBooks(){
        for( Book book: books){
            System.out.println(book.toString());
        }
    }

    public Book[] sortByAuthorBirthYear() {
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = 0; j < books.length - i - 1; j++) {
                    if (books[j]==null || books[j+1]==null){
                        continue;
                    }
                    if (books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
            return books;
        }

    public Book[] sortByYearPublish () {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j]==null || books[j+1]==null){
                    continue;
                }
                if (books[j].getYear() < books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        return books;
    }

    public Book findBook(String nameBook) {
        Book temp = null;
        for (int i = 0; i < books.length; i++) {
            if (nameBook.equals(books[i].getTitle())) {
                temp = books[i];
                break;
            }
        }
        return temp;
    }


}
