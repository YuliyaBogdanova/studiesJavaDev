package by.bogdanova.L03_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Library library = new Library(6);

        Author tolkien = new Author("Джон", "Толкин", 1892);
        Book lordOfTherings = new Book("Властелин колец", tolkien, 1955);
        library.add(lordOfTherings);
        Book lordOfTherings2 = new Book("Властелин колец-2", tolkien, 1965);
        library.add(lordOfTherings2);

        Author pushkin = new Author("Адлександр", "Пушкин", 1799);
        Book matches = new Book("Шесть спичек", pushkin, 1960);
        library.add(matches);
        Book matches2 = new Book("Шесть спичек-2", pushkin, 1961);
        library.add(matches2);

        Author tolstoy = new Author("Лев", "Толстой", 1828);
        Book childhood = new Book("Детство", tolstoy, 1852);
        library.add(childhood);
        Book childhood2 = new Book("Отрочество", tolstoy, 1854);
        library.add(childhood2);

        System.out.println();
        library.printBooks();
        System.out.println("Поиск книги 'Отрочество':");
        library.findBook("Отрочество");

        System.out.println();
        System.out.println("Книги после сортировки по году издания:");
        library.sortByYearPublish();
        library.printBooks();

        System.out.println();
        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortByAuthorBirthYear();
        library.printBooks();




    }

}
