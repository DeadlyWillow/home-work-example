package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Евгений Онегин", "Александр Сергеевич Пушкин", 1833);
        System.out.println("Название книги: " + book.getName());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год публикации: " + book.getYear());

        Author author = new Author("Александр", "Пушкин");
        System.out.println("Имя автора: " + author.getFirstName());
        System.out.println("Фамилия автора: " + author.getLastName());

        book.setYear(1833);
        System.out.println("setYear() = " + book.getYear());

        Book thePrince = new Book("Государь", "Никколо Макиавелли", 1532);
        Author Machiavelli = new Author("Никколо", "Макиавелли");
        System.out.println("Название книги: " + thePrince.getName());
        System.out.println("Автор: " + thePrince.getAuthor());
        System.out.println("Год публикации: " + thePrince.getYear());
        System.out.println("Имя автора: " + Machiavelli.getFirstName());
        System.out.println("Фамилия автора: " + Machiavelli.getLastName());

        Book Childhood = new Book("Детство", "Лев Николаевич Толстой", 1852);
        Author Tolstoy = new Author("Лев", "Толстой");
        System.out.println("Название книги: " + Childhood.getName());
        System.out.println("Автор: " + Childhood.getAuthor());
        System.out.println("Год публикации: " + Childhood.getYear());
        System.out.println("Имя автора: " + Tolstoy.getFirstName());
        System.out.println("Фамилия автора: " + Tolstoy.getLastName());
    }
}
