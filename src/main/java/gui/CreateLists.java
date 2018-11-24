package gui;

import dao.AuthorDaoFile;
import dao.BookDaoFile;
import model.Author;
import model.Book;

public class CreateLists {

    public static void main(String[] args) {

        BookDaoFile bookDaoFile = new BookDaoFile();
        AuthorDaoFile authorDaoFile = new AuthorDaoFile();

        Author author1 = new Author("Andrzej", "Sapkowski");
        Author author2 = new Author("John", "Tolkien");

        Book book1 = new Book("Wiedzmin - 1", author1);
        Book book2 = new Book("Wiedzmin - 2", author1);
        Book book3 = new Book("Wiedzmin - 3", author1);
        Book book4 = new Book("Wiedzmin - 4", author1);
        Book book5 = new Book("Wiedzmin - 5", author1);
        Book book6 = new Book("Władca pierścieni - 1", author2);
        Book book7 = new Book("Władca pierścieni - 2", author2);
        Book book8 = new Book("Władca pierścieni - 3", author2);

        authorDaoFile.save(author1);
        authorDaoFile.save(author2);
        authorDaoFile.saveAuthorToFile();

        bookDaoFile.save(book1);
        bookDaoFile.save(book2);
        bookDaoFile.save(book3);
        bookDaoFile.save(book4);
        bookDaoFile.save(book5);
        bookDaoFile.save(book6);
        bookDaoFile.save(book7);
        bookDaoFile.save(book8);
        bookDaoFile.saveBookToFile();

    }
}
