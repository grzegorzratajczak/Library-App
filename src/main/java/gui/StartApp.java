package gui;

import model.Author;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main(String[] args) {

        Author author1 = new Author("Andrzej", "Sapkowski");

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Wiedzmin - 1", author1));
        bookList.add(new Book("Wiedzmin - 2", author1));
        bookList.add(new Book("Wiedzmin - 3", author1));
        bookList.add(new Book("Wiedzmin - 4", author1));
        bookList.add(new Book("Wiedzmin - 5", author1));

        Author author2 = new Author("John", "Tolkien");

        bookList.add(new Book("Władca pierścieni - 1", author2));
        bookList.add(new Book("Władca pierścieni - 2", author2));
        bookList.add(new Book("Władca pierścieni - 3", author2));

        for (Book book : bookList) {
            System.out.println(book);
            System.out.println(book.getAuthor());
            System.out.println("=========");


        }

    }

}
