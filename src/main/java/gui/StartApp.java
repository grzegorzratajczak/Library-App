package gui;

import dao.AuthorDaoFile;
import dao.BookDaoFile;

public class StartApp {

    public static void main(String[] args) {

        BookDaoFile bookDaoFile = new BookDaoFile();
        AuthorDaoFile authorDaoFile = new AuthorDaoFile();

        bookDaoFile.loadBooksListFromFile();
        System.out.println(bookDaoFile.toString());

        authorDaoFile.loadAuthorsListFromFile();
        System.out.println(authorDaoFile.toString());
    }

}


